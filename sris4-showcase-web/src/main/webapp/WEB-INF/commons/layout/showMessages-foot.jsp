<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div style="text-align: center; font-size: 12pt;">
    <table style="width: 80%; margin-left: auto; margin-right: auto;">
        <c:if test="${not empty message.resultMsg}">
            <tr>
                <td style="color: blue;">${message.resultMsg}</td>
            </tr>
        </c:if>
        <c:if test="${not empty message.alertMsg}">
            <tr>
                <td style="color: red;">${message.alertMsg}</td>
            </tr>
        </c:if>
    </table>

    <c:if test="${not empty retrievalPath}">
        <spring:url value="/app${retrievalPath}" var="pre_path" />
        <div style="text-align: center; padding: 12px;">
            <input type="button" value="回上頁" onclick="document.location.href='${pre_path}';">
        </div>
    </c:if>

</div>

