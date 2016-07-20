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

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl03b30QueryDTO", propOrder = { "recNo", "personId", "imageHistoryList", "createDate", "createTime",
        "status", "specialMark", "noPhotoReason", "imgByte", "imgFilePath" })
@XmlRootElement(name = "Rl03b30QueryDTO")
public class Rl03b30QueryDTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /** 序號. */
    @XmlElement(name = "RecNo")
    @FieldName("村里")
    private String recNo;

    /** 國民身分證統一編號. */
    @XmlElement(name = "PersonId")
    @FieldName("國民身分證統一編號")
    private String personId;

    /** 歷史影像清單. */
    @XmlElement(name = "ImageHistoryList")
    @FieldName("歷史影像清單")
    private List<Rl03b30QueryDTO> imageHistoryList = new ArrayList<Rl03b30QueryDTO>();

    /** 建檔日期. */
    @XmlElement(name = "CreateDate")
    @FieldName("建檔日期")
    private String createDate;

    /** 建檔時間. */
    @XmlElement(name = "CreateTime")
    @FieldName("建檔時間")
    private String createTime;

    /** 影像註記. */
    @XmlElement(name = "Status")
    @FieldName("影像註記")
    private String status;

    /** 相片列印方式. */
    @XmlElement(name = "SpecialMark")
    @FieldName("相片列印方式")
    private String specialMark;

    /** 免列印相片原因. */
    @XmlElement(name = "NoPhotoReason")
    @FieldName("免列印相片原因")
    private String noPhotoReason;

    /** 國民身分證影像byte. */
    @XmlElement(name = "ImgByte")
    @FieldName("國民身分證影像byte")
    private byte[] imgByte;

    /** 國民身分證影像檔名. */
    @XmlElement(name = "ImgFilePath")
    @FieldName("國民身分證影像檔名")
    private String imgFilePath;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getRecNo() {
        return recNo;
    }

    public void setRecNo(String recNo) {
        this.recNo = recNo;
    }

    public List<Rl03b30QueryDTO> getImageHistoryList() {
        return imageHistoryList;
    }

    public void setImageHistoryList(List<Rl03b30QueryDTO> imageHistoryList) {
        this.imageHistoryList = imageHistoryList;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSpecialMark() {
        return specialMark;
    }

    public void setSpecialMark(String specialMark) {
        this.specialMark = specialMark;
    }

    public String getNoPhotoReason() {
        return noPhotoReason;
    }

    public void setNoPhotoReason(String noPhotoReason) {
        this.noPhotoReason = noPhotoReason;
    }

    public byte[] getImgByte() {
        return imgByte;
    }

    public void setImgByte(byte[] imgByte) {
        this.imgByte = imgByte;
    }

    public String getImgFilePath() {
        return imgFilePath;
    }

    public void setImgFilePath(String imgFilePath) {
        this.imgFilePath = imgFilePath;
    }

}
