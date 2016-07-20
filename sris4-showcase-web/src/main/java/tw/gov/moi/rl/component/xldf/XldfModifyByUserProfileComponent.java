package tw.gov.moi.rl.component.xldf;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.dbo.operator.DBSMain;
import tw.gov.moi.rl.component.dto.XLDFCreationParams;
import tw.gov.moi.rl.component.xldf.dto.XLDF001MT;
import tw.gov.moi.rl.component.xldf.dto.XLDF004MT;
import tw.gov.moi.rl.domain.UserXldfProfileDto;

public interface XldfModifyByUserProfileComponent {
    /**
     * 給XLDFManipulationExtendedComponent,XLDFManipulationPlusComponent使用...
     * 針對DB中已經產生XLDF001MT..戶長號碼為"Y100000000" 的資料作處理,
     * 所做的處理是依戶籍員資料在從RSDFUSERXLDFPROFILE找出紀錄檔以便進行更新XLDF001MT的記憶體,資料庫資料
     * <p>如果回傳值為null,表示該戶籍員之前在作補登作業時,沒存過戶長號碼為"Y100000000"的TLDF001M</p>
     * 
     * @param params
     *            xldf 領域物件產生參數 {@link #XLDFCreationParams}
     * @param conn
     *            DB連線物件 {@link #DBSMain}
     * @param executantType
     *            執行環境參數 {@link #ExecutantType}
     * @return XLDF004MT {@link #XLDF004MT}
     * 
     */
    public XLDF001MT loadY1000000ByUserIdToXLDF001MT(final XLDFCreationParams params , final ExecutantType executantType);
    
    /**
     * 給XLDFManipulationExtendedComponent,XLDFManipulationPlusComponent使用...
     * 針對DB中已經產生XLDF004MT..戶長號碼為"Y100000000"的資料作處理,
     * 所做的處理是依戶籍員資料在從RSDFUSERXLDFPROFILE找出紀錄檔以便進行更新XLDF004MT的記憶體,資料庫資料
     * <p>如果回傳值為null,表示該戶籍員之前在作補登作業時,沒存過戶長號碼為"Y100000000"的TLDF004M</p>
     * @param params
     *            xldf 領域物件產生參數 {@link #XLDFCreationParams}
     * @param conn
     *            DB連線物件 {@link #DBSMain}
     * @param executantType
     *            執行環境參數 {@link #ExecutantType}
     * @return XLDF004MT {@link #XLDF004MT}
     * 
     */
    public XLDF004MT loadY1000000ByUserIdToXLDF004MT(final XLDFCreationParams params , final ExecutantType executantType);
    /**
     * 給192補登作業使用...如果該名戶籍員有曾經對統號"Y100000000"進行192補登作業,
     * 使用此方法可以帶入該戶籍員曾經補登的XLDF004MT（但是不會在DB留下紀錄）
     * <p>如果回傳值為null,表示該戶籍員之前在作補登作業時,沒存過戶長號碼為"Y100000000"的TLDF004M</p>
     * @param conn
     *            DB連線物件 {@link #DBSMain}
     * @param executantType
     *            執行環境參數 {@link #ExecutantType}
     * @return XLDF004MT {@link #XLDF004MT}
     * 
     */
    public XLDF004MT loadXLDF004MT(final ExecutantType executantType);
    
    /**
     * 給192補登作業使用...如果該名戶籍員有曾經對統號"Y100000000"進行192補登作業,
     * 使用此方法可以帶入該戶籍員曾經補登的XLDF001MT(但是不會在DB留下紀錄）
     * <p>如果回傳值為null,表示該戶籍員之前在作補登作業時,沒存過戶長號碼為"Y100000000"的TLDF001M</p>
     * @param conn
     *            DB連線物件 {@link #DBSMain}
     * @param executantType
     *            執行環境參數 {@link #ExecutantType}
     * @return XLDF001MT {@link #XLDF001MT}
     * 
     */
    public XLDF001MT loadXLDF001MT( final ExecutantType executantType);
    
    /**
     * 給192補登作業使用...給該名戶籍員有對統號"Y100000000"進行對 RSDFUSERXLDFPROFILE進行維護紀錄
     * @param dto 維護Data Transfer Object  {@link #UserXldfProfileDto}
     * @param conn   DB連線物件 {@link #DBSMain}
     * @param executantType  執行環境參數 {@link #ExecutantType}
     * 
     */
    public void saveOrUpdateUserProfile(final UserXldfProfileDto dto, final ExecutantType executantType);
    
    
    
    /**
     * 給192補登作業使用...給該名戶籍員有對統號"Y100000000"進行對 RSDFUSERXLDFPROFILE進行維護紀錄
     * @param dto 維護Data Transfer Object  {@link #UserXldfProfileDto}
     * @param conn   DB連線物件 {@link #DBSMain}
     * @param executantType  執行環境參數 {@link #ExecutantType}
     * 
     */
    public void saveOrUpdateUserProfile(final UserXldfProfileDto dto, DBSMain dbs, final ExecutantType executantType);
    
    /**
     * 給192補登作業使用...如果該名戶籍員有曾經對統號"Y100000000"進行192補登作業,
     * 使用此方法可以帶入該戶籍員曾經補登的XLDF001MT(但是不會在DB留下紀錄）
     * <p>如果回傳值為null,表示該戶籍員之前在作補登作業時,沒存過戶長號碼為"Y100000000"的TLDF001M</p>
     * @param conn
     *            DB連線物件 {@link #DBSMain}
     * @param executantType
     *            執行環境參數 {@link #ExecutantType}
     * @return XLDF001MT {@link #XLDF001MT}
     * 
     */
    public XLDF001MT loadXLDF001MT(final  DBSMain dbs, final ExecutantType executantType);
    
    /**
     * 給192補登作業使用...如果該名戶籍員有曾經對統號"Y100000000"進行192補登作業,
     * 使用此方法可以帶入該戶籍員曾經補登的XLDF004MT（但是不會在DB留下紀錄）
     * <p>如果回傳值為null,表示該戶籍員之前在作補登作業時,沒存過戶長號碼為"Y100000000"的TLDF004M</p>
     * @param conn
     *            DB連線物件 {@link #DBSMain}
     * @param executantType
     *            執行環境參數 {@link #ExecutantType}
     * @return XLDF004MT {@link #XLDF004MT}
     * 
     */
    public XLDF004MT loadXLDF004MT(final DBSMain dbs,final  ExecutantType executantType);

   
}
