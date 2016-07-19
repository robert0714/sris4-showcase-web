package tw.gov.moi.rl.component;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rl.domain.OperationNoticeHouseholdDTO;

/***
 * 專門通知戶籍大簿的元件
 * **/
public interface OperationNoticeHouseholdComponent {
    /**
     * 專門給L3登記知大簿
     * **/
    public void noticeHouseholdMaitainPart(final OperationNoticeHouseholdDTO operationNoticeHouseholdDTO ,final  ExecutantType executantType);
}
