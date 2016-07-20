/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.dto;

/**
 * @author marcus
 * 
 */
public class SpecialNoticeParam {

    private String rrNoticeType = "";

    private String rrEntityClassType = "";

    private String rcNoticeType = "";

    private String rcEntityClassType = "";

    private String rrChgType = "";

    private String rcChgType = "";

    public SpecialNoticeParam() {
        super();

    }

    public SpecialNoticeParam(String rrNoticeType, String rrEntityClassType, String rcNoticeType,
            String rcEntityClassType, String rrChgType, String rcChgType) {
        super();
        this.rrNoticeType = rrNoticeType;
        this.rrEntityClassType = rrEntityClassType;
        this.rcNoticeType = rcNoticeType;
        this.rcEntityClassType = rcEntityClassType;
        this.rrChgType = rrChgType;
        this.rcChgType = rcChgType;
    }

    public String getRrChgType() {
        return rrChgType;
    }

    public void setRrChgType(String rrChgType) {
        this.rrChgType = rrChgType;
    }

    public String getRcChgType() {
        return rcChgType;
    }

    public void setRcChgType(String rcChgType) {
        this.rcChgType = rcChgType;
    }

    /**
     * @return the rrEntityClassType
     */
    public String getRrEntityClassType() {
        return rrEntityClassType;
    }

    /**
     * @param rrEntityClassType
     *            the rrEntityClassType to set
     */
    public void setRrEntityClassType(String rrEntityClassType) {
        this.rrEntityClassType = rrEntityClassType;
    }

    /**
     * @return the rcEntityClassType
     */
    public String getRcEntityClassType() {
        return rcEntityClassType;
    }

    /**
     * @param rcEntityClassType
     *            the rcEntityClassType to set
     */
    public void setRcEntityClassType(String rcEntityClassType) {
        this.rcEntityClassType = rcEntityClassType;
    }

    /**
     * @return the rrNoticeType
     */
    public String getRrNoticeType() {
        return rrNoticeType;
    }

    /**
     * @param rrNoticeType
     *            the rrNoticeType to set
     */
    public void setRrNoticeType(String rrNoticeType) {
        this.rrNoticeType = rrNoticeType;
    }

    /**
     * @return the rcNoticeType
     */
    public String getRcNoticeType() {
        return rcNoticeType;
    }

    /**
     * @param rcNoticeType
     *            the rcNoticeType to set
     */
    public void setRcNoticeType(String rcNoticeType) {
        this.rcNoticeType = rcNoticeType;
    }

}
