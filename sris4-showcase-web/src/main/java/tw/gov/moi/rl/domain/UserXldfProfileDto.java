package tw.gov.moi.rl.domain;

import java.io.Serializable;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Tldf001mType;
import tw.gov.moi.domain.Tldf004mType;

public class UserXldfProfileDto implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -6472604320455497806L;
    
    @FieldName("補登的戶籍資料")    
    private Tldf001mType tldf001mData;
    
    @FieldName("補登的個人資料")
    private Tldf004mType tldf004mData;

    public Tldf001mType getTldf001mData() {
        return tldf001mData;
    }

    public void setTldf001mData(Tldf001mType tldf001mData) {
        this.tldf001mData = tldf001mData;
    }

    public Tldf004mType getTldf004mData() {
        return tldf004mData;
    }

    public void setTldf004mData(Tldf004mType tldf004mData) {
        this.tldf004mData = tldf004mData;
    }

}
