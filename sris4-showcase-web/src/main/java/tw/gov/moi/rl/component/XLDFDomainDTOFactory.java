/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component;

import tw.gov.moi.rl.common.SelectableItem;
import tw.gov.moi.rl.domain.XLDFHouseholdDataDTO;
import tw.gov.moi.rl.domain.XLDFHouseholdNoteDTO;
import tw.gov.moi.rl.domain.XLDFOperationFineDTO;
import tw.gov.moi.rl.domain.XLDFPersonDataDTO;
import tw.gov.moi.rl.domain.XLDFPersonNoteDTO;

public interface XLDFDomainDTOFactory {

    /*
     * public XLDFPersonDataDTO getXLDFPersonDataDTO(XLDFDomainObject
     * xldfDomainObject);
     * 
     * public XLDFHouseholdDataDTO getXLDFHouseholdDataDTO(XLDFDomainObject
     * xldfDomainObject);
     * 
     * public XLDFPersonNoteDTO getXLDFPersonNoteDTO(XLDFDomainObject
     * xldfDomainObject);
     * 
     * public XLDFHouseholdNoteDTO getXLDFHouseholdNoteDTO(XLDFDomainObject
     * xldfDomainObject);
     * 
     * public XLDFOperationFineDTO getXLDFOperationFineDTO(XLDFDomainObject
     * xldfDomainObject);
     */

    public XLDFPersonDataDTO getXLDFPersonDataDTO(Object domainObject);

    public XLDFHouseholdDataDTO getXLDFHouseholdDataDTO(Object domainObject);

    public XLDFPersonNoteDTO getNewXLDFPersonNoteDTO(Object domainObject);

    public XLDFHouseholdNoteDTO getNewHouseholdNoteDTO(Object domainObject);

    public XLDFPersonNoteDTO getXLDFPersonNoteDTO(Object domainObject);

    public XLDFHouseholdNoteDTO getXLDFHouseholdNoteDTO(Object domainObject);

    public XLDFOperationFineDTO getXLDFOperationFineDTO(Object domainObject);

    public SelectableItem<XLDFPersonDataDTO> getXLDFSelectModePersonDataDTO(Object domainObject);

    public SelectableItem<XLDFPersonNoteDTO> getXLDFSelectModePersonNoteDTO(Object domainObject);

}
