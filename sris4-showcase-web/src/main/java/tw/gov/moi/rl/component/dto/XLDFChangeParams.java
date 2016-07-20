package tw.gov.moi.rl.component.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.rl.utils.XLDFDomainUtils;

/**
 * @author JL
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLDFChangeParams", propOrder = { "operationSequenceId", "xldfDomainKeyBefore", "xldfDomainObject",
        "beforeDomainClassName", "xldfAction", "beforeDomainClass" })
@XmlRootElement(name = "XLDFChangeParams")
public class XLDFChangeParams<E extends XLDFDomainObject> {

    @XmlElement(name = "operationSequenceId")
    private Integer operationSequenceId;

    // private String operationCodeWhenInsert;

    @XmlElement(name = "xldfDomainKeyBefore")
    private XLDFDomainKey xldfDomainKeyBefore;

    @XmlElement(name = "xldfDomainObject")
    private E xldfDomainObject;

    @XmlElement(name = "beforeDomainClassName")
    private String beforeDomainClassName;

    @XmlElement(name = "xldfAction")
    private XLDFAction xldfAction;
    /** 加入判斷是否要處理大簿當事人:若否,則代表此4M不需要做有關大部當事人的資料更新，預設為是 */
    @XmlElement(name = "doMasterPersonProcess")
    private boolean doMasterPersonProcess = Boolean.TRUE;

    public XLDFChangeParams(Integer operationSequenceId, String operationCode, XLDFDomainKey xldfDomainKeyBefore,
            E xldfDomainObject, XLDFAction xldfAction) {
        super();
        this.operationSequenceId = operationSequenceId;
        // this.operationCodeWhenInsert = operationCode;
        this.xldfDomainKeyBefore = xldfDomainKeyBefore;
        this.xldfDomainObject = xldfDomainObject;
        this.xldfAction = xldfAction;

        if (xldfDomainKeyBefore == null) {
            this.beforeDomainClassName = xldfDomainObject.getClass().getSimpleName();
        } else {
            this.beforeDomainClassName = XLDFDomainUtils.caseXldfTypeByDomainKey(
                    xldfDomainKeyBefore.getClass().getSimpleName()).getSimpleName();
        }

    }

    public XLDFChangeParams(Integer operationSequenceId, String operationCode, XLDFDomainKey xldfDomainKeyBefore,
            E xldfDomainObject, XLDFAction xldfAction, boolean doMasterPersonProcess) {
        super();
        this.operationSequenceId = operationSequenceId;
        // this.operationCodeWhenInsert = operationCode;
        this.xldfDomainKeyBefore = xldfDomainKeyBefore;
        this.xldfDomainObject = xldfDomainObject;
        this.xldfAction = xldfAction;
        this.doMasterPersonProcess = doMasterPersonProcess;
        if (xldfDomainKeyBefore == null) {
            this.beforeDomainClassName = xldfDomainObject.getClass().getSimpleName();
        } else {
            this.beforeDomainClassName = XLDFDomainUtils.caseXldfTypeByDomainKey(
                    xldfDomainKeyBefore.getClass().getSimpleName()).getSimpleName();
        }

    }

    /**
     * 
     * @param operationSequenceId
     *            作業順序
     * @param operationCode
     *            作業代號
     * @param beforeDomainClass
     *            作複製(copy)前的Type
     * @param xldfDomainKeyBefore
     *            作複製(copy)前的key
     * @param xldfDomainObject
     * @param xldfAction
     *            Action
     */
    public XLDFChangeParams(Integer operationSequenceId, String operationCode, String beforeDomainClassName,
            XLDFDomainKey xldfDomainKeyBefore, E xldfDomainObject, XLDFAction xldfAction) {
        super();
        this.operationSequenceId = operationSequenceId;
        // this.operationCodeWhenInsert = operationCode;
        this.xldfDomainKeyBefore = xldfDomainKeyBefore;
        this.beforeDomainClassName = beforeDomainClassName;
        this.xldfDomainObject = xldfDomainObject;
        this.xldfAction = xldfAction;
        this.beforeDomainClassName = beforeDomainClassName;

    }

    /**
     * 
     * @param operationSequenceId
     *            作業順序
     * @param operationCode
     *            作業代號
     * @param beforeDomainClass
     *            作複製(copy)前的Type
     * @param xldfDomainKeyBefore
     *            作複製(copy)前的key
     * @param xldfDomainObject
     * @param xldfAction
     *            Action
     */
    public XLDFChangeParams(Integer operationSequenceId, String operationCode, String beforeDomainClassName,
            XLDFDomainKey xldfDomainKeyBefore, E xldfDomainObject, XLDFAction xldfAction, boolean doMasterPersonProcess) {
        super();
        this.operationSequenceId = operationSequenceId;
        // this.operationCodeWhenInsert = operationCode;
        this.xldfDomainKeyBefore = xldfDomainKeyBefore;
        this.beforeDomainClassName = beforeDomainClassName;
        this.xldfDomainObject = xldfDomainObject;
        this.xldfAction = xldfAction;
        this.beforeDomainClassName = beforeDomainClassName;
        this.doMasterPersonProcess = doMasterPersonProcess;
    }

    // public String getOperationCodeWhenInsert() {
    // return operationCodeWhenInsert;
    // }
    //
    // public void setOperationCodeWhenInsert(String operationCodeWhenInsert) {
    // this.operationCodeWhenInsert = operationCodeWhenInsert;
    // }

    public void setOperationSequenceId(Integer operationSequenceId) {
        this.operationSequenceId = operationSequenceId;
    }

    public XLDFDomainKey getXldfDomainKeyBefore() {
        return xldfDomainKeyBefore;
    }

    public void setXldfDomainKeyBefore(XLDFDomainKey xldfDomainKeyBefore) {
        this.xldfDomainKeyBefore = xldfDomainKeyBefore;
    }

    public E getXldfDomainObject() {
        return xldfDomainObject;
    }

    public void setXldfDomainObject(E xldfDomainObject) {
        this.xldfDomainObject = xldfDomainObject;
    }

    public XLDFAction getXldfAction() {
        return xldfAction;
    }

    public void setXldfAction(XLDFAction xldfAction) {
        this.xldfAction = xldfAction;
    }

    public Integer getOperationSequenceId() {
        return operationSequenceId;
    }

    /**
     * @return the beforeDomainClassName
     */
    public String getBeforeDomainClassName() {
        return beforeDomainClassName;
    }

    /**
     * @param beforeDomainClassName
     *            the beforeDomainClassName to set
     */
    public void setBeforeDomainClassName(String beforeDomainClassName) {
        this.beforeDomainClassName = beforeDomainClassName;
    }

    /**
     * @return the doMasterPersonProcess
     */
    public boolean isDoMasterPersonProcess() {
        return doMasterPersonProcess;
    }

    /**
     * @param doMasterPersonProcess
     *            the doMasterPersonProcess to set
     */
    public void setDoMasterPersonProcess(boolean doMasterPersonProcess) {
        this.doMasterPersonProcess = doMasterPersonProcess;
    }

}
