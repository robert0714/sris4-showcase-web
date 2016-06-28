<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div id="messageTitle" style="text-align: center;">

    <c:if test="${not empty message.title}">
        <h2 style="font-size: 18pt; color: blue; font-weight: bold;">${message.title}</h2>
    </c:if>
    
    <c:if test="${message.showResponseTime}">
        <h3 style="font-size: 16pt; color: blue; font-weight: bold;">${message.responseTimeStr}</h3>
    </c:if>
    
</div>