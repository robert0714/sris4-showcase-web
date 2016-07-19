/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.rl08f00;

import java.util.HashMap;
import java.util.List;

import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.filesystem.RisFile;
import tw.gov.moi.dbo.operator.DBSMain;
import tw.gov.moi.domain.Rlde800wType;
import tw.gov.moi.domain.Rlde808wType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08f20DTO;
import tw.gov.moi.rl.domain.Rl08f30DTO;
import tw.gov.moi.rl.domain.Rl08f31DTO;
import tw.gov.moi.rl.domain.Rl08f32DTO;
import tw.gov.moi.rl.domain.Rl08f33DTO;
import tw.gov.moi.rl.domain.Rl08f34DTO;
import tw.gov.moi.rl.domain.Rl08f35DTO;
import tw.gov.moi.rl.domain.Rl08f36DTO;
import tw.gov.moi.rl.domain.Rl08f37DTO;
import tw.gov.moi.rl.domain.Rl08f38DTO;
import tw.gov.moi.rl.domain.Rl08f39DTO;
import tw.gov.moi.rl.domain.Rl08f41DTO;
import tw.gov.moi.rl.domain.Rl08f42DTO;
import tw.gov.moi.rl.domain.Rl08f43DTO;
import tw.gov.moi.rl.domain.Rl08f44DTO;
import tw.gov.moi.rl.domain.Rl08f45DTO;
import tw.gov.moi.rl.domain.Rl08f71DTO;
import tw.gov.moi.rl.domain.Rl08f72DTO;
import tw.gov.moi.rl.domain.Rl08f73DTO;
import tw.gov.moi.rl.domain.Rl08f80DTO;
import tw.gov.moi.rl.domain.Rlde808wQueryDTO;

/**
 * 選舉人資料共用元件.
 * 
 * @author Stanley.Li
 */
public interface Rl08f00ValidComponent {

    /**
     * 建立iText報表檔案路徑.
     * 
     * @param fileName
     *            報表檔名
     * @param execType
     *            使用者資訊
     * @return RisFile
     */
    public RisFile createVoteRisFile(final String fileName, final ExecutantType execType);

    /**
     * 取得投票所資料.
     * 
     * @param dbs
     *            the dbs
     * @param rlde808wQueryDTO
     *            the rlde808w query dto
     * @param execType
     *            使用者資訊
     * @return the rlde808w
     */
    @RisServiceMethod(MethodType.QUERY)
    public List<Rlde808wType> getRlde808w(final DBSMain dbs, final Rlde808wQueryDTO rlde808wQueryDTO,
            final ExecutantType execType);

    /**
     * 資料驗證.
     * 
     * @param rl08f20DTO
     *            the rl08f20 dto
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.VERIFY)
    public void validAction(final Rl08f20DTO rl08f20DTO, final ExecutantType execType) throws RisBusinessException;

    /**
     * 資料驗證 (Rl08f30).
     * 
     * @param dto
     *            the dto
     * @param execType
     *            使用者資訊
     */
    @RisServiceMethod(MethodType.VERIFY)
    public void validAction(Rl08f30DTO dto, ExecutantType execType);

    /**
     * 資料驗證 (Rl08f31).
     * 
     * @param rl08f31DTO
     *            the rl08f31 dto
     * @param execType
     *            使用者資訊
     * @return the hash map
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.VERIFY)
    public HashMap<String, String> validAction(final Rl08f31DTO rl08f31DTO, final ExecutantType execType)
            throws RisBusinessException;

    /**
     * 資料驗證 (Rl08f32).
     * 
     * @param dto
     *            the dto
     * @param execType
     *            使用者資訊
     */
    @RisServiceMethod(MethodType.VERIFY)
    public void validAction(Rl08f32DTO dto, ExecutantType execType);

    /**
     * 資料驗證 (Rl08f33).
     * 
     * @param rl08f33DTO
     *            the rl08f33 dto
     * @param execType
     *            使用者資訊
     * @return the hash map
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.VERIFY)
    public HashMap<String, String> validAction(final Rl08f33DTO rl08f33DTO, final ExecutantType execType)
            throws RisBusinessException;

    /**
     * 資料驗證 (Rl08f34).
     * 
     * @param dto
     *            製作選舉人數初步／確定統計表DTO
     * @param execType
     *            the exec type
     * @throws RisBusinessException
     *             資料驗證 (Rl08f34)失敗
     */
    @RisServiceMethod(MethodType.VERIFY)
    public void validAction(final Rl08f34DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 資料驗證 (Rl08f35).
     * 
     * @param dto
     *            在工作地投票通知單DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             資料驗證 (Rl08f35)失敗
     */
    @RisServiceMethod(MethodType.VERIFY)
    public void validAction(final Rl08f35DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 資料驗證 (Rl08f36).
     * 
     * @param dto
     *            the dto
     * @param execType
     *            使用者資訊
     */
    @RisServiceMethod(MethodType.VERIFY)
    public void validAction(Rl08f36DTO dto, ExecutantType execType);

    /**
     * 資料驗證 (Rl08f37).
     * 
     * @param dto
     *            選舉人投票通知單DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             資料驗證 (Rl08f37)失敗
     */
    @RisServiceMethod(MethodType.VERIFY)
    public void validAction(final Rl08f37DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 資料驗證 (Rl08f38).
     * 
     * @param dto
     *            製作選舉人數統計表(選委會)DTO
     * @param execType
     *            the exec type
     * @throws RisBusinessException
     *             資料驗證 (Rl08f38)失敗
     */
    @RisServiceMethod(MethodType.VERIFY)
    public void validAction(final Rl08f38DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 資料驗證 (Rl08f39).
     * 
     * @param dto
     *            製作選舉人人數初步確定統計表(選委會)DTO
     * @param execType
     *            the exec type
     * @throws RisBusinessException
     *             資料驗證 (Rl08f39)失敗
     */
    @RisServiceMethod(MethodType.VERIFY)
    public void validAction(final Rl08f39DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 資料驗證 (Rl08f41).
     * 
     * @param dto
     *            the dto
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.VERIFY)
    public void validAction(final Rl08f41DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 資料驗證 (Rl08f41).
     * 
     * @param dto
     *            the dto
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.VERIFY)
    public void validAction(final Rl08f42DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 資料驗證 (Rl08f43).
     * 
     * @param dto
     *            the dto
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.VERIFY)
    public void validAction(final Rl08f43DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 資料驗證 (Rl08f44).
     * 
     * @param dto
     *            the dto
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.VERIFY)
    public void validAction(final Rl08f44DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 資料驗證 (Rl08f45).
     * 
     * @param dto
     *            the dto
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.VERIFY)
    public void validAction(final Rl08f45DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 資料驗證 (Rl08f71).
     * 
     * @param dto
     *            the dto
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.VERIFY)
    public void validAction(final Rl08f71DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 資料驗證 (Rl08f72).
     * 
     * @param dto
     *            the dto
     * @param execType
     *            使用者資訊
     */
    @RisServiceMethod(MethodType.VERIFY)
    public void validAction(Rl08f72DTO dto, ExecutantType execType);

    /**
     * 資料驗證 (Rl08f73).
     * 
     * @param dto
     *            重印選舉人投票通知單 DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             資料驗證 (Rl08f73)失敗
     */
    @RisServiceMethod(MethodType.VERIFY)
    public void validAction(Rl08f73DTO dto, ExecutantType execType) throws RisBusinessException;

    /**
     * 資料驗證 (Rl08f80).
     * 
     * @param dto
     *            選舉人名冊異動清單DTO
     * @param execType
     *            使用者資訊
     */
    @RisServiceMethod(MethodType.VERIFY)
    public void validAction(Rl08f80DTO dto, ExecutantType execType);

    /**
     * 取得選舉組合作用檔
     * 
     * @param voteCode
     *            選舉代碼
     * @param voteDate
     *            選舉日期
     * @param executantType
     * @return Rlde800wType
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rlde800wType getRlde800wType(final String voteCode, final String voteDate, final ExecutantType executantType);

}
