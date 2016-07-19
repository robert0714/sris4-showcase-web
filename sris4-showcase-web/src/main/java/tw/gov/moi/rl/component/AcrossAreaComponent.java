package tw.gov.moi.rl.component;

import java.util.List;
import java.util.Map;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.dbo.entity.SelectEntity;
import tw.gov.moi.dbo.operator.DBSMain;
import tw.gov.moi.domain.Rlde490wType;
import tw.gov.moi.domain.Rlde492wType;
import tw.gov.moi.domain.Rldf001mType;
import tw.gov.moi.domain.Rldf002mType;
import tw.gov.moi.domain.Rldf004mType;
import tw.gov.moi.domain.Rldf004nType;
import tw.gov.moi.domain.Rldf018dType;
import tw.gov.moi.domain.Rldf019mType;
import tw.gov.moi.domain.Rldf020mType;
import tw.gov.moi.rs.dto.ObnfDTO;

/**
 * 跨行政區域調整元件
 * 
 * @author Jason Huang
 */
public interface AcrossAreaComponent {

    enum ActionType {
        I, U, D
    }

    /**
     * Object To Map
     * 
     * @param obj
     * @param name
     * @return
     */
    public Map<String, String> objectToMap(Object obj, String... names);

    /**
     * 建立RCDF019M通報
     * 
     * @param rldf019M
     * @param wkChgType
     *            異動類型
     * @param fromSiteId
     *            來源作業點
     * @param oldAddrTxCode
     *            舊地址異動模式
     * @param newAddrTxCode
     *            新地址異動模式
     * @return
     */
    public ObnfDTO makeRCDF019MObnfDTO(Rldf019mType rldf019M, String wkChgType, String fromSiteId,
            String oldAddrTxCode, String newAddrTxCode);

    public ObnfDTO makeRCDF001MObnfDTO4140(Rldf001mType rldf001mType, Rldf004mType rldf004mType,
            ExecutantType executantType);

    public ObnfDTO makeRCDF001MObnfDTO4240(Rldf001mType rldf001mType, Rldf004mType rldf004mType,
            ExecutantType executantType);

    /**
     * 建立RRDF019M通報
     * 
     * @param rldf019M
     * @param wkChgType
     *            異動類型
     * @param fromSiteId
     *            來源作業點
     * @param oldAddrTxCode
     *            舊地址異動模式
     * @param newAddrTxCode
     *            新地址異動模式
     * @return
     */
    public ObnfDTO makeRRDF019MObnfDTO(Rldf019mType rldf019M, String wkChgType, String fromSiteId,
            String oldAddrTxCode, String newAddrTxCode);

    /**
     * 建立RLDE492W跨行政區域調整登錄暫存異動資料檔
     * 
     * @param dbsMain
     *            交易連線
     * @param rlde490wType
     * @param index
     *            流水號
     * @param clazz
     *            tableName
     * @param action
     *            執行狀態
     * @param oldKeyMapObj
     *            舊KEY
     * @param oldContentMapObj
     *            舊Content
     * @param newKeyMapObj
     *            新KEY
     * @param newContentMapObj
     *            新Content
     */
    public void createRLDE492W(DBSMain dbsMain, ExecutantType executantType, Rlde490wType rlde490wType, int index,
            Class<?> clazz, ActionType action, Map<String, String> oldKeyMapObj, Map<String, String> oldContentMapObj,
            Map<String, String> newKeyMapObj, Map<String, String> newContentMapObj);

    /**
     * 取得RLDE492W跨行政區域調整登錄暫存異動資料檔
     * 
     * @param dbsMain
     * @param rlde490wType
     * @param clazz
     * @param exeUserId
     * @param exeSiteId
     * @param exeTransactionId
     * @return
     */
    public List<Rlde492wType> getRLDE492W(DBSMain dbsMain, Rlde490wType rlde490wType, Class<?> clazz, String exeUserId,
            String exeSiteId, String exeTransactionId);

    /**
     * 通報RCDF001M
     * 
     * @param rldf001mType
     * @param rldf004mType
     * @return
     */
    public ObnfDTO makeRCDF001MObnfDTO(Rldf001mType rldf001mType, Rldf004mType rldf004mType, ExecutantType executantType);

    /**
     * 建立RLDF001M通報RL、RR、RC
     * 
     * @param rldf001mType
     * @return
     */
    public ObnfDTO makeRLDF001MObnfDTO(Rldf001mType rldf001mType, ExecutantType executantType);

    /**
     * 建立RLDF002M通報RL、RR、RC
     * 
     * @param rldf001mType
     * @param wkChgType
     *            異動類型
     * @return
     */
    public ObnfDTO makeRLDF002MObnfDTO(Rldf002mType rldf002mType, String wkChgType, ExecutantType executantType);

    /**
     * 建立RCDF024M通報
     * 
     * @param rldf004m
     * @param wkChgType
     *            異動類型
     * @param fromSiteId
     *            來源作業點
     * @param modifyDate
     *            異動日期
     * @param txSeq
     *            交易序號
     * @param seqNo
     *            流水號
     * @return
     */
    public ObnfDTO makeRCDF24MObnfDTO(Rldf004mType rldf004m, String wkChgType, String fromSiteId, String modifyDate,
            String txSeq, String seqNo, ExecutantType executantType);

    /**
     * 建立RRDF024M通報
     * 
     * @param rldf004m
     * @param wkChgType
     *            異動類型
     * @param fromSiteId
     *            來源作業點
     * @param modifyDate
     *            異動日期
     * @param txSeq
     *            交易序號
     * @param seqNo
     *            流水號
     * @return
     */
    public ObnfDTO makeRRDF24MObnfDTO(Rldf004mType rldf004m, String wkChgType, String fromSiteId, String modifyDate,
            String txSeq, String seqNo, ExecutantType executantType);

    /**
     * 通報役政
     * 
     * @param rldf004n
     * @param wkChgType
     *            異動類型
     * @return
     */
    public ObnfDTO makeMLObnfDTO(final Rldf004nType rldf004n, final ExecutantType executantType);

    /**
     * 通報RCDF018D戶口名簿領補換記錄檔
     * 
     * @param rldf018d
     * @param executantType
     * @return
     */
    public ObnfDTO makeRCDF018DObnfDTO(Rldf018dType rldf018d, String wkChgType, String fromSiteId,
            ExecutantType executantType);

    /**
     * 取得RLDE492W跨行政區域調整登錄暫存異動資料檔
     * 
     * @param dbsMain
     * @param executantType
     * @param siteId
     * @param processDate
     * @param processTime
     * @param tableName
     * @return
     */
    public List<SelectEntity<Rlde492wType>> getRLDF492W(DBSMain dbsMain, ExecutantType executantType, String siteId,
            String processDate, String processTime, Class<?> tableName);

    /**
     * 還原
     * 
     * @param dbsMain
     * @param executantType
     * @param rlde492wType
     */
    public void restore(DBSMain dbsMain, ExecutantType executantType, Rlde492wType rlde492wType);

    /**
     * 建立刪除RRDF024M ODTO
     * 
     * @param rldf019mType
     * @param executantType
     * @return
     */
    public ObnfDTO makeRRDF0024MObnfDTOByDel(Rldf019mType rldf019mType, ExecutantType executantType);

    /**
     * 建立刪除RCDF024M ODTO
     * 
     * @param rldf019mType
     * @param executantType
     * @return
     */
    public ObnfDTO makeRCDF0024MObnfDTOByDel(Rldf019mType rldf019mType, ExecutantType executantType);

    public Object getEntity(DBSMain dbsMain, ExecutantType executantType, String tableName, String src);

    public Object createEntity(DBSMain dbsMain, ExecutantType executantType, String tableName, String src);

    /**
     * 建立RCDF019M通報
     * 
     * @param rldf019M
     * @param wkChgType
     *            異動類型
     * @param fromSiteId
     *            來源作業點
     * @param oldAddrTxCode
     *            舊地址異動模式
     * @param newAddrTxCode
     *            新地址異動模式
     * @return
     */
    public ObnfDTO makeRCDF019MObnfDTO(Rldf019mType rldf019M, Rldf020mType rldf020M, String wkChgType,
            String fromSiteId, String oldAddrTxCode, String newAddrTxCode);

    /**
     * 建立RRDF019M通報
     * 
     * @param rldf019M
     * @param wkChgType
     *            異動類型
     * @param fromSiteId
     *            來源作業點
     * @param oldAddrTxCode
     *            舊地址異動模式
     * @param newAddrTxCode
     *            新地址異動模式
     * @return
     */
    public ObnfDTO makeRRDF019MObnfDTO(Rldf019mType rldf019M, Rldf020mType rldf020M, String wkChgType,
            String fromSiteId, String oldAddrTxCode, String newAddrTxCode);
}
