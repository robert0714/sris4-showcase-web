/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component;

import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.dbo.operator.DBSMain;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rs.dto.ObnfDTO;


/**
 * 戶籍登記共用元件介面.
 * 
 * @author Jay Kan
 */
public interface BigBookCertificateComponent {
    
    List<ObnfDTO> getObnfList_certificate(final DBSMain pDBSMain, final String pOpertionSequence,
            final Class<? extends XLDFDomainObject> pXLDFSType, final Class<? extends XLDFDomainObject> pXLDFWType,
            final ExecutantType pExecutantType);

    List<ObnfDTO> getObnfList_certificate_notGetChange(DBSMain pDBSMain, String pOpertionSequence,
            Class<? extends XLDFDomainObject> pXLDFSType, Class<? extends XLDFDomainObject> pXLDFWType,
            ExecutantType pExecutantType);
}
