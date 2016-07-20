package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0xSetNoticeDTO", propOrder = { "DataSource", "DataType", "SendSiteIe", "NoticeType" })
@XmlRootElement(name = "Rl0xSetNoticeDTO")
public class Rl0xSetNoticeDTO implements Serializable {

    /**
	 * 
	 */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "DataSource")
    @FieldName("申請書T黨")
    private Object dataSource = null;

    @XmlElement(name = "DataType")
    @FieldName("資料類型")
    private String dataType = null;

    @XmlElement(name = "SendSiteIe")
    @FieldName("通報接收地")
    private String sendSiteIe = null;

    @XmlElement(name = "NoticeType")
    @FieldName("通報類型")
    private String noticeType = null;

    @XmlElement(name = "IsNeedModify")
    @FieldName("是否本地更新就好")
    private boolean isNeedModify = false;

    public boolean isNeedModify() {
        return isNeedModify;
    }

    public void setNeedModify(boolean isNeedModify) {
        this.isNeedModify = isNeedModify;
    }

    public String getNoticeType() {
        return noticeType;
    }

    public void setNoticeType(String noticeType) {
        this.noticeType = noticeType;
    }

    public Object getDataSource() {
        return dataSource;
    }

    public void setDataSource(Object dataSource) {
        this.dataSource = dataSource;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getSendSiteIe() {
        return sendSiteIe;
    }

    public void setSendSiteIe(String sendSiteIe) {
        this.sendSiteIe = sendSiteIe;
    }

    @Override
    public String toString() {
        return "Rl0xSetNoticeDTO [dataSource=" + dataSource + ", dataType=" + dataType + ", sendSiteIe=" + sendSiteIe
                + "]";
    }

}
