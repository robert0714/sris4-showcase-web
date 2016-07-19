package tw.gov.moi.rl.common;

import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rl.domain.Rl0x001DTO;
import tw.gov.moi.rs.dto.ObnfDTO;

public interface Rl0xSetApplyComponet {
    /**
     * 取得共用通報資料 <li>申請書本身:T S R W table <li>索引檔:rldfv003 <li>
     * 記錄檔:record(rldfs401...) <li>舊的附繳證件紀錄: Rldfv005 <li>新的附繳證件紀錄:Rldfv006
     * 
     * @param dto
     * @param exe
     * @return
     */
    public List<ObnfDTO> getCommonNoticets(Rl0x001DTO dto, ExecutantType exe);
}
