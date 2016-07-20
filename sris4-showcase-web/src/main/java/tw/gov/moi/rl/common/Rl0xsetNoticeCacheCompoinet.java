package tw.gov.moi.rl.common;

import java.util.List;

import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rs.dto.ObnfDTO;

/**
 * 
 * 資料紀錄共用元件
 * 
 * @author Andy
 * 
 */
public interface Rl0xsetNoticeCacheCompoinet {

    public void cleanNotice() throws RisBusinessException;

    public void addNoticeSrc(String name, ObnfDTO src) throws RisBusinessException;

    public void addNoticeSrc(String name, List<ObnfDTO> src) throws RisBusinessException;

    // public Object getNoticeByKey(String name) throws RisBusinessException;

    // public void cleanCache() throws RisBusinessException;

    // public Map<String, Object> getAll() throws RisBusinessException;

    public List<ObnfDTO> makeNotices() throws RisBusinessException;

}
