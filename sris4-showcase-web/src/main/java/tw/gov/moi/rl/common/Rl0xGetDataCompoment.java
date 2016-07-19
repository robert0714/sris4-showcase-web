package tw.gov.moi.rl.common;

import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.domain.Rldfv003Type;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0x001DTO;

/**
 * 取得職更取得資料共用元件取得
 * 
 * @author Andy
 * 
 * @param <T1>記錄檔 <T2>來源樣式
 */
public interface Rl0xGetDataCompoment<T1, T2> {

    /**
     * 取得記錄檔，並將資料存於mainDTO
     * 
     * 
     * @param mainDto
     * @param exe
     * @return
     * @throws RisBusinessException
     */
    public T1 getRecored(Rl0x001DTO mainDto, ExecutantType exe) throws RisBusinessException;

    /**
     * 取得紀錄索引，並將資料存於mainDTO
     * 
     * @param mainDto
     * @param exe
     * @return
     * @throws RisBusinessException
     */
    public Rldfv003Type getRldfv003(Rl0x001DTO mainDto, ExecutantType exe) throws RisBusinessException;

    /**
     * 取得查詢結果，並將資料存於mainDTO
     * 
     * @param mainDto
     * @param exe
     * @return
     * @throws RisBusinessException
     */
    public List<T2> getQueryResult(Rl0x001DTO mainDto, ExecutantType exe) throws RisBusinessException;

    /**
     * 取得查詢結果用於申請書，並將資料存於mainDTO
     * 
     * @param mainDto
     * @param exe
     * @return
     * @throws RisBusinessException
     */
    public List<T2> getQueryResultByApp(Rl0x001DTO mainDto, ExecutantType exe) throws RisBusinessException;

}
