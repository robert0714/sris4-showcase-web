package tw.gov.moi.rl.component;

import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.dbo.operator.DBSMain;
import tw.gov.moi.domain.XldfspecialnoticeType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.component.dto.XLDFNoticeInfoData;
import tw.gov.moi.rl.component.dto.XLDFRegisterCustomObnfParams;
import tw.gov.moi.rl.component.dto.XLDFTransactionOperation;
import tw.gov.moi.rs.dto.SendMessageDTO;

/**
 * 戶籍大簿通報處理元件介面
 * 
 * @author marcus chen
 * 
 */
public interface XLDFTransactionNoticeComponent {

    /**
     * 各項登記，若有需要進行特殊通報，留下資訊於資料庫中。
     * 
     * 適用通報類別L006(戶籍資料)、L003(外來申請書資料檔，ex：RLDFR001)、L004(辦理它所申請書資料檔，ex：RLDFW001)
     * 、L017(申請書資料檔，ex：RLDFS001)
     * 
     * @param conn
     *            DBSMain
     * @param registerCustomObnfParam
     *            XLDFRegisterCustomObnfParams
     * @param exe
     *            ExecutantType
     * @throws RisBusinessException
     */
    void optionRegisterCustomObnf(final DBSMain conn, final XLDFRegisterCustomObnfParams registerCustomObnfParam,
            final ExecutantType exe) throws RisBusinessException;

    /***
     * 送通報...以及對遠地資料(影像資料)作更新
     * 
     * @param conn
     *            DBSMain
     * 
     * @param xldfTransactionOperationList
     *            交易作業摘要資訊
     * @return 有關包好的通報資料以及相關資訊 XLDFNoticeInfoData
     * 
     * @throws RisBusinessException
     * **/
    XLDFNoticeInfoData composeObnfAndGetInfos(final DBSMain conn,
            final List<XLDFTransactionOperation> xldfTransactionOperationList, final ExecutantType executantType)
            throws RisBusinessException;

    /***
     * 送通報...以及對遠地資料(影像資料)作更新 (測試 新版下除戶)
     * 
     * @param conn
     *            DBSMain
     * 
     * @param xldfTransactionOperationList
     *            交易作業摘要資訊
     * @return 有關包好的通報資料以及相關資訊 XLDFNoticeInfoData
     * 
     * @throws RisBusinessException
     * **/
    XLDFNoticeInfoData composeObnfAndGetInfosTest(final DBSMain conn,
            final List<XLDFTransactionOperation> xldfTransactionOperationList, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 送通報封包.
     * 
     * @param dto
     *            SendMessageDTO
     * @throws RisBusinessException
     *             「送通報封包」失敗
     */
    void sendNotice(final SendMessageDTO dto) throws RisBusinessException;

    List<XldfspecialnoticeType> getSpecilNoticeListByExecutantType(final DBSMain conn1,
            final ExecutantType executantType) throws RisBusinessException;
}
