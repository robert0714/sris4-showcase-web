package tw.gov.moi.rl.domain;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

public class ReprintInfo implements Serializable {

    private static final long serialVersionUID = 6859209714824446281L;

    private String siteName;

    private String votePoint;

    private int pageNo = 0;

    private int subPageNoStart = 0;

    private String neighbor = StringUtils.EMPTY;

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getSubPageNoStart() {
        return subPageNoStart;
    }

    public void setSubPageNoStart(int subPageNoStart) {
        this.subPageNoStart = subPageNoStart;
    }

    public String getNeighbor() {
        return neighbor;
    }

    public void setNeighbor(String neighbor) {
        this.neighbor = neighbor;
    }

    public String getVotePoint() {
        return votePoint;
    }

    public void setVotePoint(String votePoint) {
        this.votePoint = votePoint;
    }
}
