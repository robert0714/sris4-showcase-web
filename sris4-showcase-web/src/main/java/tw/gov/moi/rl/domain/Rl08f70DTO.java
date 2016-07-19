/*
 * Copyright (c) 2010-2020 IISI. All rights reserved.
 * 
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * Rl08f3dDTO.
 * 
 * @author Weiren.Jheng
 */
public class Rl08f70DTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement(name = "woman2Rlde808wType")
    @FieldName("查詢結果 ")
    private String forwardUrl;

    @XmlElement(name = "woman2Rlde808wType")
    @FieldName("查詢結果 ")
    private String voteCode;

    private List<Rl08f70InitPageDTO> queryList;

    public List<Rl08f70InitPageDTO> getQueryList() {
        return queryList;
    }

    @XmlElement(name = "LabelHead")
    @FieldName("標題名稱")
    private String labelHead;

    public void setQueryList(List<Rl08f70InitPageDTO> queryList) {
        this.queryList = queryList;
    }

    public String getForwardUrl() {
        return forwardUrl;
    }

    public void setForwardUrl(String forwardUrl) {
        this.forwardUrl = forwardUrl;
    }

    public String getVoteCode() {
        return voteCode;
    }

    public void setVoteCode(String voteCode) {
        this.voteCode = voteCode;
    }

    public static class Rl08f70InitPageDTO {
        private String name;
        private String page;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPage() {
            return page;
        }

        public void setPage(String page) {
            this.page = page;
        }
    }
    
    public String getLabelHead() {
        return labelHead;
    }

    public void setLabelHead(String labelHead) {
        this.labelHead = labelHead;
    }
}
