/*
 * Copyright (c) 2010-2020 IISI. All rights reserved.
 * 
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

public class Rldf016sDTO {

    private int applySequenceId; //作業順序編號(若無則傳"1")
    private String registrationId; //作業代號 (5碼) Ex:02A10(作業為Rl02a10)
    private String diffTxStatus; //(異地註記)=Y/N (辦理本所:”N”，辦理他所 :"Y")
    private String applySeq = "1";//交易流水號

    public String getApplySeq() {
        return applySeq;
    }

    public void setApplySeq(String applySeq) {
        this.applySeq = applySeq;
    }

    public int getApplySequenceId() {
        return applySequenceId;
    }

    public void setApplySequenceId(int applySequenceId) {
        this.applySequenceId = applySequenceId;
    }

    public String getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    public String getDiffTxStatus() {
        return diffTxStatus;
    }

    public void setDiffTxStatus(String diffTxStatus) {
        this.diffTxStatus = diffTxStatus;
    }
}
