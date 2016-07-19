/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;

/**
 * The Class BooleanDTO.
 */
public class Rl08110ComponentDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -1619484991781886105L;

    private String dateStart;
    
    private String dateEnd;
    
    private String doSendDate;

    public String getDoSendDate() {
        return doSendDate;
    }

    public void setDoSendDate(String doSendDate) {
        this.doSendDate = doSendDate;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }
}
