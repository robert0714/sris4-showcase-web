package tw.gov.moi.rl.component;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.component.dto.XLDFGeneralSaveDTO;
import tw.gov.moi.rl.component.dto.XLDFMoveSaveDTO;
import tw.gov.moi.rl.component.dto.XLDFPhase3SaveDTO;
import tw.gov.moi.rl.domain.Rl0a300DTO;

public interface XldfApplyChanges {
    
    public void applyChangesForPhase3(final Rl0a300DTO dto, final ExecutantType executantType, final boolean unLock) throws RisBusinessException;
    
    public void applyChanges(final ExecutantType executantType, final boolean unLock) throws RisBusinessException ;
	        
    public void applyChangesCommitWithTxn(XLDFGeneralSaveDTO xldfGeneralSaveDTO, boolean unLock, ExecutantType executantType) throws RisBusinessException;

    public XLDFGeneralSaveDTO prepareGeneralOperations(final boolean unLock, final ExecutantType executantType) throws RisBusinessException;

    public XLDFMoveSaveDTO prepareMoveOperations(final boolean unLock, final ExecutantType executantType) throws RisBusinessException;

    public void applyChangesTestCommitWithTxn(final XLDFMoveSaveDTO preparation, final boolean unLock, final ExecutantType executantType)
	    throws RisBusinessException;

    public void applyChangesTest(final ExecutantType executantType, final boolean unLock) throws RisBusinessException;
    
    public void applyChangesCommitWithTxnForA300(final XLDFPhase3SaveDTO xldfPhase3SaveDTO, boolean unLock, ExecutantType executantType) throws RisBusinessException;
    
    public XLDFPhase3SaveDTO preparePhase3Operations(final Rl0a300DTO dto,final boolean unLock, final ExecutantType executantType);
}
