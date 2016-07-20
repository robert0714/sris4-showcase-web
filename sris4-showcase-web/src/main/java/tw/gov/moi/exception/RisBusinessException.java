 
package tw.gov.moi.exception;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.reflect.FieldUtils;

import tw.gov.moi.ae.codetable.RisMsgComponent;
import tw.gov.moi.util.RISContextUtil;

/**
 * RIS BusinessException.
 */
public class RisBusinessException extends RuntimeException {

    //================================================
    //== [Enumeration types] Block Start
    //====
    //====
    //== [Enumeration types] Block End 
    //================================================
    //== [static variables] Block Start
    //====

    /** Logger Object. */
    private static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(RisBusinessException.class);

    //    /** 規則字串 */
    //    private static transient String regexString = "^[A-Z0-9-]*-[SIWEF]$";
    //    /** 字串樣版 */
    //    private static transient Pattern pattern = Pattern.compile(regexString);

    /** serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 處理字串替換過的 ErrorCode ENUMS */
    private static final Set<Class<? extends ErrorCode>> PROCESSED_ENUM = new HashSet<Class<? extends ErrorCode>>();

    //====
    //== [static variables] Block Stop 
    //================================================
    //== [instance variables] Block Start
    //====

    /** 錯誤碼 */
    private String errorCode;

    /** 額外訊息，不一定要輸入 */
    private String extMessage = "";

    //====
    //== [instance variables] Block Stop 
    //================================================
    //== [static Constructor] Block Start
    //====

    //====
    //== [static Constructor] Block Stop 
    //================================================
    //== [Constructors] Block Start (含init method)
    //====

    /**
     * Constructors.
     * @param e cause exception
     */
    public RisBusinessException(RisBusinessException e) {
        this(e.getErrorCode(), e.getExtMessage(), e);
    }

    /**
     * Constructor.
     * @param errorCode 錯誤代碼
     */
    public RisBusinessException(ErrorCode errorCode) {
        super(genExceptionMessage(errorCode));
        this.errorCode = errorCode.getCode();
    }

    /**
     * Constructor.
     * @param errorCode 錯誤代碼
     * @param cause 例外原因
     */
    public RisBusinessException(ErrorCode errorCode, Throwable cause) {
        super(genExceptionMessage(errorCode), cause);
        this.errorCode = errorCode.getCode();
    }

    /**
     * Constructor.
     * @param errorCode 錯誤代碼
     * @param extMessage 額外訊息
     */
    public RisBusinessException(ErrorCode errorCode, String extMessage) {
        super(genExceptionMessage(errorCode, extMessage));
        this.errorCode = errorCode.getCode();
        this.extMessage = extMessage;
    }

    /**
     * Constructor.
     * @param errorCode 錯誤代碼
     * @param extMessage 額外訊息
     * @param cause 例外原因
     */
    public RisBusinessException(ErrorCode errorCode, String extMessage, Throwable cause) {
        super(genExceptionMessage(errorCode, extMessage), cause);
        this.errorCode = errorCode.getCode();
        this.extMessage = extMessage;
    }

    /**
     * 建構式
     * 
     * @param errorCode 錯誤代碼
     * @param extMessage 額外訊息
     * @param cause 例外原因
     * @deprecated 不應使用字串為參數，易輸入無效代碼.
     */
    @Deprecated
    public RisBusinessException(String errorCode, String extMessage, Throwable cause) {
        super(genExceptionMessage(errorCode, extMessage), cause);
        this.errorCode = errorCode;
        this.extMessage = extMessage;
    }

    /**
     * 建構式
     * 
     * @param errorCode 錯誤代碼
     * @param cause 例外原因
     * @deprecated 不應使用字串為參數，易輸入無效代碼.
     */
    @Deprecated
    public RisBusinessException(String errorCode, Throwable cause) {
        super(genExceptionMessage(errorCode), cause);
        this.errorCode = errorCode;
    }

    /**
     * 建構式
     * 
     * @param errorCode 錯誤代碼
     * @param extMessage 額外訊息
     * @deprecated 不應使用字串為參數，易輸入無效代碼.
     */
    @Deprecated
    public RisBusinessException(String errorCode, String extMessage) {
        super(genExceptionMessage(errorCode, extMessage));
        this.errorCode = errorCode;
        this.extMessage = extMessage;
    }

    /**
     * 建構式
     * 
     * @param errorCode 錯誤代碼
     * @deprecated 不應使用字串為參數，易輸入無效代碼.
     */
    @Deprecated
    public RisBusinessException(String errorCode) {
        super(genExceptionMessage(errorCode));
        this.errorCode = errorCode;
    }

    //====
    //== [Constructors] Block Stop 
    //================================================
    //== [Static Method] Block Start
    //====

    /** 產製訊息全文. */
    private static String genExceptionMessage(ErrorCode errCode) {
        return genExceptionMessage(errCode, null);
    }

    public static final String RISCODE_COMPONENT = "risCodeComponent";

    /** 產製訊息全文. */
    private static String genExceptionMessage(ErrorCode errCode, String extMsg) {

        synchronized (PROCESSED_ENUM) {
            final Class<? extends ErrorCode> class1 = errCode.getClass();
            if (!PROCESSED_ENUM.contains(class1)) {
                final RisMsgComponent risCodeComponent = lookupRisCodeComponent();
                if (risCodeComponent != null && class1.isEnum()) {
                    final ErrorCode[] enumConstants = class1.getEnumConstants();
                    for (ErrorCode errorCode : enumConstants) {
                        final String code = errorCode.getCode();
                        final String mesgByCode = risCodeComponent.getMesgByCode(code);
                        if (StringUtils.isNotBlank(mesgByCode) && !"＜代碼未定義＞".equals(mesgByCode)) {
                            try {
                                FieldUtils.writeDeclaredField(errorCode, "message", mesgByCode, true);
                            } catch (Exception e) {
                                break;
                            }
                        }
                    }
                }
                PROCESSED_ENUM.add(class1);
            }
        }
        if (extMsg == null) {
            return String.format("[%s] %s", errCode.getCode(), errCode.getMessage());
        } else {
            return String.format("[%s] %s：%s", errCode.getCode(), errCode.getMessage(), extMsg);
        }
    }

    /**
     * @return
     */
    private static RisMsgComponent lookupRisCodeComponent() {
        RisMsgComponent risCodeComponent = null;
        try {
            risCodeComponent = (RisMsgComponent) RISContextUtil.getBean(RISCODE_COMPONENT);
        } catch (Throwable e1) {
            try {
                risCodeComponent = RISContextUtil.getBean(RisMsgComponent.class);
            } catch (Throwable e) {
                LOGGER.warn("", e);
            }
        }
        return risCodeComponent;
    }

    /** 產製訊息全文. */
    private static String genExceptionMessage(String errCode) {
        return genExceptionMessage(errCode, null);
    }

    /** 產製訊息全文. */
    private static String genExceptionMessage(String errCode, String extMsg) {
        try {
            String errMsg = null;
            final RisMsgComponent risCodeComponent = lookupRisCodeComponent();
            if (risCodeComponent != null) {
                errMsg = risCodeComponent.getMesgByCode(errCode);
            }
            if (extMsg == null) {
                return String.format("[%s] %s", errCode, errMsg);
            } else {
                return String.format("[%s] %s：%s", errCode, errMsg, extMsg);
            }
        } catch (Exception e) {
            return String.format("[%s]:%s:(RisBusinessExcepiton Error:%s)", errCode, extMsg, e.getMessage());
        }
    }

    //====
    //== [Static Method] Block Stop 
    //================================================
    //== [Accessor] Block Start
    //====

    /**
     * 取得錯誤碼
     * 
     * @return 錯誤碼
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * 取得額外訊息
     * 
     * @return 回傳額外訊息
     */
    public String getExtMessage() {
        return this.extMessage;
    }

    //====
    //== [Accessor] Block Stop 
    //================================================
    //== [Overrided Method] Block Start (Ex. toString/equals+hashCode)
    //====
    //====
    //== [Overrided Method] Block Stop 
    //================================================
    //== [Method] Block Start
    //====
    //####################################################################
    //## [Method] sub-block : 
    //####################################################################    

    /**
     * 代碼意義 (尾碼)
     * @return 代碼意義 (尾碼)
     */
    public String getLevel() {
        return StringUtils.right(this.errorCode, 1);
    }

    /**
     * 代碼意義為成功或失敗.
     * @return TRUE:代碼意義為成功. FALSE:代碼意義為失敗.
     */
    public boolean isSuccess() {
        final String level = getLevel();
        if ("E".equals(level) || "F".equals(level)) {
            return false;
        }
        return true;
    }

    //====
    //== [Method] Block Stop 
    //================================================

}
