/*
 * Copyright (c) 2010-2020 IISI. All rights reserved.
 * 
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.common;

import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;

public interface Rldf2FilesComponent {
    void rldf2Files_forWebService(String personId, String siteId, ExecutantType executantType);

    void rldf2Files(String personId, String siteId, ExecutantType executantType);

    <T> List<T> files2Rldfs(String personId, String siteId, Class<T> clz, ExecutantType executantType);
}
