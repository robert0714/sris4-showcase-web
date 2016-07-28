/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.dto;

import java.io.Serializable; 
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.HouseholdtransrecType;
import tw.gov.moi.domain.XldftxnoprType;

/**
 * XLDFGeneralSaveDTO 存放要進行DB commit的物件
 * 
 * @author robert
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xldfGeneralSaveDTO", propOrder = { "xldfSaveDTO", "xldfNoticeInfoData", "txnOperations" , "appTransJobList" })
@XmlRootElement(name = "XLDFGeneralSaveDTO")
public class XLDFGeneralSaveDTO implements Serializable {
  
    private static final long serialVersionUID = 2829889147940453766L;

    /** 新增的物件串列 */
    @XmlElement(name = "xldfSaveDTO", required = true)
    @FieldName("LDFSaveDTO 存放要進行DB commit的物件")
    private XLDFSaveDTO XLDFSaveDTO  ;
    
    @XmlElement(name = "xLDFNoticeInfoData", required = true)
    @FieldName("通報處理物件")
    private XLDFNoticeInfoData xldfNoticeInfoData;
    
    @XmlElement(name = "txnOperations", required = true)
    @FieldName("作業程序紀錄檔")
    private List<XldftxnoprType> txnOperations;

    @XmlElement(name = "appTransJobList", required = true)
    @FieldName("申請書傳輸紀錄")
    private List<HouseholdtransrecType> appTransJobList;
    
    public XLDFSaveDTO getXLDFSaveDTO() {
        return XLDFSaveDTO;
    }

    public void setXLDFSaveDTO(XLDFSaveDTO xLDFSaveDTO) {
        XLDFSaveDTO = xLDFSaveDTO;
    }

    public XLDFNoticeInfoData getXldfNoticeInfoData() {
        return xldfNoticeInfoData;
    }

    public void setXldfNoticeInfoData(XLDFNoticeInfoData xldfNoticeInfoData) {
        this.xldfNoticeInfoData = xldfNoticeInfoData;
    }

    public List<XldftxnoprType> getTxnOperations() {
	if(txnOperations ==null){
	    txnOperations =new ArrayList<XldftxnoprType>();
	}
        return txnOperations;
    }

    public void setTxnOperations(List<XldftxnoprType> txnOperations) {
        this.txnOperations = txnOperations;
    }

    public List<HouseholdtransrecType> getAppTransJobList() {
	if(appTransJobList == null){
	    appTransJobList= new ArrayList<HouseholdtransrecType>();
	}
        return appTransJobList;
    }

    public void setAppTransJobList(List<HouseholdtransrecType> appTransJobList) {
        this.appTransJobList = appTransJobList;
    }
    
}