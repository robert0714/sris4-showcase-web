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
import tw.gov.moi.domain.Rldf100mType;

/**
 * The Class Rl089d3DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl089d3DTO", propOrder = { "person_id", "yyyStart", "yyyEnd", "lists", "result" })
@XmlRootElement(name = "Rl089d3DTO")
public class Rl089d3DTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 統一編號. */
    @XmlElement(name = "Person_id")
    @FieldName("統一編號")
    private String person_id;

    /** The yyy start. */
    @XmlElement(name = "YyyStart")
    @FieldName("年起")
    private String yyyStart;

    /** The yyy end. */
    @XmlElement(name = "YyyEnd")
    @FieldName("年迄")
    private String yyyEnd;

    /** 查詢結果. */
    @XmlElement(name = "Lists")
    @FieldName("查詢結果")
    private List<Rldf100mType> lists;

    /** The result. */
    @XmlElement(name = "Result")
    @FieldName("查詢結果明細")
    private Rldf100mType result = new Rldf100mType();

    /** The yyy end. */
    @XmlElement(name = "streetDoorplate")
    @FieldName("戶籍地址")
    private String streetDoorplate = "";

    /** The yyy end. */
    @XmlElement(name = "index")
    @FieldName("筆數")
    private int index;

    // /** The yyy end. */
    // @XmlElement(name = "totalItems")
    // @FieldName("總筆數")
    // private int totalItems;

    /**
     * Gets the person_id.
     * 
     * @return the person_id
     */
    public String getPerson_id() {
        return person_id;
    }

    /**
     * Sets the person_id.
     * 
     * @param person_id
     *            the new person_id
     */
    public void setPerson_id(String person_id) {
        this.person_id = person_id;
    }

    /**
     * Gets the yyy start.
     * 
     * @return the yyy start
     */
    public String getYyyStart() {
        return yyyStart;
    }

    /**
     * Sets the yyy start.
     * 
     * @param yyyStart
     *            the new yyy start
     */
    public void setYyyStart(String yyyStart) {
        this.yyyStart = yyyStart;
    }

    /**
     * Gets the yyy end.
     * 
     * @return the yyy end
     */
    public String getYyyEnd() {
        return yyyEnd;
    }

    /**
     * Sets the yyy end.
     * 
     * @param yyyEnd
     *            the new yyy end
     */
    public void setYyyEnd(String yyyEnd) {
        this.yyyEnd = yyyEnd;
    }

    /**
     * Gets the lists.
     * 
     * @return the lists
     */
    public List<Rldf100mType> getLists() {
        return lists;
    }

    /**
     * Sets the lists.
     * 
     * @param lists
     *            the new lists
     */
    public void setLists(List<Rldf100mType> lists) {
        this.lists = lists;
    }

    /**
     * Adds the all list.
     * 
     * @param lists
     *            the lists
     */
    // public void addAllList(List<Rldf100mType> lists) {
    // this.getLists().clear();
    // this.getLists().addAll(lists);
    // if (this.getLists().isEmpty()) {
    // this.setResult(new Rldf100mType());
    // } else {
    // this.setIndex(1);
    // this.setResult(this.getLists().get(0));
    // }
    // }

    /**
     * Gets the result.
     * 
     * @return the result
     */
    public Rldf100mType getResult() {
        return result;
    }

    /**
     * Sets the result.
     * 
     * @param result
     *            the new result
     */
    public void setResult(Rldf100mType result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Rl089d3DTO [person_id=" + person_id + ", yyyStart=" + yyyStart + ", yyyEnd=" + yyyEnd + "]";
    }

    public String getStreetDoorplate() {
        return streetDoorplate;
    }

    public void setStreetDoorplate(String streetDoorplate) {
        this.streetDoorplate = streetDoorplate;
    }

    // public int getItems() {
    // return items;
    // }
    //
    // public void setItems(int items) {
    // this.items = items;
    // }

    // public int getTotalItems() {
    // return totalItems;
    // }
    //
    // public void setTotalItems(int totalItems) {
    // this.totalItems = totalItems;
    // }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

}
