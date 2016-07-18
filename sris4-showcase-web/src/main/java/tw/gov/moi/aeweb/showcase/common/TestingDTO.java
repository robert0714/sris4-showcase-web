/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.aeweb.showcase.common;

import java.io.Serializable;
import java.math.BigDecimal;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * @author tsaicf
 */
public class TestingDTO implements Serializable {

    //================================================
    //== [Enumeration types] Block Start
    //== [Enumeration types] Block End 
    //================================================
    //== [static variables] Block Start

    /**
     * 
     */
    private static final long serialVersionUID = 5300181620390493790L;

    //== [static variables] Block Stop 
    //================================================
    //== [instance variables] Block Start
    //@formatter:off

    int                pint       ;          
    double             pdouble    ;          
    boolean            pboolean   ;          
    float              pfloat     ;          
    long               plong      ;          
    byte               pbyte      ;          
    char               pchar      ;
    
    Integer            boxInt     ;            
    Double             boxDouble  ;            
    Boolean            boxBoolean ;            
    Float              boxFloat   ;            
    Long               boxLong    ;            
    Byte               boxByte    ;            
    Character          boxChar    ;
  
    Integer            notNullInt     = 1         ;            
    Double             notNullDouble  = 2d        ;            
    Boolean            notNullBoolean = true      ;            
    Float              notNullFloat   = 3f        ;            
    Long               notNullLong    = 4l        ;            
    Byte               notNullByte    = new Byte("5")    ;            
    Character          notNullChar    = 'a';      ;
    
    String             varStr     ;
    String             varStr1    ="" ;
    String             varStr2    ="XXX";
    String             varStr3    ="setup to NULL";
    String             varStr4    =null;
    String             varStr5    ="中文";
    String             varStr6    ;
    String             varStr7    ;

    Object             varObj     ;
    Object             varObj2    ;
    
    //@formatter:on

    //== [instance variables] Block Stop 
    //================================================
    //== [static Constructor] Block Start
    //== [static Constructor] Block Stop 
    //================================================
    //== [Constructors] Block Start (含init method)
    //== [Constructors] Block Stop 
    //================================================
    //== [Static Method] Block Start

    /**
     * 
     */
    static TestingDTO newDefault() {
        TestingDTO obj = new TestingDTO();

        obj.pint = 1;
        obj.pdouble = 2d;
        obj.pboolean = false;
        obj.pfloat = 3f;
        obj.plong = 4l;
        obj.pbyte = (byte) 5;
        obj.pchar = 'a';
        obj.varStr = "B";
        obj.varObj = new BigDecimal("8");
        obj.boxInt = 1;
        obj.boxDouble = 2d;
        obj.boxBoolean = false;
        obj.boxFloat = 3f;
        obj.boxLong = 4l;
        obj.boxByte = (byte) 5;
        obj.boxChar = 'a';

        obj.notNullInt = null;
        obj.notNullDouble = null;
        obj.notNullBoolean = null;
        obj.notNullFloat = null;
        obj.notNullLong = null;
        obj.notNullByte = null;
        obj.notNullChar = null;
        obj.varStr3 = null;
        return obj;
    }

    //== [Static Method] Block Stop 
    //================================================
    //== [Accessor] Block Start
    //== [Accessor] Block Stop 
    //================================================
    //== [Overrided Method] Block Start (Ex. toString/equals+hashCode)

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj, true);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this, true);
    }

    @Override
    public String toString() {
        return org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(this,
                org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE);
    }

    //== [Overrided Method] Block Stop 
    //================================================
    //== [Method] Block Start
    //####################################################################
    //## [Method] sub-block : 
    //####################################################################  

    public int getPint() {
        return this.pint;
    }

    public void setPint(int pint) {
        this.pint = pint;
    }

    public double getPdouble() {
        return this.pdouble;
    }

    public void setPdouble(double pdouble) {
        this.pdouble = pdouble;
    }

    public boolean isPboolean() {
        return this.pboolean;
    }

    public void setPboolean(boolean pboolean) {
        this.pboolean = pboolean;
    }

    public float getPfloat() {
        return this.pfloat;
    }

    public void setPfloat(float pfloat) {
        this.pfloat = pfloat;
    }

    public long getPlong() {
        return this.plong;
    }

    public void setPlong(long plong) {
        this.plong = plong;
    }

    public byte getPbyte() {
        return this.pbyte;
    }

    public void setPbyte(byte pbyte) {
        this.pbyte = pbyte;
    }

    public char getPchar() {
        return this.pchar;
    }

    public void setPchar(char pchar) {
        this.pchar = pchar;
    }

    public Object getVarObj() {
        return this.varObj;
    }

    public void setVarObj(Object varObj) {
        this.varObj = varObj;
    }

    public Object getVarObj2() {
        return this.varObj2;
    }

    public void setVarObj2(Object varObj2) {
        this.varObj2 = varObj2;
    }

    public Integer getBoxInt() {
        return this.boxInt;
    }

    public void setBoxInt(Integer boxInt) {
        this.boxInt = boxInt;
    }

    public Double getBoxDouble() {
        return this.boxDouble;
    }

    public void setBoxDouble(Double boxDouble) {
        this.boxDouble = boxDouble;
    }

    public Boolean getBoxBoolean() {
        return this.boxBoolean;
    }

    public void setBoxBoolean(Boolean boxBoolean) {
        this.boxBoolean = boxBoolean;
    }

    public Float getBoxFloat() {
        return this.boxFloat;
    }

    public void setBoxFloat(Float boxFloat) {
        this.boxFloat = boxFloat;
    }

    public Long getBoxLong() {
        return this.boxLong;
    }

    public void setBoxLong(Long boxLong) {
        this.boxLong = boxLong;
    }

    public Byte getBoxByte() {
        return this.boxByte;
    }

    public void setBoxByte(Byte boxByte) {
        this.boxByte = boxByte;
    }

    public Character getBoxChar() {
        return this.boxChar;
    }

    public void setBoxChar(Character boxChar) {
        this.boxChar = boxChar;
    }

    public Integer getNotNullInt() {
        return this.notNullInt;
    }

    public void setNotNullInt(Integer notNullInt) {
        this.notNullInt = notNullInt;
    }

    public Double getNotNullDouble() {
        return this.notNullDouble;
    }

    public void setNotNullDouble(Double notNullDouble) {
        this.notNullDouble = notNullDouble;
    }

    public Boolean getNotNullBoolean() {
        return this.notNullBoolean;
    }

    public void setNotNullBoolean(Boolean notNullBoolean) {
        this.notNullBoolean = notNullBoolean;
    }

    public Float getNotNullFloat() {
        return this.notNullFloat;
    }

    public void setNotNullFloat(Float notNullFloat) {
        this.notNullFloat = notNullFloat;
    }

    public Long getNotNullLong() {
        return this.notNullLong;
    }

    public void setNotNullLong(Long notNullLong) {
        this.notNullLong = notNullLong;
    }

    public Byte getNotNullByte() {
        return this.notNullByte;
    }

    public void setNotNullByte(Byte notNullByte) {
        this.notNullByte = notNullByte;
    }

    public Character getNotNullChar() {
        return this.notNullChar;
    }

    public void setNotNullChar(Character notNullChar) {
        this.notNullChar = notNullChar;
    }

    public String getVarStr() {
        return this.varStr;
    }

    public void setVarStr(String varStr) {
        this.varStr = varStr;
    }

    public String getVarStr1() {
        return this.varStr1;
    }

    public void setVarStr1(String varStr1) {
        this.varStr1 = varStr1;
    }

    public String getVarStr2() {
        return this.varStr2;
    }

    public void setVarStr2(String varStr2) {
        this.varStr2 = varStr2;
    }

    public String getVarStr3() {
        return this.varStr3;
    }

    public void setVarStr3(String varStr3) {
        this.varStr3 = varStr3;
    }

    public String getVarStr4() {
        return this.varStr4;
    }

    public void setVarStr4(String varStr4) {
        this.varStr4 = varStr4;
    }

    public String getVarStr5() {
        return this.varStr5;
    }

    public void setVarStr5(String varStr5) {
        this.varStr5 = varStr5;
    }

    public String getVarStr6() {
        return this.varStr6;
    }

    public void setVarStr6(String varStr6) {
        this.varStr6 = varStr6;
    }

    public String getVarStr7() {
        return this.varStr7;
    }

    public void setVarStr7(String varStr7) {
        this.varStr7 = varStr7;
    }

    //== [Method] Block Stop 
    //================================================
}
