package tw.gov.moi.rl.component.xldf;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.dbo.operator.DBSMain;
import tw.gov.moi.rl.component.dto.XLDFAttribute;

public interface XLDFAttrManipulationComponent {
    /**
     * <p>跟據xldfAttribute將指定的作業順序之前資料做更新</p>
     * @param sequenceId
     * @param conn
     * @param executantType
     * @param xldfAttribute
     * ***/
    public void updateXLDFAttributes(final Integer sequenceId, final DBSMain conn, final ExecutantType executantType, final XLDFAttribute... xldfAttribute) ;
}
