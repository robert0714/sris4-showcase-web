package tw.gov.moi.rl.common;

import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.dbo.operator.DBSMain;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.CertificateDTO;

public interface RlCertificateComponent {

    /**
     * 附繳證件修改
     * 
     * @param certificateDTO
     */
    public void changeCertificate(CertificateDTO certificateDTO) throws RisBusinessException;

    /**
     * 取得附繳證件
     * 
     * @param rldfsxx
     *            RldfsxxType (申請書)
     * @param certificateDTO
     * @param tarClsss
     *            (附繳證件類別 RldfsxxAType.class)
     * @return
     * @throws RisBusinessException
     */
    public <T1> List<T1> getCertificateLists(Object rldfsxx, CertificateDTO certificateDTO, Class<T1> tarClsss)
            throws RisBusinessException;

    /**
     * 儲存附繳證件
     * 
     * @param dbs
     * @param rldfsxx
     *            (申請書)
     * @param certificateDTO
     * @param tarClsss
     *            (附繳證件類別)
     * @param info
     */
    public <T1> void saveCertificateList(DBSMain dbs, Object rldfsxx, CertificateDTO certificateDTO,
            Class<T1> tarClsss, ExecutantType info);

    /**
     * 附繳證件驗證
     * 
     * @param certificateDTO
     * @param info
     */
    public void verfity(CertificateDTO certificateDTO, ExecutantType info);
}
