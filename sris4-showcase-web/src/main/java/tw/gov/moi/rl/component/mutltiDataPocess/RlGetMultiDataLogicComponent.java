package tw.gov.moi.rl.component.mutltiDataPocess;


import tw.gov.moi.rl.domain.RlGetMultiDataRequestDto;
import tw.gov.moi.rl.domain.RlGetMultiDataResponseDto;
import tw.gov.moi.rl.domain.RlRemoteCommandRequestDto;
import tw.gov.moi.rl.domain.RlRemoteCommandResponseDto;

/**
 * The Interface RlGetMultiDataLogicComponent.
 */
public interface RlGetMultiDataLogicComponent {
    /** The ER r_ cod e_1. */
     String ERR_CODE_1 = tw.gov.moi.rs.common.constant.RsCDMesg.TX6407E.getCode();

    /** The ER r_ cod e_2. */
     String ERR_CODE_2 = tw.gov.moi.rs.common.constant.RsCDMesg.TX6408E.getCode();

    /** The ER r_ cod e_3. */
     String ERR_CODE_3 = tw.gov.moi.rs.common.constant.RsCDMesg.TX6409E.getCode();

    /** The ER r_ cod e_4. */
     String ERR_CODE_4 = tw.gov.moi.rs.common.constant.RsCDMesg.TX6410E.getCode();

    /** The ER r_ ms g_1. */
     String ERR_MSG_1 = "鎖定失敗";

    /** The ER r_ ms g_2. */
     String ERR_MSG_2 = "解鎖失敗";

    /** The ER r_ ms g_3. */
     String ERR_MSG_3 = "檢核鎖定失敗";

    /** The ER r_ ms g_4. */
     String ERR_MSG_4 = "檢核鎖定型態失敗";
    
    /**
     * Process request on server side.
     *
     * @param requestDto the request dto
     * @return the rl get multi data response dto
     */
    RlGetMultiDataResponseDto processRequestOnServerSide(final RlGetMultiDataRequestDto requestDto) ;

    /**
     * Process remote command request on server side.
     *
     * @param requestDto the request dto
     * @return the rl remote command response dto
     */
    RlRemoteCommandResponseDto processRemoteCommandRequestOnServerSide(RlRemoteCommandRequestDto requestDto);
    
    
}
