<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@page import="com.iisigroup.udeweb.common.HttpStatus"%>
<%@page import="org.apache.commons.lang3.EnumUtils"%>
<%@page import="org.apache.commons.lang3.math.*"%>
<%@include file="/WEB-INF/commons/layout/include/tag-libraries.jsp"%>


<div>
    <%
    try {
        final String code = String.valueOf(request.getAttribute("javax.servlet.error.status_code"));
        final String reasonPhrase = HttpStatus.getDescription(code);
        %>
        <div style="background-color: #FFAFAF; padding:12px; font-size:16pt; border:red 1px solid;"><%=reasonPhrase%></div>
        <div style="padding:6px;padding-left:2em; font-size:14pt;">
        <% /* request.getAttribute("javax.servlet.error.message") */ %>
        <%
        if ("404".equals(code) && request.getAttribute("javax.servlet.error.request_uri")!=null){
        %>
                        請求資源無效：<%=request.getAttribute("javax.servlet.error.request_uri") %><br>
        <%    
        }
        %></div><%
    } catch (Exception e) {
        %>UNKNOWN ERROR : <%=e%><%
    }
    %>
</div>
