package tw.gov.moi.rl.component.xldf;

import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.domain.RisDateTimeType;
import tw.gov.moi.dbo.operator.DBSMain;
import tw.gov.moi.domain.XldfopracsType;
import tw.gov.moi.rs.dto.ObnfDTO;

public interface XLDFSpecialObnfComponent {
    
    /**
     * 專門針對新增RLDF089T,RLDF087T,RLDF089T作處理的Obnf
     * <p>對於Rldf088t系列申請書會針對當事人是有戶籍者,是無戶籍者的差別處理 有戶籍者可以走L006通報類別,但是RR部份要用特殊通報處理<也就是不送通報到RR,卻有送通報到RL,RC>
     * 無戶籍者要走L007通報類別<只送通報到RC></p>
     * @param externalWKChgType 通報類別 {@link #String}
     * @param wkNoticeDateTime 通報日期時間 {@link #RisDateTimeType}
     * @param sameDomainXLDFDomainObjectlist 相同domainkey的XLDF領域物件索引檔 {@link #List}
     * @param lClassType XLDF領域物件型別 {@link #String}
     * @param conn 連線物件 {@link #DBSMain}
     * @param executantType 環境資訊 {@link #ExecutantType}
     * **/
    public ObnfDTO getRldf088TseriesWhenWKChgTypeIsA(final String externalWKChgType , final RisDateTimeType wkNoticeDateTime, final List<XldfopracsType> sameDomainXLDFDomainObjectlist,
	    final String lClassType, final DBSMain conn, final ExecutantType executantType) ;
}
