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
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.component.dto.RelationData;
import tw.gov.moi.rl.component.dto.XLDFCreationParams;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.component.dto.XLDFRegDetailObnfParams;
import tw.gov.moi.rl.component.xldf.dto.XLDF001M;
import tw.gov.moi.rl.component.xldf.dto.XLDF004M;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

/**
 * 統號更新共用元件 The Interface IdChangeComponent.
 */
public interface IdChangeComponent {

    /**
     * Change person data id.
     * 
     * @param xldf004m
     *            the xldf004m
     * @param newPersonId
     *            the new person id
     * @param executantType
     *            the executant type
     * @param operationCode
     *            the operation code
     * @throws RisBusinessException
     *             the ris business exception
     */
    public List<XLDFRegDetailObnfParams> changePersonDataId(final XLDF004M xldf004m, final String newPersonId,
            final List<XLDFRegDetailObnfParams> obnfList, final ExecutantType executantType, final String operationCode)
            throws RisBusinessException;

    /**
     * Change person data id.
     * 
     * @param xldf004m
     *            the xldf004m
     * @param newPersonId
     *            the new person id
     * @param executantType
     *            the executant type
     * @param operationCode
     *            the operation code
     * @throws RisBusinessException
     *             the ris business exception
     */
    public List<XLDFRegDetailObnfParams> changePersonDataId(final DBSMain dbs, final XLDF004M xldf004m,
            final String newPersonId, final List<XLDFRegDetailObnfParams> obnfList, final ExecutantType executantType,
            final String operationCode) throws RisBusinessException;

    // public void changeRLDF004MId() throws RisBusinessException;
    //
    // public void changeRCDF001MRLId() throws RisBusinessException;
    //
    // public void changeRLDF005MId() throws RisBusinessException;
    //
    // public void changeRLDF006MId() throws RisBusinessException;
    //
    // public void changeRLDF007MId() throws RisBusinessException;
    //
    // public void changeRLDF008MId() throws RisBusinessException;
    //
    // public void changeRLDF010MId() throws RisBusinessException;
    //
    // public void changeRLDF030MId() throws RisBusinessException;
    //
    // public void changeRLDF047MId() throws RisBusinessException;
    //
    // public void changeRLDF049MId() throws RisBusinessException;
    //
    // public void changeRLDFM01MId() throws RisBusinessException;
    //
    // public void changeRLDFM02MId() throws RisBusinessException;
    //
    // public void changeRLDFM03MId() throws RisBusinessException;
    //
    // public void changeRLDFM04MId() throws RisBusinessException;
    //
    // public void changeRLDFM05MId() throws RisBusinessException;
    //
    // public void changeRLDFM06MId() throws RisBusinessException;
    //
    // public void changeRLDFM07MId() throws RisBusinessException;
    //
    // public void changeRLDFM08MId() throws RisBusinessException;
    //
    // public void changeRLDFM09MId() throws RisBusinessException;
    //
    // public void changeRLDFM10MId() throws RisBusinessException;
    //
    // public void changeRLDF087TId() throws RisBusinessException;
    //
    // public void changeRLDF088TId() throws RisBusinessException;
    //
    // public void changeRLDF089TId() throws RisBusinessException;
    //
    // public void changeRLDF001MHeadId() throws RisBusinessException;
    //
    // public void changeRLDF002MHeadId() throws RisBusinessException;

    /**
     * Change household head id.
     * 
     * @param xldf001m
     *            the xldf001m
     * @param newHouseholdHeadId
     *            the new household head id
     * @param executantType
     *            the executant type
     * @param operationCode
     *            the operation code
     * @throws RisBusinessException
     *             the ris business exception
     */
    public void changeHouseholdHeadId(final XLDF001M xldf001m, final String newHouseholdHeadId,
            final ExecutantType executantType, final String operationCode) throws RisBusinessException;

    /**
     * Change related and member data.
     * 
     * @param relPersonList
     *            the rel person list
     * @param householdPersonList
     *            the household person list
     * @param operationSequenceId
     *            the operation sequence id
     * @param oldPersonId
     *            the old person id
     * @param newPersonId
     *            the new person id
     * @param executantType
     *            the executant type
     * @param operationCode
     *            the operation code
     * @throws RisBusinessException
     *             the ris business exception
     */
    public void changeRelatedAndMemberData(final DBSMain conn, final List<RelationData> relationDataList,
            final List<? extends XLDFDomainObject> householdPersonList, final Integer operationSequenceId,
            String oldPersonId, String newPersonId, final ExecutantType executantType, final String operationCode)
            throws RisBusinessException;

    /**
     * Gets the last rldf004h.
     * 
     * @param xLDFPersonDataDomainObject
     *            the x ldf person data domain object
     * @param executantType
     *            the executant type
     * @param operationCode
     *            the operation code
     * @return the last rldf004h
     * @throws RisBusinessException
     *             the ris business exception
     */
    public XLDFDomainObject getLastRldf004h(final XLDFPersonDataDomainObject xLDFPersonDataDomainObject,
            final ExecutantType executantType, final String operationCode, final XLDFCreationParams param)
            throws RisBusinessException;

    public XLDFDomainObject getLastRldf004h(final DBSMain conn1,
            final XLDFPersonDataDomainObject xLDFPersonDataDomainObject, final ExecutantType executantType,
            final String operationCode, final XLDFCreationParams param) throws RisBusinessException;

    public void createOtherDataOrgXLDF(final Integer operationSequenceId, final String operationCode,
            final String personId, final String siteId, final ExecutantType executantType);

    public void createOtherDataOrgXLDF(final DBSMain conn1, final Integer operationSequenceId,
            final String operationCode, final String personId, final String siteId, final ExecutantType executantType);

    public void createRelatedDataOrgXLDF(final List<RelationData> relPersonDataList, final Integer operationSequenceId,
            final String operationCode, final ExecutantType executantType);

    public void createRelatedDataOrgXLDF(final DBSMain conn1, final List<RelationData> relPersonDataList,
            final Integer operationSequenceId, final String operationCode, final ExecutantType executantType);

}
