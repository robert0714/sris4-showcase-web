package tw.gov.moi.rl.common;

import java.io.Serializable;
import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.dbo.operator.DBSMain;
import tw.gov.moi.domain.Rldf018mType;
import tw.gov.moi.domain.Rldf019mType;
import tw.gov.moi.domain.Rldf020mType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.RlStreetConditionDTO;

public interface RlStreetDoorPlusComponent {

    /**
     * 
     * @param dbs
     * @param sql
     * @param exe
     * @return
     * @throws RisBusinessException
     */
    <T extends Serializable> List<T> getResults(DBSMain dbs, RlStreetConditionDTO sql, ExecutantType exe)
            throws RisBusinessException;

    /**
     * 
     * @param dbs
     * @param rldf019m
     * @param registerKinds
     * @param exe
     * @return
     * @throws RisBusinessException
     */
    <T extends Serializable> List<T> getRLdf019mResultsForOld3550(DBSMain dbs, Rldf019mType rldf019m,
            List<String> registerKinds, ExecutantType exe) throws RisBusinessException;

    /**
     * 
     * @param dbs
     * @param rldf019m
     * @param registerKinds
     * @param exe
     * @return
     * @throws RisBusinessException
     */
    <T extends Serializable> List<T> getRLdf019mResultsForNew3550(DBSMain dbs, Rldf019mType rldf019m,
            List<String> registerKinds, ExecutantType exe) throws RisBusinessException;

    /**
     * 
     * @param dbs
     * @param rldf018m
     * @param exe
     * @param type
     *            類別 <li>0:用like查詢 <br> <li>1:用==查詢
     * 
     * 
     * @return
     * @throws RisBusinessException
     */
    <T extends Serializable> List<T> getRLdf018mResultsFor23300(DBSMain dbs, Rldf018mType rldf018m, ExecutantType exe,
            String type) throws RisBusinessException;

    <T extends Serializable> List<T> getRLdf020mResultsFor23300(DBSMain dbs, Rldf020mType rldf020mType,
            ExecutantType exe, String type) throws RisBusinessException;

    <T extends Serializable> List<T> getRLdf019mResultsFor2300OnlyYyymmdd(DBSMain dbs, Rldf019mType rldf019mType,
            String registerKind, ExecutantType exe) throws RisBusinessException;

    <T extends Serializable> List<T> getRLdf019mResultsFor2300OnlyNew(DBSMain dbs, Rldf019mType rldf019mType,
            String registerKind, String queryType, ExecutantType exe) throws RisBusinessException;

    <T extends Serializable> List<T> getRLdf019mResultsFor2300OnlyOld(DBSMain dbs, Rldf019mType rldf019mType,
            String registerKind, String queryType, ExecutantType exe) throws RisBusinessException;

}
