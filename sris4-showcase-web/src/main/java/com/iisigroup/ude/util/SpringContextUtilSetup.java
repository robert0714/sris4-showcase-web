/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package com.iisigroup.ude.util;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.iisigroup.ude.util.profiler.InitActionProfiler;

/**
 * For Spring 3.1 以後實作.
 */
public class SpringContextUtilSetup implements ApplicationContextAware, DisposableBean {

    /** Logger Object. */
    private static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(SpringContextUtilSetup.class);

    private ApplicationContext context;

    @Override
    public void setApplicationContext(final ApplicationContext context) {
        if (this.context != null) {
            return;
        }
        this.context = context;
        LOGGER.info("SpringContextUtils Init");
        SpringContextUtils.setApplicationContextStatic(context);
        try {
            final String usedTimeLog = InitActionProfiler.getUsedTimeLog();
            if (StringUtils.isNotBlank(usedTimeLog)) {
                LOGGER.info("==init == All INIT-TIME PROFILER === {}", usedTimeLog);
            }
        } catch (final Exception e) {
            LOGGER.error("", e);
        }
    }

    @Override
    public void destroy() throws Exception {
        this.context = null;
    }
}
