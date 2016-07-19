/*
 * Copyright (c) 2010-2020 IISI. All rights reserved.
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
import tw.gov.moi.domain.Rldf005dType;
import tw.gov.moi.domain.Rldf006dType;
import tw.gov.moi.rl.domain.Rl08f11AddDTO.SelectItemFor8f11;

/**
 * The Class Rl02b10DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl02c20DTO", propOrder = { "processType", "contactTel", "effectDate", "noticeOptions", "rldf006dType",
        "queryList", "queryListBackup" })
@XmlRootElement(name = "Rl02c20DTO")
public class Rl02c20DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 處理類別. */
    @XmlElement(name = "ProcessType", required = true)
    @FieldName("處理類別")
    private String processType;

    /** 連絡電話. */
    @XmlElement(name = "ContactTel", required = true)
    @FieldName("連絡電話")
    private String contactTel;

    /** 生效日期. */
    @XmlElement(name = "EffectDate", required = true)
    @FieldName("生效日期")
    private String effectDate;

    /** 加註通知事項. */
    @XmlElement(name = "NoticeOptions", required = true)
    @FieldName("加註通知事項")
    private String noticeOptions;

    /** Rldf006dType. */
    @XmlElement(name = "Rldf006dType", required = true)
    @FieldName("Rldf006dType")
    private Rldf006dType rldf006dType;

    /** Rl02c20QueryDTO清單. */
    @XmlElement(name = "QueryList", required = true)
    @FieldName("Rl02c20QueryDTO清單")
    private List<Rl02c20QueryDTO> queryList;

    /** Rl02c20QueryDTO備份清單. */
    @XmlElement(name = "QueryListBackup", required = true)
    @FieldName("Rl02c20QueryDTO清單")
    private List<Rl02c20QueryDTO> queryListBackup;

    /**
     * The Class Rl02c20QueryDTO.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "rl02c20QueryDTO", propOrder = { "villageSelected", "village", "neighborS", "neighborE",
            "streetdoorplate", "processDateS", "processDateE", "processTimeS", "processTimeE", "processPlace", "list" })
    @XmlRootElement(name = "Rl02c20QueryDTO")
    public static class Rl02c20QueryDTO implements Serializable, Cloneable {

        /** The Constant serialVersionUID. */
        private static final long serialVersionUID = 1L;

        /** The village selected. */
        @XmlElement(name = "VillageSelected", required = true)
        @FieldName("加註通知事項")
        private SelectItemFor8f11 villageSelected;

        /** 村里. */
        @XmlElement(name = "Village", required = true)
        @FieldName("村里")
        private String village;

        /** 鄰起. */
        @XmlElement(name = "NeighborS", required = true)
        @FieldName("鄰起")
        private String neighborS;

        /** 鄰迄. */
        @XmlElement(name = "NeighborE", required = true)
        @FieldName("鄰迄")
        private String neighborE;

        /** 門牌. */
        @XmlElement(name = "Streetdoorplate", required = true)
        @FieldName("門牌")
        private String streetdoorplate;

        /** 受理日期. */
        @XmlElement(name = "ProcessDateS", required = true)
        @FieldName("受理日期")
        private String processDateS;

        /** 受理日期. */
        @XmlElement(name = "ProcessDateE", required = true)
        @FieldName("受理日期")
        private String processDateE;

        /** 受理時間起. */
        @XmlElement(name = "ProcessTimeS", required = true)
        @FieldName("受理時間起")
        private String processTimeS;

        /** 受理時間迄. */
        @XmlElement(name = "ProcessTimeE", required = true)
        @FieldName("受理時間迄")
        private String processTimeE;

        /** 受理地點. */
        @XmlElement(name = "ProcessPlace", required = true)
        @FieldName("受理地點")
        private String processPlace;

        /** Rldf005dType清單. */
        @XmlElement(name = "List", required = true)
        @FieldName("Rldf005dType清單")
        List<Rldf005dType> list;

        /*
         * (non-Javadoc)
         * 
         * @see java.lang.Object#clone()
         */
        @Override
        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        /**
         * Gets the village.
         * 
         * @return the village
         */
        public String getVillage() {
            return village;
        }

        /**
         * Sets the village.
         * 
         * @param village
         *            the new village
         */
        public void setVillage(String village) {
            this.village = village;
        }

        /**
         * Gets the neighbor s.
         * 
         * @return the neighbor s
         */
        public String getNeighborS() {
            return neighborS;
        }

        /**
         * Sets the neighbor s.
         * 
         * @param neighborS
         *            the new neighbor s
         */
        public void setNeighborS(String neighborS) {
            this.neighborS = neighborS;
        }

        /**
         * Gets the neighbor e.
         * 
         * @return the neighbor e
         */
        public String getNeighborE() {
            return neighborE;
        }

        /**
         * Sets the neighbor e.
         * 
         * @param neighborE
         *            the new neighbor e
         */
        public void setNeighborE(String neighborE) {
            this.neighborE = neighborE;
        }

        /**
         * Gets the streetdoorplate.
         * 
         * @return the streetdoorplate
         */
        public String getStreetdoorplate() {
            return streetdoorplate;
        }

        /**
         * Sets the streetdoorplate.
         * 
         * @param streetdoorplate
         *            the new streetdoorplate
         */
        public void setStreetdoorplate(String streetdoorplate) {
            this.streetdoorplate = streetdoorplate;
        }

        /**
         * Gets the process date s.
         * 
         * @return the process date s
         */
        public String getProcessDateS() {
            return processDateS;
        }

        /**
         * Sets the process date s.
         * 
         * @param processDateS
         *            the new process date s
         */
        public void setProcessDateS(String processDateS) {
            this.processDateS = processDateS;
        }

        /**
         * Gets the process date e.
         * 
         * @return the process date e
         */
        public String getProcessDateE() {
            return processDateE;
        }

        /**
         * Sets the process date e.
         * 
         * @param processDateE
         *            the new process date e
         */
        public void setProcessDateE(String processDateE) {
            this.processDateE = processDateE;
        }

        /**
         * Gets the process time s.
         * 
         * @return the process time s
         */
        public String getProcessTimeS() {
            return processTimeS;
        }

        /**
         * Sets the process time s.
         * 
         * @param processTimeS
         *            the new process time s
         */
        public void setProcessTimeS(String processTimeS) {
            this.processTimeS = processTimeS;
        }

        /**
         * Gets the process time e.
         * 
         * @return the process time e
         */
        public String getProcessTimeE() {
            return processTimeE;
        }

        /**
         * Sets the process time e.
         * 
         * @param processTimeE
         *            the new process time e
         */
        public void setProcessTimeE(String processTimeE) {
            this.processTimeE = processTimeE;
        }

        /**
         * Gets the process place.
         * 
         * @return the process place
         */
        public String getProcessPlace() {
            return processPlace;
        }

        /**
         * Sets the process place.
         * 
         * @param processPlace
         *            the new process place
         */
        public void setProcessPlace(String processPlace) {
            this.processPlace = processPlace;
        }

        /**
         * Gets the list.
         * 
         * @return the list
         */
        public List<Rldf005dType> getList() {
            return list;
        }

        /**
         * Sets the list.
         * 
         * @param list
         *            the new list
         */
        public void setList(List<Rldf005dType> list) {
            this.list = list;
        }

        /**
         * Gets the village selected.
         * 
         * @return the village selected
         */
        public SelectItemFor8f11 getVillageSelected() {
            return villageSelected;
        }

        /**
         * Sets the village selected.
         * 
         * @param villageSelected
         *            the new village selected
         */
        public void setVillageSelected(SelectItemFor8f11 villageSelected) {
            this.villageSelected = villageSelected;
        }
    }

    /**
     * Gets the process type.
     * 
     * @return the process type
     */
    public String getProcessType() {
        return processType;
    }

    /**
     * Sets the process type.
     * 
     * @param processType
     *            the new process type
     */
    public void setProcessType(String processType) {
        this.processType = processType;
    }

    /**
     * Gets the contact tel.
     * 
     * @return the contact tel
     */
    public String getContactTel() {
        return contactTel;
    }

    /**
     * Sets the contact tel.
     * 
     * @param contactTel
     *            the new contact tel
     */
    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }

    /**
     * Gets the effect date.
     * 
     * @return the effect date
     */
    public String getEffectDate() {
        return effectDate;
    }

    /**
     * Sets the effect date.
     * 
     * @param effectDate
     *            the new effect date
     */
    public void setEffectDate(String effectDate) {
        this.effectDate = effectDate;
    }

    /**
     * Gets the query list.
     * 
     * @return the query list
     */
    public List<Rl02c20QueryDTO> getQueryList() {
        return queryList;
    }

    /**
     * Sets the query list.
     * 
     * @param queryList
     *            the new query list
     */
    public void setQueryList(List<Rl02c20QueryDTO> queryList) {
        this.queryList = queryList;
    }

    /**
     * Gets the notice options.
     * 
     * @return the notice options
     */
    public String getNoticeOptions() {
        return noticeOptions;
    }

    /**
     * Sets the notice options.
     * 
     * @param noticeOptions
     *            the new notice options
     */
    public void setNoticeOptions(String noticeOptions) {
        this.noticeOptions = noticeOptions;
    }

    /**
     * Gets the rldf006d type.
     * 
     * @return the rldf006d type
     */
    public Rldf006dType getRldf006dType() {
        return rldf006dType;
    }

    /**
     * Sets the rldf006d type.
     * 
     * @param rldf006dType
     *            the new rldf006d type
     */
    public void setRldf006dType(Rldf006dType rldf006dType) {
        this.rldf006dType = rldf006dType;
    }

    /**
     * Gets the query list backup.
     * 
     * @return the query list backup
     */
    public List<Rl02c20QueryDTO> getQueryListBackup() {
        return queryListBackup;
    }

    /**
     * Sets the query list backup.
     * 
     * @param queryListBackup
     *            the new query list backup
     */
    public void setQueryListBackup(List<Rl02c20QueryDTO> queryListBackup) {
        this.queryListBackup = queryListBackup;
    }
}
