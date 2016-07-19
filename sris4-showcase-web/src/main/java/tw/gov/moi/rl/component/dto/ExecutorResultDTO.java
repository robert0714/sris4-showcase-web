/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.dto;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.ae.personimage.domain.ImageMessage;
import tw.gov.moi.ae.personimage.domain.ImgIndexPkeyDto;
import tw.gov.moi.ae.personimage.domain.MkDto;

/**
 * @author marcus
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "executorResultDTO", propOrder = { "mkDTOList", "imgIndexPkeyDtoList", "imageMesg" })
@XmlRootElement(name = "ExecutorResultDTO")
public class ExecutorResultDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 3923140623325060334L;

    /** 修改身分證影像DTO回傳資料.(mkDTOList) */
    @XmlElement(name = "MkDTOList", required = true)
    @FieldName("mkDTOList")
    private List<MkDto> mkDTOList;

    /** 修改身分證影像DTO回傳資料.(mkDTOList) */
    @XmlElement(name = "ImgIndexPkeyDtoList", required = true)
    @FieldName("imgIndexPkeyDtoList")
    private List<ImgIndexPkeyDto> imgIndexPkeyDtoList;

    /** 修改身分證影像DTO回傳資料.(mkDTOList) */
    @XmlElement(name = "ImageMesg", required = true)
    @FieldName("imageMesg")
    private ImageMessage imageMesg;

    public ExecutorResultDTO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public ExecutorResultDTO(List<MkDto> mkDTOList, List<ImgIndexPkeyDto> imgIndexPkeyDtoList, ImageMessage imageMesg) {
        super();
        this.mkDTOList = mkDTOList;
        this.imgIndexPkeyDtoList = imgIndexPkeyDtoList;
        this.imageMesg = imageMesg;
    }

    /**
     * @return the mkDTOList
     */
    public List<MkDto> getMkDTOList() {
        return mkDTOList;
    }

    /**
     * @param mkDTOList
     *            the mkDTOList to set
     */
    public void setMkDTOList(List<MkDto> mkDTOList) {
        this.mkDTOList = mkDTOList;
    }

    /**
     * @return the imgIndexPkeyDtoList
     */
    public List<ImgIndexPkeyDto> getImgIndexPkeyDtoList() {
        return imgIndexPkeyDtoList;
    }

    /**
     * @param imgIndexPkeyDtoList
     *            the imgIndexPkeyDtoList to set
     */
    public void setImgIndexPkeyDtoList(List<ImgIndexPkeyDto> imgIndexPkeyDtoList) {
        this.imgIndexPkeyDtoList = imgIndexPkeyDtoList;
    }

    /**
     * @return the imageMesg
     */
    public ImageMessage getImageMesg() {
        return imageMesg;
    }

    /**
     * @param imageMesg
     *            the imageMesg to set
     */
    public void setImageMesg(ImageMessage imageMesg) {
        this.imageMesg = imageMesg;
    }

}
