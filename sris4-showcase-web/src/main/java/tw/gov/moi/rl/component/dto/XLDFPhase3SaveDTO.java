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
import tw.gov.moi.domain.XldftxnoprType;
import tw.gov.moi.rl.domain.Rl0a300DTO;

/**
 * XLDFGeneralSaveDTO 存放要進行DB commit的物件
 * 
 * @author robert
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xldfPhase3SaveDTO", propOrder = { "xldfSaveDTO", "xldfNoticeInfoData", "txnOperations" ,"rl0a300dto" })
@XmlRootElement(name = "XLDFPhase3SaveDTO")
public class XLDFPhase3SaveDTO implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 613340009367104684L;

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
    
    @XmlElement(name = "rl0a300DTO", required = true)
    @FieldName("第三階段規費DTO")
    private   Rl0a300DTO rl0a300dto;

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

    public Rl0a300DTO getRl0a300dto() {
        return rl0a300dto;
    }

    public void setRl0a300dto(Rl0a300DTO rl0a300dto) {
        this.rl0a300dto = rl0a300dto;
    }
    
}
