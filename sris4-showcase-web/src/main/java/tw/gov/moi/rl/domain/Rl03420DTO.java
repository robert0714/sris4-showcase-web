/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * The Class Rl03420DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl03420DTO", propOrder = { "JobName", "JobDescText", "ClassNameText", "ModifyObj", "ResultList",
        "Day1List", "Day2List", "MonthList", "WeekList", "isMonthLastDay", "isMonthLastWeek" })
@XmlRootElement(name = "Rl03420DTO")
public class Rl03420DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 作業名稱 */
    @XmlElement(name = "JobName", required = true)
    @FieldName("作業名稱")
    private String jobName;

    /** 作業描述文字 */
    @XmlElement(name = "JobDescText", required = true)
    @FieldName("作業描述文字")
    private String jobDescText;

    /** 程式名稱文字 */
    @XmlElement(name = "ClassNameText", required = true)
    @FieldName("程式名稱文字")
    private String classNameText;

    /** 日期清單 */
    @XmlElement(name = "Day1List", required = true)
    @FieldName("日期清單")
    private List<String> day1List;

    /** 日期清單 */
    @XmlElement(name = "Day2List", required = true)
    @FieldName("日期清單")
    private List<String> day2List;

    /** 月清單 */
    @XmlElement(name = "MonthList", required = true)
    @FieldName("月清單")
    private List<String> monthList;

    /** 星期清單 */
    @XmlElement(name = "WeekList", required = true)
    @FieldName("星期清單")
    private List<String> weekList;

    /** 編輯物件 */
    @XmlElement(name = "ModifyObj", required = true)
    @FieldName("編輯物件")
    private Rl03420SaveDTO modifyObj;

    /** 查詢結果-編修過的 */
    @XmlElement(name = "ResultList", required = true)
    @FieldName("查詢結果-編修過的")
    private List<Rl03420SaveDTO> resultList;

    @XmlElement(name = "EveryDayExecuteMinutes", required = true)
    @FieldName("每日執行作業-分")
    private String everyDayExecuteMinutes = "";

    @XmlElement(name = "EveryDayExecuteTime", required = true)
    @FieldName("每日執行作業-時")
    private String everyDayExecuteTime = "";

    @XmlElement(name = "Message", required = true)
    @FieldName("確認訊息")
    private String message;

    /** A:新增 M:修改 D:刪除 */
    @XmlElement(name = "ActionMode", required = true)
    @FieldName("動作模式")
    private String actionMode;

    public String getEveryDayExecuteMinutes() {
        return everyDayExecuteMinutes;
    }

    public void setEveryDayExecuteMinutes(String everyDayExecuteMinutes) {
        this.everyDayExecuteMinutes = everyDayExecuteMinutes;
    }

    public String getEveryDayExecuteTime() {
        return everyDayExecuteTime;
    }

    public void setEveryDayExecuteTime(String everyDayExecuteTime) {
        this.everyDayExecuteTime = everyDayExecuteTime;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(final String jobName) {
        this.jobName = jobName;
    }

    public List<Rl03420SaveDTO> getResultList() {
        return resultList;
    }

    public void setResultList(final List<Rl03420SaveDTO> resultList) {
        this.resultList = resultList;
    }

    public Rl03420SaveDTO getModifyObj() {
        return modifyObj;
    }

    public void setModifyObj(final Rl03420SaveDTO modifyObj) {
        this.modifyObj = modifyObj;
    }

    public String getJobDescText() {
        return jobDescText;
    }

    public void setJobDescText(final String jobDescText) {
        this.jobDescText = jobDescText;
    }

    public String getClassNameText() {
        return classNameText;
    }

    public void setClassNameText(final String classNameText) {
        this.classNameText = classNameText;
    }

    public List<String> getDay1List() {
        return day1List;
    }

    public void setDay1List(final List<String> day1List) {
        this.day1List = day1List;
    }

    public List<String> getDay2List() {
        return day2List;
    }

    public void setDay2List(final List<String> day2List) {
        this.day2List = day2List;
    }

    public List<String> getMonthList() {
        return monthList;
    }

    public void setMonthList(final List<String> monthList) {
        this.monthList = monthList;
    }

    public List<String> getWeekList() {
        return weekList;
    }

    public void setWeekList(final List<String> weekList) {
        this.weekList = weekList;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getActionMode() {
        return actionMode;
    }

    public void setActionMode(String actionMode) {
        this.actionMode = actionMode;
    }

}
