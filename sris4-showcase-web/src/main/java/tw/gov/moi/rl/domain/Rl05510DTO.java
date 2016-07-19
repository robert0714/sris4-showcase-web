package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldf004mType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl05510DTO", propOrder = { "option", "personId", "operationMode", "oldOption", "oldPersonId",
        "oldOperationMode", "sendNoticeButtonEnableFlag", "sendNoticeButtonRenderedFlag", "rldf004mType",
        "listRl05510ResultDTO" })
@XmlRootElement(name = "Rl05510DTO")
public class Rl05510DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 請選擇 */
    @XmlElement(name = "option")
    @FieldName("請選擇")
    private String option = "1";

    /** 統號 */
    @XmlElement(name = "personId")
    @FieldName("統號")
    private String personId = "";

    /** 異動模式 */
    @XmlElement(name = "operationMode")
    @FieldName("異動模式")
    private String operationMode = "1";

    /** 之前的請選擇 */
    @XmlElement(name = "oldOption")
    @FieldName("之前的請選擇")
    private String oldOption = "";

    /** 之前的統號 */
    @XmlElement(name = "oldPersonId")
    @FieldName("之前的統號")
    private String oldPersonId = "";

    /** 之前的異動模式 */
    @XmlElement(name = "oldOperationMode")
    @FieldName("之前的異動模式")
    private String oldOperationMode = "";

    /** 按鈕可否執行 */
    @XmlElement(name = "sendNoticeButtonEnableFlag")
    @FieldName("按鈕可否執行")
    private String sendNoticeButtonEnableFlag = "false";

    /** 按鈕是否顯示 */
    @XmlElement(name = "sendNoticeButtonRenderedFlag")
    @FieldName("按鈕是否顯示")
    private String sendNoticeButtonRenderedFlag = "false";

    /** Rldf004mType */
    @XmlElement(name = "rldf004mType")
    @FieldName("Rldf004mType")
    private Rldf004mType rldf004mType = null;

    /** 查詢結果 */
    @XmlElement(name = "listRl05510ResultDTO")
    @FieldName("查詢結果")
    private List<Rl05510ResultDTO> listRl05510ResultDTO = new ArrayList<Rl05510ResultDTO>(0);

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getOperationMode() {
        return operationMode;
    }

    public void setOperationMode(String operationMode) {
        this.operationMode = operationMode;
    }

    public String getOldOption() {
        return oldOption;
    }

    public void setOldOption(String oldOption) {
        this.oldOption = oldOption;
    }

    public String getOldPersonId() {
        return oldPersonId;
    }

    public void setOldPersonId(String oldPersonId) {
        this.oldPersonId = oldPersonId;
    }

    public String getOldOperationMode() {
        return oldOperationMode;
    }

    public void setOldOperationMode(String oldOperationMode) {
        this.oldOperationMode = oldOperationMode;
    }

    public String getSendNoticeButtonEnableFlag() {
        return sendNoticeButtonEnableFlag;
    }

    public void setSendNoticeButtonEnableFlag(String sendNoticeButtonEnableFlag) {
        this.sendNoticeButtonEnableFlag = sendNoticeButtonEnableFlag;
    }

    public String getSendNoticeButtonRenderedFlag() {
        return sendNoticeButtonRenderedFlag;
    }

    public void setSendNoticeButtonRenderedFlag(String sendNoticeButtonRenderedFlag) {
        this.sendNoticeButtonRenderedFlag = sendNoticeButtonRenderedFlag;
    }

    public List<Rl05510ResultDTO> getListRl05510ResultDTO() {
        return listRl05510ResultDTO;
    }

    public void setListRl05510ResultDTO(List<Rl05510ResultDTO> listRl05510ResultDTO) {
        this.listRl05510ResultDTO = listRl05510ResultDTO;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Rldf004mType getRldf004mType() {
        return rldf004mType;
    }

    public void setRldf004mType(Rldf004mType rldf004mType) {
        this.rldf004mType = rldf004mType;
    }

}
