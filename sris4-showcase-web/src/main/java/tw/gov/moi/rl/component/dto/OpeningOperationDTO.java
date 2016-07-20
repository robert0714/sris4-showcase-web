/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.dto;

import java.io.Serializable;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * The Class OpeningOperationDTO.
 */
public class OpeningOperationDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The operation sequence id. */
    @FieldName("作業序號")
    private String operationSequenceId;

    /** The loaded. */
    @FieldName("是否載入")
    private boolean loaded = false;

    /** The maintain mode. */
    @FieldName("處理模式")
    private OperationMaintainMode maintainMode;
    
    /** The maintain mode. */
    @FieldName("編輯模式所使用button")
    private  OperationMaintainMode.EditModeButton buttonMode;

    /** The edit mode number. */
    @FieldName("編輯模式紀錄編號")
    private  String editModeNumber;
    
    
    /**
     * Gets the operation sequence id.
     * 
     * @return the operation sequence id
     */
    public String getOperationSequenceId() {
        return operationSequenceId;
    }

    /**
     * Sets the operation sequence id.
     * 
     * @param operationSequenceId
     *            the new operation sequence id
     */
    public void setOperationSequenceId(final String operationSequenceId) {
        this.operationSequenceId = operationSequenceId;
    }

    /**
     * Checks if is loaded.
     * 
     * @return true, if is loaded
     */
    public boolean isLoaded() {
        return loaded;
    }

    /**
     * Sets the loaded.
     * 
     * @param loaded
     *            the new loaded
     */
    public void setLoaded(final boolean loaded) {
        this.loaded = loaded;
    }

    /**
     * Gets the maintain mode.
     * 
     * @return the maintain mode
     */
    public OperationMaintainMode getMaintainMode() {
        return maintainMode;
    }

    /**
     * Sets the maintain mode.
     * 
     * @param maintainMode
     *            the new maintain mode
     */
    public void setMaintainMode(final OperationMaintainMode maintainMode) {
        this.maintainMode = maintainMode;
    }

    public String getEditModeNumber() {
        return editModeNumber;
    }

    public void setEditModeNumber(String editModeNumber) {
        this.editModeNumber = editModeNumber;
    }

    public OperationMaintainMode.EditModeButton getButtonMode() {
        return buttonMode;
    }

    public void setButtonMode(OperationMaintainMode.EditModeButton buttonMode) {
        this.buttonMode = buttonMode;
    }
    
}