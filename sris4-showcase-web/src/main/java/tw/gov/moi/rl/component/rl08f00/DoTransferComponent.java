package tw.gov.moi.rl.component.rl08f00;

import java.util.List;

import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.dbo.operator.DBSMain;
import tw.gov.moi.domain.Redf023mType;
import tw.gov.moi.domain.Rldf006mType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08f20DTO;

/**
 * 選舉人資料轉錄共用元件
 * 
 * @author Stanley.Li
 */
public interface DoTransferComponent {

    /**
     * 判斷個人基本資料是否符合選舉資料
     * 
     * @param rl08f20DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doStart(final DBSMain dbs, List<Rldf006mType> rldf006mList , 
    		final Rl08f20DTO rl08f20DTO, Redf023mType redf023mType, List<Redf023mType> redf023ms,
    		final ExecutantType executantType) throws RisBusinessException;

}
