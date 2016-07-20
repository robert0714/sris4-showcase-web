package tw.gov.moi.rl.component;


import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.domain.Rldfm10mType;
import tw.gov.moi.rl.domain.RlRequestRetrieveRLDFTableDataDTO;
import tw.gov.moi.rl.domain.RlRequestRetrieveTableDataBySQLDTO;
import tw.gov.moi.rl.domain.RlResponseRetrieveRLDFTableDataBySQLDTO;
import tw.gov.moi.rl.domain.RlResponseRetrieveRLDFTableDataDTO;


/**
 * The Interface RlRetrieveRLDFTableDataComponent.
 */
public interface RlRetrieveRLDFTableDataComponent {
    
    /**
     * Retrieve rldf table data.
     *
     * @param dto the dto
     * @return the rl response retrieve rldf table data dto
     */
    RlResponseRetrieveRLDFTableDataDTO retrieveRLDFTableData(final RlRequestRetrieveRLDFTableDataDTO dto);

    /**
     * *
     * 申請書職權更正通用型找尋方法
     *
     * @param <T> the generic type
     * @param dto the dto
     * @param executantType the executant type
     * @return the list
     */
    <T> List<T> retrieveRLDFTableData(final RlRequestRetrieveRLDFTableDataDTO dto, final ExecutantType executantType);

    /**
     * *
     * 根據M10M將申請書資料找到.
     *
     * @param m10mList the m10m list
     * @param executantType the executant type
     * @return the list
     */

    List<Object> retrieveRLDFTableData(final List<Rldfm10mType> m10mList, final ExecutantType executantType);

    /**
     * Retrieve table data by sql.
     *
     * @param dto the dto
     * @return the rl response retrieve rldf table data by sqldto
     */
    RlResponseRetrieveRLDFTableDataBySQLDTO retrieveTableDataBySQL(final RlRequestRetrieveTableDataBySQLDTO dto);
    
}
