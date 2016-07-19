package tw.gov.moi.rl.component.xldf;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.dbo.operator.DBSMain;
import tw.gov.moi.rl.component.dto.BirthPlaceDTO;
import tw.gov.moi.rl.component.dto.DistinguishNameDTO;
import tw.gov.moi.rl.component.dto.EducationMarkDTO;
import tw.gov.moi.rl.component.dto.RelationShipDTO;

public interface XLDFAttrBusinessComponent {
    
    /****
     * 更新sequenceId之前申請書的教育程度注記
     * @param sequenceId 作業順序
     * @param conn 連線物件
     * @param executantType AE的環境資訊
     * @param educationMarkDTO  更新教育程度注記DTO 
     * ***/
    public void updateEducationMark(final Integer sequenceId, final ExecutantType exec,final EducationMarkDTO... educationMarkDTO);
    
    
    /****
     * 更新sequenceId之前申請書的稱謂
     * @param sequenceId 作業順序
     * @param conn 連線物件
     * @param executantType AE的環境資訊
     * @param relationShipDTO 更新稱謂DTO
     * ***/
    public void updateRelationShip(final Integer sequenceId,final ExecutantType exec,final RelationShipDTO... relationShipDTO);
    
    
    /****
     * 更新sequenceId之前申請書的出生地
     * @param sequenceId 作業順序
     * @param conn 連線物件
     * @param executantType AE的環境資訊
     * @param birthPlaceDTO 更新出生地DTO 
     * ***/
    public void updateBirthPlace(final Integer sequenceId,  final ExecutantType exec,final BirthPlaceDTO... birthPlaceDTO);
    
    
    /****
     * 更新sequenceId之前申請書的姓名
     * @param sequenceId 作業順序
     * @param conn 連線物件
     * @param executantType AE的環境資訊
     * @param distinguishNameDTO 更新姓名之DTO 
     * ***/
    public void updateDistinguishName(final Integer sequenceId,  final ExecutantType exec,final DistinguishNameDTO... distinguishNameDTO);

    
    /****
     * 更新sequenceId之前申請書的教育程度注記
     * @param sequenceId 作業順序
     * @param conn 連線物件
     * @param executantType AE的環境資訊
     * @param educationMarkDTO  更新教育程度注記DTO 
     * ***/
    public void updateEducationMark(final Integer sequenceId, final DBSMain conn, final ExecutantType exec,final EducationMarkDTO... educationMarkDTO);
    
    
    /****
     * 更新sequenceId之前申請書的稱謂
     * @param sequenceId 作業順序
     * @param conn 連線物件
     * @param executantType AE的環境資訊
     * @param relationShipDTO 更新稱謂DTO
     * ***/
    public void updateRelationShip(final Integer sequenceId, final DBSMain conn,final ExecutantType exec,final RelationShipDTO... relationShipDTO);
    
    
    /****
     * 更新sequenceId之前申請書的出生地
     * @param sequenceId 作業順序
     * @param conn 連線物件
     * @param executantType AE的環境資訊
     * @param birthPlaceDTO 更新出生地DTO 
     * ***/
    public void updateBirthPlace(final Integer sequenceId, final DBSMain conn,  final ExecutantType exec,final BirthPlaceDTO... birthPlaceDTO);
    
    
    /****
     * 更新sequenceId之前申請書的姓名
     * @param sequenceId 作業順序
     * @param conn 連線物件
     * @param executantType AE的環境資訊
     * @param distinguishNameDTO 更新姓名之DTO 
     * ***/
    public void updateDistinguishName(final Integer sequenceId, final DBSMain conn,  final ExecutantType exec,final DistinguishNameDTO... distinguishNameDTO);
}
