package tw.gov.moi.rl.component.dto;

import java.io.Serializable;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.domain.RlGetSingleDataResponseDto;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiDataAndAdditionalProcessDto", propOrder = { "multiDataDto" , "indexParametersInOrderToGetRLDFFromXLDFAccordingToSiteIdInDifferentHostResult"})
@XmlRootElement(name = "MultiDataAndAdditionalProcessDto")
public class MultiDataAndAdditionalProcessDto  implements Serializable {

    /**  */
    private static final long serialVersionUID = 6790970049015205709L;

    @FieldName("一般查詢結果")
    @XmlElement(name = "multiDataDto", required = true)
    private MultiDataDto[] multiDataDto;

    @FieldName("由XLDF查詢相關的RLDF資料")
    @XmlElement(name = "indexParametersInOrderToGetRLDFFromXLDFAccordingToSiteIdInDifferentHostResult", required = true)
    private Map<Integer,RlGetSingleDataResponseDto[]> indexParametersInOrderToGetRLDFFromXLDFAccordingToSiteIdInDifferentHostResult;
    
    public MultiDataDto[] getMultiDataDto() {
        return  this.multiDataDto;
    }

    public void setMultiDataDto(MultiDataDto[] multiDataDto) {
        this.multiDataDto = multiDataDto;
    }

    public Map<Integer, RlGetSingleDataResponseDto[]> getIndexParametersInOrderToGetRLDFFromXLDFAccordingToSiteIdInDifferentHostResult() {
        return this.indexParametersInOrderToGetRLDFFromXLDFAccordingToSiteIdInDifferentHostResult;
    }

    public void setIndexParametersInOrderToGetRLDFFromXLDFAccordingToSiteIdInDifferentHostResult(
    	Map<Integer, RlGetSingleDataResponseDto[]> indexParametersInOrderToGetRLDFFromXLDFAccordingToSiteIdInDifferentHostResult) {
        this.indexParametersInOrderToGetRLDFFromXLDFAccordingToSiteIdInDifferentHostResult = indexParametersInOrderToGetRLDFFromXLDFAccordingToSiteIdInDifferentHostResult;
    }
    
    
}
