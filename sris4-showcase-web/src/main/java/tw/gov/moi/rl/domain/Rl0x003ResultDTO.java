package tw.gov.moi.rl.domain;

import tw.gov.moi.domain.Rldfv007Type;

public class Rl0x003ResultDTO {
    private Rldfv007Type rldfv007Type;

    public Rldfv007Type getRldfv007Type() {
        return rldfv007Type;
    }

    public void setRldfv007Type(Rldfv007Type rldfv007Type) {
        this.rldfv007Type = rldfv007Type;
    }

    public String toKey() {
        return rldfv007Type.getTransactionId() + rldfv007Type.getRegistrarHhmmss() + rldfv007Type.getRegistrarYyymmdd()
                + rldfv007Type.getOldAreaCode() + rldfv007Type.getNewAreaCode();
    }

}
