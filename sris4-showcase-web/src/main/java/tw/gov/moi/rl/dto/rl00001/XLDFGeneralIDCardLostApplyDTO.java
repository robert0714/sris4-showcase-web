package tw.gov.moi.rl.dto.rl00001;

public class XLDFGeneralIDCardLostApplyDTO implements XLDFIDCardLostApplyDTO {

    // private String applyMark;

    private String applyYyymmdd;

    private String applyHhmmss;

    public XLDFGeneralIDCardLostApplyDTO(/* String idCardLostApplyMark, */String idCardLostApplyYyymmdd,
            String idCardLostApplyHhmmss) {
        // setApplyMark(idCardLostApplyMark);
        setApplyYyymmdd(idCardLostApplyYyymmdd);
        setApplyHhmmss(idCardLostApplyHhmmss);
    }

    /*
     * public String getApplyMark() { return applyMark; }
     * 
     * public void setApplyMark(String applyMark) { this.applyMark = applyMark;
     * }
     */

    public String getApplyYyymmdd() {
        return applyYyymmdd;
    }

    public void setApplyYyymmdd(String applyYyymmdd) {
        this.applyYyymmdd = applyYyymmdd;
    }

    public String getApplyHhmmss() {
        return applyHhmmss;
    }

    public void setApplyHhmmss(String applyHhmmss) {
        this.applyHhmmss = applyHhmmss;
    }

}
