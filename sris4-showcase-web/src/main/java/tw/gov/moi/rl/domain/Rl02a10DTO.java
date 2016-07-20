/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Xldf004mType;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.component.dto.XLDFTransaction;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;
import tw.gov.moi.rs.dto.RsIdCardLossDTO;

/**
 * 國民身分證領請 DTO.
 * 
 * @author Weiren.Jheng
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl02a10DTO", propOrder = { "xldfPersonData", "infoList", "info", "attachment", "otherAttachment",
        "apply1", "apply2", "rl02a10App", "delegated", "xldfMap", "personMapData", "openingOperationDTO",
        "showComplete", "disabledTempSave", "showPrint", "showRealSaveList", "xldf004mTypeList", "apply1CountyCode",
        "apply2CountyCode", "delegatedCountyCode", "message", "xldfTransaction", "xldfTxnPersonDTO",
        "disabledVerifyBt", "applySeq", "fromL1", "errBirthPlace", "receiptId", "sendEmailList", "warningMessgeList",
        "initSuccess", "controlBtn", "rlWarningMessageList" })
@XmlRootElement(name = "Rl02a10DTO")
public class Rl02a10DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 當事人資料. */
    @XmlElement(name = "XldfPersonData")
    @FieldName("當事人資料")
    private XLDFPersonDataDomainObject xldfPersonData;

    /** 當事人清單. */
    @XmlElement(name = "InfoList")
    @FieldName("當事人清單")
    private List<Rl02a10Info> infoList = new ArrayList<Rl02a10Info>();

    /** 當事人資料. */
    @XmlElement(name = "Info")
    @FieldName("當事人資料")
    private Rl02a10Info info = new Rl02a10Info();

    /** 附繳證件. */
    @XmlElement(name = "Attachment")
    @FieldName("附繳證件")
    private String[] attachment;

    /** 附繳證件說明. */
    @XmlElement(name = "OtherAttachment")
    @FieldName("附繳證件說明")
    private String otherAttachment;

    /** 申請人1. */
    @XmlElement(name = "Apply1")
    @FieldName("申請人1")
    private XLDFApplicantDataDTO apply1 = new XLDFApplicantDataDTO();

    /** 申請人2. */
    @XmlElement(name = "Apply2")
    @FieldName("申請人2")
    private XLDFApplicantDataDTO apply2 = new XLDFApplicantDataDTO();

    /** 申請資料. */
    @XmlElement(name = "Rl02a10App")
    @FieldName("申請資料")
    private Rl02A10AppDataDTO rl02a10App = new Rl02A10AppDataDTO();

    /** 受委託人. */
    @XmlElement(name = "Delegated")
    @FieldName("受委託人")
    private XLDFPersonBriefDataDTO delegated = new XLDFPersonBriefDataDTO();

    /** 當事人的 XLDF 資料. */
    @XmlElement(name = "xldfMap")
    @FieldName("當事人的 XLDF 資料")
    private Map<String, XLDFDomainObject> xldfMap = new HashMap<String, XLDFDomainObject>();

    /** The person map data. */
    @XmlElement(name = "PersonMapData")
    @FieldName("當人事的申請資料")
    private Map<String, Object> personMapData = new HashMap<String, Object>();

    /** The opening operation dto. */
    @XmlElement(name = "OpeningOperationDTO")
    @FieldName("作業順序DTO")
    private OpeningOperationDTO openingOperationDTO;

    /** 顯示完成按鈕. */
    @XmlElement(name = "ShowComplete")
    @FieldName("顯示完成按鈕")
    private boolean showComplete = Boolean.FALSE;

    /** 顯示暫存按鈕. */
    @XmlElement(name = "DisabledTempSave")
    @FieldName("顯示暫存按鈕")
    private boolean disabledTempSave = Boolean.TRUE;

    /** 顯示列印申請書按鈕. */
    @XmlElement(name = "ShowPrint")
    @FieldName("顯示列印申請書按鈕")
    private boolean showPrint = Boolean.FALSE;

    /** The show real save list. */
    @XmlElement(name = "ShowRealSaveList")
    @FieldName("顯示真的已存檔的資料")
    private boolean showRealSaveList = Boolean.FALSE;

    /** The xldf004m type list. */
    @XmlElement(name = "Xldf004mTypeList")
    @FieldName("當事人們的資料")
    private List<Xldf004mType> xldf004mTypeList = new ArrayList<Xldf004mType>();

    /** 申請人1 縣市代碼. */
    @XmlElement(name = "Apply1CountyCode")
    @FieldName("申請人1 縣市代碼")
    private String apply1CountyCode = "";

    /** 申請人2 縣市代碼. */
    @XmlElement(name = "Apply2CountyCode")
    @FieldName("申請人2 縣市代碼")
    private String apply2CountyCode = "";

    /** 受委託人 縣市代碼. */
    @XmlElement(name = "DelegatedCountyCode")
    @FieldName("受委託人 縣市代碼")
    private String delegatedCountyCode = "";

    /** The message. */
    @XmlElement(name = "Message")
    @FieldName("訊息")
    private String message = "";

    /** xldfTransaction. */
    @XmlElement(name = "XldfTransaction")
    @FieldName("臨時交易物件")
    private XLDFTransaction xldfTransaction;

    /** 當事人申請資料. */
    @XmlElement(name = "xldfTxnPersonDTO")
    @FieldName("當事人申請資料")
    private XLDFTxnPersonDTO xldfTxnPersonDTO;

    /** 「資料驗證」按鈕. */
    @XmlElement(name = "DisabledVerifyBt")
    @FieldName("「資料驗證」按鈕")
    private boolean disabledVerifyBt = true;

    /** 申請書申請件數. */
    @XmlElement(name = "ApplySeq")
    @FieldName("申請書申請件數")
    private int applySeq = 0;

    /**
     * 從 L1 進入.<BR>
     * default:true
     */
    @XmlElement(name = "FromL1")
    @FieldName("從 L1 進入")
    private boolean fromL1 = true;

    /** 出生地錯誤人員清單. */
    @XmlElement(name = "ErrBirthPlace")
    @FieldName("出生地錯誤旗標")
    private boolean errBirthPlace = false;

    /** 收據號碼. */
    @XmlElement(name = "receiptId")
    @FieldName("收據號碼")
    private String receiptId = "";

    /** 國民身分證掛失寄發電子信箱清單. */
    @XmlElement(name = "SendEmailList")
    @FieldName("國民身分證掛失寄發電子信箱清單")
    private List<RsIdCardLossDTO> sendEmailList = new ArrayList<RsIdCardLossDTO>();

    /** 警告訊息清單 */
    @FieldName("警告訊息清單")
    @XmlElement(name = "WarningMessgeList", required = false)
    private List<RlWarningMessage> warningMessgeList = new ArrayList<RlWarningMessage>();

    /**
     * 是否初始化成功.<BR>
     * default:true
     */
    @XmlElement(name = "InitSuccess", required = false)
    @FieldName("是否初始化成功")
    private boolean initSuccess = true;

    /**
     * 是否可以控制按鈕.<BR>
     * default:false
     */
    @XmlElement(name = "ControlBtn", required = false)
    @FieldName("是否可以控制按鈕")
    private boolean controlBtn = false;

    /** 警告訊息清單. */
    @XmlElement(name = "RlWarningMessageList")
    @FieldName("警告訊息清單")
    private List<RlWarningMessage> rlWarningMessageList = new ArrayList<RlWarningMessage>();

    /**
     * Gets the info list.
     * 
     * @return the info list
     */
    public List<Rl02a10Info> getInfoList() {
        if (infoList == null) {
            infoList = new ArrayList<Rl02a10Info>();
        }
        return infoList;
    }

    /**
     * Sets the info list.
     * 
     * @param infoList
     *            the new info list
     */
    public void setInfoList(List<Rl02a10Info> infoList) {
        this.infoList = infoList;
    }

    /**
     * Gets the info.
     * 
     * @return the info
     */
    public Rl02a10Info getInfo() {
        if (info == null) {
            info = new Rl02a10Info();
        }
        return info;
    }

    /**
     * Sets the info.
     * 
     * @param info
     *            the new info
     */
    public void setInfo(Rl02a10Info info) {
        this.info = info;
    }

    /**
     * Gets the attachment.
     * 
     * @return the attachment
     */
    public String[] getAttachment() {
        return attachment;
    }

    /**
     * Sets the attachment.
     * 
     * @param attachment
     *            the new attachment
     */
    public void setAttachment(String[] attachment) {
        this.attachment = attachment;
    }

    /**
     * Gets the other attachment.
     * 
     * @return the other attachment
     */
    public String getOtherAttachment() {
        return otherAttachment;
    }

    /**
     * Sets the other attachment.
     * 
     * @param otherAttachment
     *            the new other attachment
     */
    public void setOtherAttachment(String otherAttachment) {
        this.otherAttachment = otherAttachment;
    }

    /**
     * Gets the apply1.
     * 
     * @return the apply1
     */
    public XLDFApplicantDataDTO getApply1() {
        return apply1;
    }

    /**
     * Sets the apply1.
     * 
     * @param apply1
     *            the new apply1
     */
    public void setApply1(XLDFApplicantDataDTO apply1) {
        this.apply1 = apply1;
    }

    /**
     * Gets the apply2.
     * 
     * @return the apply2
     */
    public XLDFApplicantDataDTO getApply2() {
        return apply2;
    }

    /**
     * Sets the apply2.
     * 
     * @param apply2
     *            the new apply2
     */
    public void setApply2(XLDFApplicantDataDTO apply2) {
        this.apply2 = apply2;
    }

    /**
     * Gets the rl02a10 app.
     * 
     * @return the rl02a10 app
     */
    public Rl02A10AppDataDTO getRl02a10App() {
        return rl02a10App;
    }

    /**
     * Sets the rl02a10 app.
     * 
     * @param rl02a10App
     *            the new rl02a10 app
     */
    public void setRl02a10App(Rl02A10AppDataDTO rl02a10App) {
        this.rl02a10App = rl02a10App;
    }

    /**
     * Gets the delegated.
     * 
     * @return the delegated
     */
    public XLDFPersonBriefDataDTO getDelegated() {
        return delegated;
    }

    /**
     * Sets the delegated.
     * 
     * @param delegated
     *            the new delegated
     */
    public void setDelegated(XLDFPersonBriefDataDTO delegated) {
        this.delegated = delegated;
    }

    /**
     * Gets the opening operation dto.
     * 
     * @return the opening operation dto
     */
    public OpeningOperationDTO getOpeningOperationDTO() {
        return openingOperationDTO;
    }

    /**
     * Sets the opening operation dto.
     * 
     * @param openingOperationDTO
     *            the new opening operation dto
     */
    public void setOpeningOperationDTO(OpeningOperationDTO openingOperationDTO) {
        this.openingOperationDTO = openingOperationDTO;
    }

    /**
     * Gets the xldf map.
     * 
     * @return the xldf map
     */
    public Map<String, XLDFDomainObject> getXldfMap() {
        return xldfMap;
    }

    /**
     * Sets the xldf map.
     * 
     * @param xldfMap
     *            the xldf map
     */
    public void setXldfMap(Map<String, XLDFDomainObject> xldfMap) {
        this.xldfMap = xldfMap;
    }

    /**
     * Gets the person map data.
     * 
     * @return the person map data
     */
    public Map<String, Object> getPersonMapData() {
        return personMapData;
    }

    /**
     * Sets the person map data.
     * 
     * @param personMapData
     *            the person map data
     */
    public void setPersonMapData(Map<String, Object> personMapData) {
        this.personMapData = personMapData;
    }

    /**
     * Checks if is show complete.
     * 
     * @return true, if is show complete
     */
    public boolean isShowComplete() {
        return showComplete;
    }

    /**
     * Sets the show complete.
     * 
     * @param showComplete
     *            the new show complete
     */
    public void setShowComplete(boolean showComplete) {
        this.showComplete = showComplete;
    }

    /**
     * Checks if is show print.
     * 
     * @return true, if is show print
     */
    public boolean isShowPrint() {
        return showPrint;
    }

    /**
     * Sets the show print.
     * 
     * @param showPrint
     *            the new show print
     */
    public void setShowPrint(boolean showPrint) {
        this.showPrint = showPrint;
    }

    /**
     * Gets the xldf004m type list.
     * 
     * @return the xldf004m type list
     */
    public List<Xldf004mType> getXldf004mTypeList() {
        return xldf004mTypeList;
    }

    /**
     * Sets the xldf004m type list.
     * 
     * @param xldf004mTypeList
     *            the new xldf004m type list
     */
    public void setXldf004mTypeList(List<Xldf004mType> xldf004mTypeList) {
        this.xldf004mTypeList = xldf004mTypeList;
    }

    /**
     * Gets the apply1 county code.
     * 
     * @return the apply1 county code
     */
    public String getApply1CountyCode() {
        return apply1CountyCode;
    }

    /**
     * Sets the apply1 county code.
     * 
     * @param apply1CountyCode
     *            the new apply1 county code
     */
    public void setApply1CountyCode(String apply1CountyCode) {
        this.apply1CountyCode = apply1CountyCode;
    }

    /**
     * Gets the apply2 county code.
     * 
     * @return the apply2 county code
     */
    public String getApply2CountyCode() {
        return apply2CountyCode;
    }

    /**
     * Sets the apply2 county code.
     * 
     * @param apply2CountyCode
     *            the new apply2 county code
     */
    public void setApply2CountyCode(String apply2CountyCode) {
        this.apply2CountyCode = apply2CountyCode;
    }

    /**
     * Gets the delegated county code.
     * 
     * @return the delegated county code
     */
    public String getDelegatedCountyCode() {
        return delegatedCountyCode;
    }

    /**
     * Sets the delegated county code.
     * 
     * @param delegatedCountyCode
     *            the new delegated county code
     */
    public void setDelegatedCountyCode(String delegatedCountyCode) {
        this.delegatedCountyCode = delegatedCountyCode;
    }

    /**
     * Checks if is show real save list.
     * 
     * @return true, if is show real save list
     */
    public boolean isShowRealSaveList() {
        return showRealSaveList;
    }

    /**
     * Sets the show real save list.
     * 
     * @param showRealSaveList
     *            the new show real save list
     */
    public void setShowRealSaveList(boolean showRealSaveList) {
        this.showRealSaveList = showRealSaveList;
    }

    /**
     * Gets the message.
     * 
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the message.
     * 
     * @param message
     *            the new message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Gets the xldf transaction.
     * 
     * @return the xldf transaction
     */
    public XLDFTransaction getXldfTransaction() {
        return xldfTransaction;
    }

    /**
     * Sets the xldf transaction.
     * 
     * @param xldfTransaction
     *            the new xldf transaction
     */
    public void setXldfTransaction(XLDFTransaction xldfTransaction) {
        this.xldfTransaction = xldfTransaction;
    }

    /**
     * Gets the xldf txn person dto.
     * 
     * @return the xldf txn person dto
     */
    public XLDFTxnPersonDTO getXldfTxnPersonDTO() {
        return xldfTxnPersonDTO;
    }

    /**
     * Sets the xldf txn person dto.
     * 
     * @param xldfTxnPersonDTO
     *            the new xldf txn person dto
     */
    public void setXldfTxnPersonDTO(XLDFTxnPersonDTO xldfTxnPersonDTO) {
        this.xldfTxnPersonDTO = xldfTxnPersonDTO;
    }

    /**
     * Checks if is disabled verify bt.
     * 
     * @return true, if is disabled verify bt
     */
    public boolean isDisabledVerifyBt() {
        return disabledVerifyBt;
    }

    /**
     * Sets the disabled verify bt.
     * 
     * @param disabledVerifyBt
     *            the new disabled verify bt
     */
    public void setDisabledVerifyBt(boolean disabledVerifyBt) {
        this.disabledVerifyBt = disabledVerifyBt;
    }

    /**
     * Gets the xldf person data.
     * 
     * @return the xldf person data
     */
    public XLDFPersonDataDomainObject getXldfPersonData() {
        return xldfPersonData;
    }

    /**
     * Sets the xldf person data.
     * 
     * @param xldfPersonData
     *            the new xldf person data
     */
    public void setXldfPersonData(XLDFPersonDataDomainObject xldfPersonData) {
        this.xldfPersonData = xldfPersonData;
    }

    /**
     * Checks if is from l1.
     * 
     * @return true, if is from l1
     */
    public boolean isFromL1() {
        return fromL1;
    }

    /**
     * Sets the from l1.
     * 
     * @param fromL1
     *            the new from l1
     */
    public void setFromL1(boolean fromL1) {
        this.fromL1 = fromL1;
    }

    /**
     * Gets the apply seq.
     * 
     * @return the apply seq
     */
    public int getApplySeq() {
        return applySeq;
    }

    /**
     * Sets the apply seq.
     * 
     * @param applySeq
     *            the new apply seq
     */
    public void setApplySeq(int applySeq) {
        this.applySeq = applySeq;
    }

    /**
     * Checks if is err birth place.
     * 
     * @return true, if is err birth place
     */
    public boolean isErrBirthPlace() {
        return errBirthPlace;
    }

    /**
     * Sets the err birth place.
     * 
     * @param errBirthPlace
     *            the new err birth place
     */
    public void setErrBirthPlace(boolean errBirthPlace) {
        this.errBirthPlace = errBirthPlace;
    }

    /**
     * Gets the receipt id.
     * 
     * @return the receipt id
     */
    public String getReceiptId() {
        return receiptId;
    }

    /**
     * Sets the receipt id.
     * 
     * @param receiptId
     *            the new receipt id
     */
    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    /**
     * Gets the send email list.
     * 
     * @return the send email list
     */
    public List<RsIdCardLossDTO> getSendEmailList() {
        return sendEmailList;
    }

    /**
     * Sets the send email list.
     * 
     * @param sendEmailList
     *            the new send email list
     */
    public void setSendEmailList(List<RsIdCardLossDTO> sendEmailList) {
        this.sendEmailList = sendEmailList;
    }

    /**
     * Checks if is disabled temp save.
     * 
     * @return true, if is disabled temp save
     */
    public boolean isDisabledTempSave() {
        return disabledTempSave;
    }

    /**
     * Sets the disabled temp save.
     * 
     * @param disabledTempSave
     *            the new disabled temp save
     */
    public void setDisabledTempSave(boolean disabledTempSave) {
        this.disabledTempSave = disabledTempSave;
    }

    public List<RlWarningMessage> getWarningMessgeList() {
        return warningMessgeList;
    }

    public void setWarningMessgeList(List<RlWarningMessage> warningMessgeList) {
        this.warningMessgeList = warningMessgeList;
    }

    public boolean isInitSuccess() {
        return initSuccess;
    }

    public void setInitSuccess(boolean initSuccess) {
        this.initSuccess = initSuccess;
    }

    public boolean isControlBtn() {
        return controlBtn;
    }

    public void setControlBtn(boolean controlBtn) {
        this.controlBtn = controlBtn;
    }

    public List<RlWarningMessage> getRlWarningMessageList() {
        return rlWarningMessageList;
    }

    public void setRlWarningMessageList(List<RlWarningMessage> rlWarningMessageList) {
        this.rlWarningMessageList = rlWarningMessageList;
    }

}
