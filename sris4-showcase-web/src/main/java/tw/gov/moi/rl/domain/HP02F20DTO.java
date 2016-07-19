package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.domain.Rldf2f10Type;
import tw.gov.moi.domain.Rldf2f20Type;

/**
 * @author robert.lee
 * 
 * <p>此DTO原名為HouseholdProcessRL02F20DTO</p>
 * 用途為大宗戶籍謄本(RL02F0)轉向戶籍謄本(RL02100)之用的DTO
 *  
 */
public class HP02F20DTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -1388244011210463696L;
    
    @FieldName("受理大宗戶籍謄本申請資訊")
    private Rldf2f10Type rldf2f10Data;
    
    @FieldName("製作大宗戶籍謄本資訊")
    private Rldf2f20Type rldf2f20Data;
    
    @FieldName("受理大宗戶籍謄本作業時的ExecutantType")
    private ExecutantType rl02F10ExecutantType;    
    
    @FieldName("製作大宗戶籍謄本時的ExecutantType")
    private ExecutantType rl02100ExecutantType;
    
    @FieldName("當事人是否為電腦化前人口")
    private boolean computerizedPredecessor = false;
    
    @FieldName("暫存資料")
    private Map<String,? extends Serializable> tmpData = new HashMap<String, Serializable>();
    
    @FieldName("受理大宗戶籍謄本作業時的windowId")
    private String rl02F10WindowId;
    
    public Rldf2f10Type getRldf2f10Data() {
        return rldf2f10Data;
    }

    public void setRldf2f10Data(Rldf2f10Type rldf2f10Data) {
        this.rldf2f10Data = rldf2f10Data;
    }

    public Rldf2f20Type getRldf2f20Data() {
        return rldf2f20Data;
    }

    public void setRldf2f20Data(Rldf2f20Type rldf2f20Data) {
        this.rldf2f20Data = rldf2f20Data;
    }

    /***
     * 由於受理大宗戶籍謄本作業時的ExecutantType會因為多次執行而有所不同,使其中的transactionId會與applyTransactionId有所不同
     * 
     * **/
    public ExecutantType getRl02F10ExecutantType() {
        return rl02F10ExecutantType;
    }

    public void setRl02F10ExecutantType(ExecutantType rl02f10ExecutantType) {
        rl02F10ExecutantType = rl02f10ExecutantType;
    }
    
    /***
     * 由大宗戶籍謄本作業進入RL02100之後所產生executantType
     * 
     * **/
    public ExecutantType getRl02100ExecutantType() {
        return rl02100ExecutantType;
    }
    /***
     * 由大宗戶籍謄本作業進入RL02100之後所產生executantType,也就是說是由HouseholdProcessRL02F0Utils填入
     * 
     * **/
    public void setRl02100ExecutantType(ExecutantType rl02100ExecutantType) {
        this.rl02100ExecutantType = rl02100ExecutantType;
    }

    public Map<String, ? extends Serializable> getTmpData() {
        return tmpData;
    }

    public void setTmpData(Map<String, ? extends Serializable> tmpData) {
        this.tmpData = tmpData;
    }

    public boolean isComputerizedPredecessor() {
        return computerizedPredecessor;
    }

    public void setComputerizedPredecessor(boolean computerizedPredecessor) {
        this.computerizedPredecessor = computerizedPredecessor;
    }

    public String getRl02F10WindowId() {
        return rl02F10WindowId;
    }

    public void setRl02F10WindowId(String rl02f10WindowId) {
        rl02F10WindowId = rl02f10WindowId;
    }
    
}
