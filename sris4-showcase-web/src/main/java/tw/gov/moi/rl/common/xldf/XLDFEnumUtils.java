/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.common.xldf;

import org.apache.commons.lang.StringUtils;

import tw.gov.moi.rl.component.dto.XLDFAction;
import tw.gov.moi.rl.component.dto.XLDFState;


/**
 * XLDFEnumUtils
 * 
 * @author DAXIONG
 */
public class XLDFEnumUtils {

    private static final String READ = "read";

    private static final String UPDATE = "update";

    private static final String INSERT = "insert";

    private static final String DELETE = "delete";

    private static final String COPY = "copy";

    private static final String NONE = "none";

    private static final String ORIGIN = "origin";

    private static final String CHANGED = "changed";

    /**
     * 依XLDFAction之值取得相對應字串
     * 
     * @param xldfAction
     * @return String
     */
    public static String getActionString(XLDFAction xldfAction) {
        String returnString = null;
        switch (xldfAction) {
        case read:
            returnString = READ;
            break;
        case update:
            returnString = UPDATE;
            break;
        case insert:
            returnString = INSERT;
            break;
        case delete:
            returnString = DELETE;
            break;
        case copy:
            returnString = COPY;
            break;
        case none:
            returnString = NONE;
            break;
        }
        return returnString;
    }

    /**
     * 依XLDFState之值取得相對應字串
     * 
     * @param xldfState
     * @return String
     */
    public static String getStateString(XLDFState xldfState) {
        String returnString = null;
        switch (xldfState) {
        case origin:
            returnString = ORIGIN;
            break;
        case changed:
            returnString = CHANGED;
            break;
        case none:
            returnString = NONE;
            break;
        }
        return returnString;
    }

    /**
     * 依字串取得XLDFAction相對應之值
     * 
     * @param actionString
     * @return XLDFAction
     */
    public static XLDFAction getActionEnum(String actionString) {
        if (StringUtils.equals(actionString, READ)) {
            return XLDFAction.read;
        } else if (StringUtils.equals(actionString, UPDATE)) {
            return XLDFAction.update;
        } else if (StringUtils.equals(actionString, INSERT)) {
            return XLDFAction.insert;
        } else if (StringUtils.equals(actionString, DELETE)) {
            return XLDFAction.delete;
        } else if (StringUtils.equals(actionString, COPY)) {
            return XLDFAction.copy;
        } else {
            return XLDFAction.none;
        }
    }

    /**
     * 依字串取得XLDFState相對應之值
     * 
     * @param stateString
     * @return XLDFState
     */
    public static XLDFState getStateEnum(String stateString) {
        if (StringUtils.equals(stateString, ORIGIN)) {
            return XLDFState.origin;
        } else if (StringUtils.equals(stateString, CHANGED)) {
            return XLDFState.changed;
        } else {
            return XLDFState.none;
        }
    }
}