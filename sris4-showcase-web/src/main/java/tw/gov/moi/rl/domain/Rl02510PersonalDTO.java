/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * 列印選擇視窗 DTO.
 * 
 * @author Weiren.Jheng
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl02510PersonalDTO", propOrder = { "printRelationshipFlag", "printNameFlag", "printPersonIdFlag", "printSpouseFlag", "printBirthPlaceFlag", "printBirthYyymmddFlag", "printFatherFlag", "printMotherFlag", "printLivingStyleFlag", "printBirthOrderSexFlag", "printRegisterContentFlag" })
@XmlRootElement(name = "Rl02510PersonalDTO")
public class Rl02510PersonalDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /**
     * 省略列印稱謂旗標<BR>
     * Default:false.
     */
    @XmlElement(name = "PrintRelationshipFlag")
    @FieldName("省略列印稱謂旗標")
    private boolean printRelationshipFlag = false;

    /**
     * 省略列印姓名旗標<BR>
     * Default:false.
     */
    @XmlElement(name = "PrintNameFlag")
    @FieldName("省略列印姓名旗標")
    private boolean printNameFlag = false;

    /**
     * 省略列印統號旗標<BR>
     * Default:false.
     */
    @XmlElement(name = "PrintPersonIdFlag")
    @FieldName("省略列印統號旗標")
    private boolean printPersonIdFlag = false;

    /**
     * 省略列印配偶旗標<BR>
     * Default:false.
     */
    @XmlElement(name = "PrintSpouseFlag")
    @FieldName("省略列印配偶旗標")
    private boolean printSpouseFlag = false;

    /**
     * 省略列印出生地旗標<BR>
     * Default:false.
     */
    @XmlElement(name = "PrintBirthPlaceFlag")
    @FieldName("省略列印出生地旗標")
    private boolean printBirthPlaceFlag = false;

    /**
     * 省略列印出生日期旗標<BR>
     * Default:false.
     */
    @XmlElement(name = "PrintBirthYyymmddFlag")
    @FieldName("省略列印出生日期旗標")
    private boolean printBirthYyymmddFlag = false;

    /**
     * 省略列印父旗標<BR>
     * Default:false.
     */
    @XmlElement(name = "PrintFatherFlag")
    @FieldName("省略列印父旗標")
    private boolean printFatherFlag = false;

    /**
     * 省略列印母旗標<BR>
     * Default:false.
     */
    @XmlElement(name = "PrintMotherFlag")
    @FieldName("省略列印母旗標")
    private boolean printMotherFlag = false;

    /**
     * 省略列印原住民身分及族別旗標<BR>
     * Default:false.
     */
    @XmlElement(name = "PrintLivingStyleFlag")
    @FieldName("省略列印原住民身分及族別旗標")
    private boolean printLivingStyleFlag = false;

    /**
     * 省略列印出生別旗標<BR>
     * Default:false.
     */
    @XmlElement(name = "PrintBirthOrderSexFlag")
    @FieldName("省略列印出生別旗標")
    private boolean printBirthOrderSexFlag = false;

    /**
     * 省略列印記事旗標<BR>
     * Default:false.
     */
    @XmlElement(name = "PrintRegisterContentFlag")
    @FieldName("省略列印記事旗標")
    private boolean printRegisterContentFlag = false;

    /**
     * Checks if is prints the name flag.
     * 
     * @return true, if is prints the name flag
     */
    public boolean isPrintNameFlag() {
        return printNameFlag;
    }

    /**
     * Sets the prints the name flag.
     * 
     * @param printNameFlag
     *            the new prints the name flag
     */
    public void setPrintNameFlag(boolean printNameFlag) {
        this.printNameFlag = printNameFlag;
    }

    /**
     * Checks if is prints the person id flag.
     * 
     * @return true, if is prints the person id flag
     */
    public boolean isPrintPersonIdFlag() {
        return printPersonIdFlag;
    }

    /**
     * Sets the prints the person id flag.
     * 
     * @param printPersonIdFlag
     *            the new prints the person id flag
     */
    public void setPrintPersonIdFlag(boolean printPersonIdFlag) {
        this.printPersonIdFlag = printPersonIdFlag;
    }

    /**
     * Checks if is prints the spouse flag.
     * 
     * @return true, if is prints the spouse flag
     */
    public boolean isPrintSpouseFlag() {
        return printSpouseFlag;
    }

    /**
     * Sets the prints the spouse flag.
     * 
     * @param printSpouseFlag
     *            the new prints the spouse flag
     */
    public void setPrintSpouseFlag(boolean printSpouseFlag) {
        this.printSpouseFlag = printSpouseFlag;
    }

    /**
     * Checks if is prints the birth place flag.
     * 
     * @return true, if is prints the birth place flag
     */
    public boolean isPrintBirthPlaceFlag() {
        return printBirthPlaceFlag;
    }

    /**
     * Sets the prints the birth place flag.
     * 
     * @param printBirthPlaceFlag
     *            the new prints the birth place flag
     */
    public void setPrintBirthPlaceFlag(boolean printBirthPlaceFlag) {
        this.printBirthPlaceFlag = printBirthPlaceFlag;
    }

    /**
     * Checks if is prints the birth yyymmdd flag.
     * 
     * @return true, if is prints the birth yyymmdd flag
     */
    public boolean isPrintBirthYyymmddFlag() {
        return printBirthYyymmddFlag;
    }

    /**
     * Sets the prints the birth yyymmdd flag.
     * 
     * @param printBirthYyymmddFlag
     *            the new prints the birth yyymmdd flag
     */
    public void setPrintBirthYyymmddFlag(boolean printBirthYyymmddFlag) {
        this.printBirthYyymmddFlag = printBirthYyymmddFlag;
    }

    /**
     * Checks if is prints the father flag.
     * 
     * @return true, if is prints the father flag
     */
    public boolean isPrintFatherFlag() {
        return printFatherFlag;
    }

    /**
     * Sets the prints the father flag.
     * 
     * @param printFatherFlag
     *            the new prints the father flag
     */
    public void setPrintFatherFlag(boolean printFatherFlag) {
        this.printFatherFlag = printFatherFlag;
    }

    /**
     * Checks if is prints the mother flag.
     * 
     * @return true, if is prints the mother flag
     */
    public boolean isPrintMotherFlag() {
        return printMotherFlag;
    }

    /**
     * Sets the prints the mother flag.
     * 
     * @param printMotherFlag
     *            the new prints the mother flag
     */
    public void setPrintMotherFlag(boolean printMotherFlag) {
        this.printMotherFlag = printMotherFlag;
    }

    /**
     * Checks if is prints the living style flag.
     * 
     * @return true, if is prints the living style flag
     */
    public boolean isPrintLivingStyleFlag() {
        return printLivingStyleFlag;
    }

    /**
     * Sets the prints the living style flag.
     * 
     * @param printLivingStyleFlag
     *            the new prints the living style flag
     */
    public void setPrintLivingStyleFlag(boolean printLivingStyleFlag) {
        this.printLivingStyleFlag = printLivingStyleFlag;
    }

    /**
     * Checks if is prints the birth order sex flag.
     * 
     * @return true, if is prints the birth order sex flag
     */
    public boolean isPrintBirthOrderSexFlag() {
        return printBirthOrderSexFlag;
    }

    /**
     * Sets the prints the birth order sex flag.
     * 
     * @param printBirthOrderSexFlag
     *            the new prints the birth order sex flag
     */
    public void setPrintBirthOrderSexFlag(boolean printBirthOrderSexFlag) {
        this.printBirthOrderSexFlag = printBirthOrderSexFlag;
    }

    /**
     * Checks if is prints the register content flag.
     * 
     * @return true, if is prints the register content flag
     */
    public boolean isPrintRegisterContentFlag() {
        return printRegisterContentFlag;
    }

    /**
     * Sets the prints the register content flag.
     * 
     * @param printRegisterContentFlag
     *            the new prints the register content flag
     */
    public void setPrintRegisterContentFlag(boolean printRegisterContentFlag) {
        this.printRegisterContentFlag = printRegisterContentFlag;
    }

    /**
     * Checks if is prints the relationship flag.
     * 
     * @return true, if is prints the relationship flag
     */
    public boolean isPrintRelationshipFlag() {
        return printRelationshipFlag;
    }

    /**
     * Sets the prints the relationship flag.
     * 
     * @param printRelationshipFlag
     *            the new prints the relationship flag
     */
    public void setPrintRelationshipFlag(boolean printRelationshipFlag) {
        this.printRelationshipFlag = printRelationshipFlag;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (printBirthOrderSexFlag ? 1231 : 1237);
        result = prime * result + (printBirthPlaceFlag ? 1231 : 1237);
        result = prime * result + (printBirthYyymmddFlag ? 1231 : 1237);
        result = prime * result + (printFatherFlag ? 1231 : 1237);
        result = prime * result + (printLivingStyleFlag ? 1231 : 1237);
        result = prime * result + (printMotherFlag ? 1231 : 1237);
        result = prime * result + (printNameFlag ? 1231 : 1237);
        result = prime * result + (printPersonIdFlag ? 1231 : 1237);
        result = prime * result + (printRegisterContentFlag ? 1231 : 1237);
        result = prime * result + (printRelationshipFlag ? 1231 : 1237);
        result = prime * result + (printSpouseFlag ? 1231 : 1237);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Rl02510PersonalDTO other = (Rl02510PersonalDTO) obj;
        if (printBirthOrderSexFlag != other.printBirthOrderSexFlag)
            return false;
        if (printBirthPlaceFlag != other.printBirthPlaceFlag)
            return false;
        if (printBirthYyymmddFlag != other.printBirthYyymmddFlag)
            return false;
        if (printFatherFlag != other.printFatherFlag)
            return false;
        if (printLivingStyleFlag != other.printLivingStyleFlag)
            return false;
        if (printMotherFlag != other.printMotherFlag)
            return false;
        if (printNameFlag != other.printNameFlag)
            return false;
        if (printPersonIdFlag != other.printPersonIdFlag)
            return false;
        if (printRegisterContentFlag != other.printRegisterContentFlag)
            return false;
        if (printRelationshipFlag != other.printRelationshipFlag)
            return false;
        if (printSpouseFlag != other.printSpouseFlag)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Rl02510PersonalDTO [printRelationshipFlag=" + printRelationshipFlag + ", printNameFlag=" + printNameFlag + ", printPersonIdFlag=" + printPersonIdFlag + ", printSpouseFlag=" + printSpouseFlag + ", printBirthPlaceFlag=" + printBirthPlaceFlag + ", printBirthYyymmddFlag="
                + printBirthYyymmddFlag + ", printFatherFlag=" + printFatherFlag + ", printMotherFlag=" + printMotherFlag + ", printLivingStyleFlag=" + printLivingStyleFlag + ", printBirthOrderSexFlag=" + printBirthOrderSexFlag + ", printRegisterContentFlag=" + printRegisterContentFlag + "]";
    }

}
