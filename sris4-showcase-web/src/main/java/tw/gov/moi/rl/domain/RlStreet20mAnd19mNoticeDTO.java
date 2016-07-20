package tw.gov.moi.rl.domain;

import java.io.Serializable;

import tw.gov.moi.domain.Rldf019mType;
import tw.gov.moi.domain.Rldf020mType;

public class RlStreet20mAnd19mNoticeDTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String oldAddrTxCode;
    private String newAddrTxCode;
    private Rldf020mType rldf020m;
    private Rldf019mType rldf019m;

    public boolean needToNotice() {
        if (rldf019m == null) {
            return false;
        } else {
            return true;
        }
    }

    public String getOldAddrTxCode() {
        return oldAddrTxCode;
    }

    public void setOldAddrTxCode(String oldAddrTxCode) {
        this.oldAddrTxCode = oldAddrTxCode;
    }

    public String getNewAddrTxCode() {
        return newAddrTxCode;
    }

    public void setNewAddrTxCode(String newAddrTxCode) {
        this.newAddrTxCode = newAddrTxCode;
    }

    public Rldf020mType getRldf020m() {
        return rldf020m;
    }

    public void setRldf020m(Rldf020mType rldf020m) {
        this.rldf020m = rldf020m;
    }

    public Rldf019mType getRldf019m() {
        return rldf019m;
    }

    public void setRldf019m(Rldf019mType rldf019m) {
        this.rldf019m = rldf019m;
    }

}
