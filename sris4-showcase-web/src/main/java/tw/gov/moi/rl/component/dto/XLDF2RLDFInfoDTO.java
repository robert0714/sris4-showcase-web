/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * XLDFSaveDTO 存放要進行DB commit的物件
 * 
 * @author robert
 * 
 */
@XmlRootElement(name = "XLDF2RLDFInfoDTO")
public class XLDF2RLDFInfoDTO implements Serializable {
 
    /**
     * 
     */
    private static final long serialVersionUID = -2659863712660948876L;
    
   
    @FieldName("交易存檔物件")
    private XLDFSaveDTO xldfSaveDTO ;
    
    @FieldName("轉存成RLDF之前的XLDF物件清單")
    private Map<String, Map<String, Map<String , List<Object>>>> classTypeDomainKeyActionXldfEntities;
    
    
    @FieldName("有作業順序的交易存檔物件")
    private Map<Integer , XLDFSaveDTO> seqXldfSaveDTO ;
    
    
    @FieldName("有作業順序的轉存成RLDF之前的XLDF物件清單")
    private Map<Integer ,Map<String, Map<String, Map<String , List<Object>>>>> seqClassTypeDomainKeyActionXldfEntities;
    
    @FieldName("戶籍大簿通報資訊檔案")
    private  XLDFNoticeInfoData infomation;
    
    public XLDFSaveDTO getXldfSaveDTO() {
        return xldfSaveDTO;
    }
    
    public void setXldfSaveDTO(XLDFSaveDTO xldfSaveDTO) {
        this.xldfSaveDTO = xldfSaveDTO;
    }

    public Map<String, Map<String, Map<String, List<Object>>>> getClassTypeDomainKeyActionXldfEntities() {
	if(classTypeDomainKeyActionXldfEntities == null ){
	    classTypeDomainKeyActionXldfEntities = new HashMap<String, Map<String,Map<String,List<Object>>>> ();
	}
        return classTypeDomainKeyActionXldfEntities;
    }

    public void setClassTypeDomainKeyActionXldfEntities(Map<String, Map<String, Map<String, List<Object>>>> classTypeDomainKeyActionXldfEntities) {
        this.classTypeDomainKeyActionXldfEntities = classTypeDomainKeyActionXldfEntities;
    }

    public Map<Integer, XLDFSaveDTO> getSeqXldfSaveDTO() {
	if(seqXldfSaveDTO == null){
	    seqXldfSaveDTO = new HashMap<Integer, XLDFSaveDTO>();
	}
        return seqXldfSaveDTO;
    }

    public void setSeqXldfSaveDTO(Map<Integer, XLDFSaveDTO> seqXldfSaveDTO) {
        this.seqXldfSaveDTO = seqXldfSaveDTO;
    }

    public Map<Integer, Map<String, Map<String, Map<String, List<Object>>>>> getSeqClassTypeDomainKeyActionXldfEntities() {
	if(seqClassTypeDomainKeyActionXldfEntities == null ){
	    seqClassTypeDomainKeyActionXldfEntities =new HashMap<Integer, Map<String,Map<String,Map<String,List<Object>>>>>();
	}
        return seqClassTypeDomainKeyActionXldfEntities;
    }

    public void setSeqClassTypeDomainKeyActionXldfEntities(Map<Integer, Map<String, Map<String, Map<String, List<Object>>>>> seqClassTypeDomainKeyActionXldfEntities) {
        this.seqClassTypeDomainKeyActionXldfEntities = seqClassTypeDomainKeyActionXldfEntities;
    }

    public XLDFNoticeInfoData getInfomation() {
        return infomation;
    }

    public void setInfomation(XLDFNoticeInfoData infomation) {
        this.infomation = infomation;
    }
    
}
