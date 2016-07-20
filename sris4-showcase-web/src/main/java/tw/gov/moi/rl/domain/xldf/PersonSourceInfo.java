/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain.xldf;

/**
 * @author marcus
 * 
 */
public interface PersonSourceInfo {
    public String getSourceSiteId();

    public void setSourceSiteId(String sourceSiteId);

    public String getSourceRemoveYyymmdd();

    public void setSourceRemoveYyymmdd(String sourceRemoveYyymmdd);

    public String getSourceRemoveTime();

    public void setSourceRemoveTime(String sourceRemoveTime);
}
