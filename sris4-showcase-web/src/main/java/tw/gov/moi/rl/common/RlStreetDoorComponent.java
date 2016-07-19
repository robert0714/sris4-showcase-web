package tw.gov.moi.rl.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.dbo.operator.DBSMain;
import tw.gov.moi.domain.Rlde406wType;
import tw.gov.moi.domain.Rlde407wType;
import tw.gov.moi.domain.Rldf001mType;
import tw.gov.moi.domain.Rldf018mType;
import tw.gov.moi.domain.Rldf019mType;
import tw.gov.moi.domain.Rldf020mType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl04212DateDTO;
import tw.gov.moi.rl.domain.Rl04212ResultDTO;
import tw.gov.moi.rl.domain.RlStreetDoorPlateDTO;
import tw.gov.moi.rl.domain.RlStreetFullAdressDTO;
import tw.gov.moi.rl.domain.RlStreetResultDTO;
import tw.gov.moi.rl.domain.RlStreetSQLDTO;
import tw.gov.moi.rl.domain.RlStreetSerialDataDTO;

/**
 * 門牌查詢共用元件
 * 
 * @author Andy
 * 
 */
public interface RlStreetDoorComponent {

    public static final int STREET = 1;
    public static final int STREET_DOOR = 0;
    public static final int FORWARD_18M = -1;
    public static final int FORWARD_OLD = 0;
    public static final int FORWARD_NEW = 1;
    public static final int FORWARD_END = 2;

    public enum QueryType {
        EQ("=?"), //
        LE("<=?"), //
        GE(">=?"), //
        LT("<?"), //
        GT(">?"), //
        NE("<>?"), //
        LIKE("LIKE ?"), //
        IN("IN(%s)");
        ;

        private String note = "";

        QueryType(String sinal) {
            note = sinal;
        }

        public String getNote() {
            return note;
        }

        public void setNote(String note) {
            this.note = note;
        }

    }

    public enum OrderSatae {
        desc, asc
    }

    /**
     * 門牌查詢欄位檢查
     * 
     * @author Andy
     * 
     */

    enum FieldName {

        SITE_ID("siteId"), //
        VILLAGE("village"), //
        NEIGHBOR("neighbor"), //
        STREETDOORPLATE("streetDoorplate"), //
        STREET("street"), //
        AREA("area"), //
        FLOORNO("floorNo"), //
        ALLEY("alley"), //
        SECTION("section"), //
        LANE("lane"), //
        DOORNO("doorNo")//

        ;
        final String pName;

        FieldName(String name) {
            this.pName = name;
        }

        public String getpName() {
            return pName;
        }

    }

    /**
     * 門牌查詢欄位
     * 
     * @author Andy
     * 
     */
    public enum QueryFiledCombine {
        QUERY_RULE1(//
                FieldName.SITE_ID, FieldName.VILLAGE, FieldName.NEIGHBOR, FieldName.STREETDOORPLATE), //
        QUERY_RULE2(//
                FieldName.SITE_ID, FieldName.VILLAGE, FieldName.NEIGHBOR, FieldName.STREET, FieldName.AREA,//
                FieldName.FLOORNO, FieldName.ALLEY, FieldName.SECTION, FieldName.LANE, FieldName.DOORNO);//

        final Enum<FieldName>[] fields;
        final static private Map<QueryFiledCombine, Enum<FieldName>[]> MAP;

        static {
            Map<QueryFiledCombine, Enum<FieldName>[]> map = new HashMap<QueryFiledCombine, Enum<FieldName>[]>();

            for (QueryFiledCombine mesg : QueryFiledCombine.values()) {
                map.put(mesg, mesg.fields);
            }
            MAP = Collections.unmodifiableMap(map);

        }

        QueryFiledCombine(FieldName... names) {
            this.fields = names;
        }

        public String[] lookUp(QueryFiledCombine query) {
            List<String> fieldsName = new ArrayList<String>();
            Enum<FieldName>[] fields = MAP.get(query);
            for (java.lang.Enum<FieldName> f : fields) {
                // fieldsName.add();

            }
            return fieldsName.toArray(new String[] {});

        }
    }

    /**
     * 動態產生sql檢查之欄位列別
     * 
     * @author Andy
     * 
     */
    enum DoorQueyType {
        NoType(null, new String[] {}), // 未指定

        // =======================RLDF019M
        Type1ToRldf019m(Rldf019mType.class, new String[] { //
                "siteId", //
                        "newVillage", "newNeighbor", "newStreetDoorplate",//
                        "oldVillage", "oldNeighbor", "oldStreetDoorplate",//
                        "modifyBatch", "modifyKind", "modifyDate"//
                }), //

        Type2ToRldf019m(Rldf019mType.class, new String[] { //
                "siteId", //
                        "newVillage", "newNeighbor", "newStreetDoorplate",//
                        "modifyDate"//
                }), //

        // ======================== RLDF020M
        Type1ToRldf020m(//
                Rldf020mType.class, new String[] { //
                "siteId", "village", "neighbor", "streetDoorplate" }), //

        Type2ToRldf020m(//
                Rldf020mType.class, new String[] { //
                "siteId", "village", "neighbor", "street", "area", "floorNo", "alley", "section", "lane", "doorNo" }), //

        Type3ToRldf020m(//
                Rldf020mType.class, new String[] {//
                "siteId",//
                        "village", "neighbor", "streetDoorplate",//
                        "registerYyymmdd", "registerBatch", "registerKind" }), //

        Type4ToRldf020m(//
                Rldf020mType.class, new String[] {//
                        "siteId",//
                        "village", "neighbor", "street", "area", "floorNo", "alley", "section", "lane", "doorNo",
                        "registerYyymmdd", "registerBatch", "registerKind" }), //

        // ====================RLDF001M
        Type1ToRldf001m(Rldf001mType.class, new String[] { "siteId", "village", "neighbor", "streetDoorplate" }), //

        Type1ToRlde406w(Rlde406wType.class,//
                new String[] {//
                "siteId", "village", "neighbor", "oldStreetDoorplate"//
                }),

        Type2ToRlde406w(Rlde406wType.class,//
                new String[] {//
                "siteId", "village", "neighbor",//
                        "oldStreet", "oldArea", "oldFloorNo", "oldAlley", "oldSection", "oldLane", "oldDoorNo" }),

        Type1ToRlde407w(Rlde407wType.class,//
                new String[] {//
                "siteId", "village", "neighbor", "oldStreetDoorplate"//
                }),

        Type2ToRlde407w(Rlde407wType.class,//
                new String[] {//
                "siteId", "village", "neighbor",//
                        "oldStreet", "oldArea", "oldFloorNo", "oldAlley", "oldSection", "oldLane", "oldDoorNo" })

        ;

        final String[] fields;
        final Class<?> pClass;

        DoorQueyType(Class<?> pClass, String[] fields) {
            this.fields = fields;
            this.pClass = pClass;
        }

        public String[] getFields() {
            return fields;
        }

        public Class<?> getpClass() {
            return pClass;
        }

    }

    /**
     * 門牌類類別代碼當
     */
    public final String RSCD3581 = "RSCD3581";
    /**
     * 門牌歷史最大查詢歷史數量
     */
    public final int MAX_TIME = 500;

    /**
     * 門牌關鍵字
     */
    public final String STREET_DOORPLATE = "street_doorplate";

    /**
     * 部分門牌查詢
     */
    public final String SELECT_PART_DOOR_PLATE = "0";

    /**
     * 完整地址
     */
    public final String SELECT_FULL_DOOR_PLATE = "1";

    /**
     * 欄位化門牌查詢
     */
    public final String SELECT_DIVID_DOOR_PLATE = "1";

    public final String NEIGHBOR = "neighbor";

    List<Rldf020mType> getRldf20mByUseEqualStreetDoorPlate(String registeryyymmdd, String village, String neighbor,
            String streetDoorPlate, ExecutantType exe) throws RisBusinessException;

    List<Rldf020mType> getDivideStreetplate(Rldf020mType type, boolean useLisk, ExecutantType exe)
            throws RisBusinessException;

    /**
     * 
     * @param registeryyymmdd
     *            編訂日期
     * @param village
     *            村里
     * @param neighbor
     *            鄰
     * @param streetDoorPlate
     *            街路門牌(使用like查詢可以會找不到難字)
     * @return
     * @throws RisBusinessException
     */
    List<Rldf020mType> getRldf20mByUseLikeStreetDoorPlate(String registeryyymmdd, String village, String neighbor,
            String streetDoorPlate, ExecutantType exe) throws RisBusinessException;

    public String getTypeNameToTableName(String typeName) throws RisBusinessException;

    public <T> RlStreetSQLDTO getSqlByObj(T t, boolean useLike) throws RisBusinessException;

    /**
     * 
     * @param t
     *            動態類別
     * @param useLike
     *            使用like
     * @param queryType
     *            查詢類別
     * @return
     */
    public <T> RlStreetSQLDTO getSqlByObj(T t, boolean useLike, DoorQueyType queryType) throws RisBusinessException;

    /**
     * 
     * @param registeryyymmdd
     *            編訂日期
     * @param village
     *            村里
     * @param neighbor
     *            鄰
     * @param stree
     *            街路
     * @return
     * @throws RisBusinessException
     */
    List<Rldf020mType> getRldf20mByStrrt(String registeryyymmdd, String village, String neighbor, String stree,
            ExecutantType exe) throws RisBusinessException;

    /**
     * 
     * @param registeryyymmdd
     * @param village
     * @param neighbor
     * @param stree
     * @param role
     *            <li>STREET:1街路 <li>STREET_DOOR:0查詢街路門牌
     * @param exe
     * @return
     * @throws RisBusinessException
     */
    List<Rldf020mType> getRldf20mWithFlag(String registeryyymmdd, String village, String neighbor, String stree,
            int role, ExecutantType exe) throws RisBusinessException;

    List<Rldf018mType> getRldf18mByUseEqualStreetDoorPlate(final String modifyKind, final String modifyDate,
            final String registeryyymmdd, String village, String neighbor, String stree, ExecutantType exe)
            throws RisBusinessException;

    List<Rldf018mType> getRldf18mByUseLikeStreetDoorPlate(final String modifyKind, final String modifyDate,
            final String registeryyymmdd, String village, String neighbor, String streetDoorPlate, boolean useLike,
            ExecutantType exe) throws RisBusinessException;

    List<Rldf018mType> getRldf18mByStrrt(String registeryyymmdd, String village, String neighbor, String stree,
            ExecutantType exe) throws RisBusinessException;

    /**
     * 
     * @param registeryyymmdd
     * @param village
     * @param neighbor
     * @param stree
     * @param role
     *            <li>STREET:1街路 <li>STREET_DOOR:0查詢街路門牌
     * @param exe
     * @return
     * @throws RisBusinessException
     */
    List<Rldf018mType> getRldf18mWithFlag(final String modifyKind, final String modifyDate,
            final String registeryyymmdd, String village, String neighbor, String stree, int role, ExecutantType exe)
            throws RisBusinessException;

    /**
     * 搜尋門牌歷史: <br>
     * [有可能會中斷, 中斷的話要執行continue19mByNewOrOld 傳入多筆Rldf019m其中一筆Rldf019mType接著繼續搜尋] <br>
     * 判斷是否完成的方法: <br>
     * RlStreetResultDTO 的HasStartPoint 和 HasEndPoint是否同時為true， <br>
     * 若非同時為true表示中斷將執行 continue19mByNewOrOld此mehod
     * 
     * 
     * @param dbs
     * @param dto
     * @param exe
     * @return
     * @throws RisBusinessException
     */
    RlStreetResultDTO getRldf019mByNewOrOld(DBSMain dbs, RlStreetSerialDataDTO dto, ExecutantType exe)
            throws RisBusinessException;

    /**
     * '繼續'搜尋門牌歷史
     * 
     * @param dbs
     * @param dto
     * @param rldf019m
     *            戶籍員選到的門牌
     * @param exe
     * @return
     * @throws RisBusinessException
     */
    RlStreetResultDTO continue19mByNewOrOld(DBSMain dbs, RlStreetSerialDataDTO dto, Rldf019mType rldf019m,
            ExecutantType exe) throws RisBusinessException;

    /**
     * 
     * @param dbs
     * @param dto
     * @param exe
     * @return RisBusinessException
     */
    Rl04212ResultDTO getModfifyDoorPlate(Rldf020mType type, Rl04212DateDTO date, ExecutantType exe)
            throws RisBusinessException;

    Rl04212ResultDTO getModfifyDoorPlateWithoutCompare(Rldf020mType type, RlStreetFullAdressDTO oldQuery,
            Rl04212DateDTO date, ExecutantType exe) throws RisBusinessException;

    /**
     * 組合街路門牌
     * 
     * @param dto
     * @param exe
     * @return
     * @throws RisBusinessException
     */
    String makeSteetDoorPlate(RlStreetDoorPlateDTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 門牌欄位話分拆回去
     * 
     * @param streetDoorPlate
     * @param exe
     * @return
     * @throws RisBusinessException
     */
    RlStreetDoorPlateDTO divideStreetDoorPlateByQuery(String streetDoorPlate, final String village,
            final String neighbor, Rldf020mType rldf020m, ExecutantType exe) throws RisBusinessException;

    /**
     * 
     * @param type
     * @param useLike
     *            是否使用like查詢
     * @param exe
     * @return
     * @throws RisBusinessException
     */
    List<Rldf001mType> getRldf001mByObj(Rldf001mType type, boolean useLike, ExecutantType exe)
            throws RisBusinessException;

    /**
     * 
     * @param type
     * @param useLike
     *            是否使用like查詢
     * @param exe
     * @return
     * @throws RisBusinessException
     */
    List<Rldf020mType> getRldf020mByObj(Rldf020mType type, boolean useLike, ExecutantType exe)
            throws RisBusinessException;

    List<Rldf020mType> getRldf020mByObj(Rldf020mType type, boolean useLike, DoorQueyType queryType, ExecutantType exe)
            throws RisBusinessException;

    List<Rldf018mType> getRldf018mByObj(Rldf018mType type, boolean useLike, DoorQueyType queryType, ExecutantType exe)
            throws RisBusinessException;

    List<Rldf019mType> getRldf019mByObj(Rldf019mType type, boolean useLike, DoorQueyType queryType, ExecutantType exe)
            throws RisBusinessException;

    List<Rldf001mType> getRldf001mByObj(Rldf001mType type, boolean useLike, DoorQueyType queryType, ExecutantType exe)
            throws RisBusinessException;

    /**
     * 
     * @param village
     * @param neighbor
     * @param streetDoorPlate
     * @param role
     * @return
     */
    List<Rlde406wType> getRlde406wWithFlag(String village, String neighborm, String streetDoorPlate, int role,
            ExecutantType exe);

    List<Rlde406wType> getRlde406wWithFlagFor4230(Rlde406wType rlde406, int role, ExecutantType exe);

    List<Rlde407wType> getRlde407wWithFlagFor4230(Rlde407wType rlde407, int role, ExecutantType exe);

    /**
     * 
     * @param village
     * @param neighbor
     * @param streetDoorPlate
     * @param role
     * @return
     */
    List<Rlde406wType> getRlde406wLikeStreetDoorPlate(String village, String neighbor, String streetDoorPlate,
            ExecutantType exe);

    /**
     * 
     * @param village
     * @param neighbor
     * @param streetDoorPlate
     * @param role
     * @return
     */
    List<Rlde406wType> getRlde406wEualStreet(String village, String neighbor, String street, ExecutantType exe);

    /**
     * 
     * @param village
     * @param neighbor
     * @param streetDoorPlate
     * @param role
     * @return
     */
    List<Rlde407wType> getRlde407wWithFlag(String village, String neighborm, String streetDoorPlate, String siteId,
            int role, ExecutantType exe);

    /**
     * 
     * @param village
     * @param neighbor
     * @param streetDoorPlate
     * @param role
     * @return
     */
    List<Rlde407wType> getRlde407wLikeStreetDoorPlate(String village, String neighbor, String streetDoorPlate,
            String siteId, ExecutantType exe);

    /**
     * 
     * @param village
     * @param neighbor
     * @param streetDoorPlate
     * @param role
     * @return
     */
    List<Rlde407wType> getRlde407wEualStreet(String village, String neighbor, String street, String siteId,
            ExecutantType exe);

    /**
     * 
     * 
     * @param rldf019m
     * @param queryFlag
     *            查詢旗標
     * @param exe
     * @return
     * @throws RisBusinessException
     */
    List<Rldf019mType> getRldf019mByObj(Rldf019mType rldf019m, int queryFlag, ExecutantType exe)
            throws RisBusinessException;

    List<Rldf020mType> getRldf020mByObj(Rldf020mType rldf020m, ExecutantType exe);

    List<Rldf019mType> getRldf019mByObj(Rldf019mType rldf019m, ExecutantType exe);

    List<Rldf018mType> getRldf018mByObj(Rldf018mType rldf018m, ExecutantType exe);

    List<Rldf019mType> getRLdf019mByEqualModifyDate(DBSMain dds, String registerKind, String modifyDate, String flag,
            ExecutantType exe);

    List<Rldf019mType> getRLdf019mFormNewAndOld(DBSMain dds, String registerKind, String village, String neighbor,
            String streetDoorplate, String modifyDate, String flag, ExecutantType exe);

}
