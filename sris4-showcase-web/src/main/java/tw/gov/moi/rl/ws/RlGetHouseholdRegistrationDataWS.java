/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.ws;

import javax.jws.HandlerChain;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rs.common.constant.RsConstant;
import tw.gov.moi.rs.dto.ElecRegisDTO;

/**
 * The Interface RlGetHouseholdRegistrationDataWS.
 * 
 * @author Jay Kan
 */
@SOAPBinding(style = Style.DOCUMENT)
@HandlerChain(file = RlConstant.HandlerChain_PATH)
@WebService(name = RlConstant.NAME_RlGetHouseholdRegistrationDataWS, serviceName = RlConstant.SERVICE_NAME_RlGetHouseholdRegistrationDataWS, targetNamespace = RlConstant.Namespace_RL)
public interface RlGetHouseholdRegistrationDataWS {

    /** 鄰 */
    String NEIGHBOR_CHAR = "鄰";

    /** 當事人 */
    String CURRENT_PERSON = "當事人";

    /** 申請人 */
    String APPLICANT = "申請人";

    /** 受委託人 */
    String DELEGATED_PERSON = "受委託人";

    /** 省略記事共%s筆 */
    String NOT_PRINT_TEMPLATE = "省略記事共%s筆。";

    /** 戶口校正 */
    String CORRECT_PRINT_TEMPLATE = "%s年戶校。";

    /** 役別 */
    String MILITARY_PRINT_TEMPLATE = "%s。";

    /** 補、換證 */
    String ID_CARD_APPLY_TEMPLAT = "%s%s。";

    String BY_PASS = "省略";

    String NOTE_BY_PASS = "記事省略";

    /** 頓號 */
    String COMMA = "、";

    /** 句號 */
    String PERIOD = "。";

    /** 分號 */
    String SEMICOLON = "；";

    /** 全型空白 */
    String SPACE = "　";

    /** 執行「儲存列印資料」失敗 */
    String SAVE_PRINT = "執行「儲存列印資料」失敗";

    /** 寄居 */
    String SOJOURNED = "寄居";

    /** 寄居 */
    String SOJOURNED_REASON = "經查您為該戶寄居人口，如須申請戶內人口戶籍資料，請提憑戶長或戶內人口委託書或同意書至任一戶政事務所申請，或可至「現戶部分電子戶籍謄本」填具個人國民身分證統一證號申請個人之電子戶籍謄本。";

    // String RSCDMESG = "RSCDMESG";
    // String RSCD3514 = "RSCD3514";
    // String RSS00000 = "RSS00000";
    // String RSCD0107 = "RSCD0107";
    // String RSCD0201 = "RSCD0201";
    // String RSCD0220 = "RSCD0220";
    // String RSCD0214 = "RSCD0214";
    // String RSCD3110 = "RSCD3110";
    // String RSCD0217 = "RSCD0217";
    String RSWM00000 = "RSWM00000";
    String GET_REPORT_PAGE_COUNT = "執行「取得報表頁數」失敗";
    String ADMIN_OFFICE = "戶政事務所";
    String ColonAndSpace = ": ";

    // String RSCD0212 = "RSCD0212";

    /**
     * Gets the data.
     * 
     * @param elecRegisDTO
     *            the elec regis dto
     * @return the data
     */
    @WebResult(name = "getData", targetNamespace = RlConstant.Namespace_RIS)
    ElecRegisDTO getData(
            @WebParam(name = "elecRegisDTO", targetNamespace = RsConstant.NAME_SPACE_RS_DTO) final ElecRegisDTO elecRegisDTO);
}
