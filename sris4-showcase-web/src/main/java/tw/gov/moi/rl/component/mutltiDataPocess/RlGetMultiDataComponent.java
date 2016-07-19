package tw.gov.moi.rl.component.mutltiDataPocess;

import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.component.dto.MultiDataAndAdditionalProcessDto;
import tw.gov.moi.rl.component.dto.RLQueryMultiDataIndexParam;
import tw.gov.moi.rl.component.dto.RlGetMultiDataQueryParams;

/**
 * The Interface RlGetMultiDataComponent.
 */
public interface RlGetMultiDataComponent {
    
    /**
     * Gets the entity utilities and lock.
     *
     * @param targetHibernateClassType the target hibernate class type
     * @param queryColumnNames the query column names
     * @param queryParameters the query parameters
     * @param destSiteIds the dest site ids
     * @param executant the executant
     * @param rlGetMultiDataQueryParams the rl get multi data query params
     * @return the entity utilities and lock
     * @throws RisBusinessException the ris business exception
     */
    MultiDataAndAdditionalProcessDto getEntityUtilitiesAndLock(final Class<?>[] targetHibernateClassType,
	    final String[][] queryColumnNames, final String[][] queryParameters, final String[] destSiteIds,
	    final ExecutantType executant, final RlGetMultiDataQueryParams rlGetMultiDataQueryParams) throws RisBusinessException;

    /**
     * Gets the entity utilities and lock.
     *
     * @param indexParamList the index param list
     * @param executant the executant
     * @param rlGetMultiDataQueryParams the rl get multi data query params
     * @return the entity utilities and lock
     * @throws RisBusinessException the ris business exception
     */
    MultiDataAndAdditionalProcessDto getEntityUtilitiesAndLock(final List<RLQueryMultiDataIndexParam> indexParamList,
	    final ExecutantType executant, final RlGetMultiDataQueryParams rlGetMultiDataQueryParams) throws RisBusinessException;

}
