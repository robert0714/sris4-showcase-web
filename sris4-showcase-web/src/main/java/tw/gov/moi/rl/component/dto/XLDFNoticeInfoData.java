package tw.gov.moi.rl.component.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.domain.XldfopracsType;
import tw.gov.moi.rs.dto.SendMessageDTO;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLDFNoticeInfoData", propOrder = { "sendMessageDTO",
		"unNoticeAccess", "noticeAccess", "otherAccess", "needActionExeeAccess" })
@XmlRootElement(name = "XLDFNoticeInfoData")
public class XLDFNoticeInfoData {
	@XmlElement(name = "sendMessageDTO")
	private SendMessageDTO sendMessageDTO;
	@XmlElement(name = "unNoticeAccess")
	private List<XldfopracsType> unNoticeAccess;
	@XmlElement(name = "noticeAccess")
	private List<XldfopracsType> noticeAccess;
	@XmlElement(name = "otherAccess")
	private List<XldfopracsType> otherAccess;
	@XmlElement(name = "needActionExeeAccess")
	private List<XldfopracsType> needActionExeeAccess;
	
	public XLDFNoticeInfoData(SendMessageDTO sendMessageDTO,
			List<XldfopracsType> unNoticeAccess,
			List<XldfopracsType> noticeAccess,
			List<XldfopracsType> otherAccess,
			List<XldfopracsType> needActionExeeAccess) {
		super();
		this.sendMessageDTO = sendMessageDTO;
		this.unNoticeAccess = unNoticeAccess;
		this.noticeAccess = noticeAccess;
		this.otherAccess = otherAccess;
		this.needActionExeeAccess = needActionExeeAccess;
	}
	
	public XLDFNoticeInfoData() {
		super();
	}

	public SendMessageDTO getSendMessageDTO() {
		return sendMessageDTO;
	}
	public void setSendMessageDTO(SendMessageDTO sendMessageDTO) {
		this.sendMessageDTO = sendMessageDTO;
	}
	public List<XldfopracsType> getUnNoticeAccess() {
		return unNoticeAccess;
	}
	public void setUnNoticeAccess(List<XldfopracsType> unNoticeAccess) {
		this.unNoticeAccess = unNoticeAccess;
	}
	public List<XldfopracsType> getNoticeAccess() {
		return noticeAccess;
	}
	public void setNoticeAccess(List<XldfopracsType> noticeAccess) {
		this.noticeAccess = noticeAccess;
	}
	public List<XldfopracsType> getOtherAccess() {
		return otherAccess;
	}
	public void setOtherAccess(List<XldfopracsType> otherAccess) {
		this.otherAccess = otherAccess;
	}
	public List<XldfopracsType> getNeedActionExeeAccess() {
		return needActionExeeAccess;
	}
	public void setNeedActionExeeAccess(List<XldfopracsType> needActionExeeAccess) {
		this.needActionExeeAccess = needActionExeeAccess;
	}
	
}
