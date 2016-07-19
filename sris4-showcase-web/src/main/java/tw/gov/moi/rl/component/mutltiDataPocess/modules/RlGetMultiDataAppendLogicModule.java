package tw.gov.moi.rl.component.mutltiDataPocess.modules;

import java.util.List;

import tw.gov.moi.dbo.operator.DBSMain;
import tw.gov.moi.rl.component.dto.MultiDataQueryDto;

public interface RlGetMultiDataAppendLogicModule {

    public List<?> processModuleGetRLDFFromRLDF(final List<?> srcList, final RlGetMultiDataAppendLogicModuleParams param,final DBSMain conn );
    
    public List<?> processModuleGetXLDFFromXLDF( final Object domainObject , final RlGetMultiDataAppendLogicModuleParams param,final DBSMain conn );

    public List<?> processModuleGetRLDFFromXLDFAccordingToSiteIdInSameHost(final Object domainObject, final RlGetMultiDataAppendLogicModuleParams params, final DBSMain conn);

    public List<MultiDataQueryDto> processModuleGetParametersFromXLDFAccordingToSiteIdInDifferentHost(final Object domainObject, final RlGetMultiDataAppendLogicModuleParams params,
	    final DBSMain conn);
    
    
    
}
