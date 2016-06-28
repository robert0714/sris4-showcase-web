/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.aeweb.showcase.common.auth;

import java.util.Optional;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.iisigroup.ude.util.SpringContextUtils;
import com.iisigroup.udeweb.security.PermissionManager;
import com.iisigroup.udeweb.security.common.MenuItem;
import com.iisigroup.udeweb.security.common.SystemUser;

/**
 * 在系統初始後，加入匿名使用者的選單到 applicationContext
 */
public class AnonymousMenuListener implements ServletContextListener {

    //================================================
    //== [Enumeration types] Block Start
    //== [Enumeration types] Block End
    //================================================
    //== [static variables] Block Start
    //== [static variables] Block Stop
    //================================================
    //== [instance variables] Block Start

    /** Logger Object. */
    private static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(AnonymousMenuListener.class);

    private static final String GUEST_MENU = "global_guestMenu";

    //== [instance variables] Block Stop
    //================================================
    //== [static Constructor] Block Start
    //== [static Constructor] Block Stop
    //================================================
    //== [Constructors] Block Start (含init method)
    //== [Constructors] Block Stop
    //================================================
    //== [Static Method] Block Start
    //== [Static Method] Block Stop
    //================================================
    //== [Accessor] Block Start
    //== [Accessor] Block Stop
    //================================================
    //== [Overrided Method] Block Start (Ex. toString/equals+hashCode)
    //== [Overrided Method] Block Stop
    //================================================
    //== [Method] Block Start
    //####################################################################
    //## [Method] sub-block :
    //####################################################################

    @Override
    public void contextInitialized(final ServletContextEvent context) {
        final Optional<PermissionManager> bean = SpringContextUtils.getBean(PermissionManager.class);
        if (bean.isPresent()) {
            final PermissionManager permissionManager = bean.get();
            final MenuItem rootMenu = permissionManager.getRootMenu(SystemUser.ANONYMOUS);
            final ServletContext servletContext = context.getServletContext();
            servletContext.setAttribute(GUEST_MENU, rootMenu);
            LOGGER.debug("1st level menu : {}", rootMenu.getChildren());
        }
    }

    @Override
    public void contextDestroyed(final ServletContextEvent context) {
        context.getServletContext().removeAttribute(GUEST_MENU);
    }

    //== [Method] Block Stop
    //================================================
    //== [Inner Class] Block Start
    //== [Inner Class] Block Stop
    //================================================
}
