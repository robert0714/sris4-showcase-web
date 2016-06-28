<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<div style="text-align: center; font-size: 18pt; padding-top: 20px;line-height: 28pt;">
    <c:choose>
        <c:when test="${empty serviceTimeInfo.msg}">資訊系統作業公告</c:when>
        <c:otherwise>${serviceTimeInfo.msg}</c:otherwise>
    </c:choose>
    <br>
            
    <c:choose>
    <c:when test="${empty serviceTimeInfo.endTimeString and not empty serviceTimeInfo.startTimeString}">
    本項服務開放時間自<span style="color: #0000E3;">${serviceTimeInfo.startTimeString}</span>起。
    </c:when>
    <c:when test="${not empty serviceTimeInfo.endTimeString and empty serviceTimeInfo.startTimeString}">
    本項服務開放時間至<span style="color: #0000E3;">${serviceTimeInfo.endTimeString}</span>止。
    </c:when>
    <c:otherwise>
    本項服務開放時間自<span style="color: #0000E3;">${serviceTimeInfo.startTimeString}</span>至<span style="color: #0000E3;">${serviceTimeInfo.endTimeString}</span>止。   
    </c:otherwise>
    </c:choose><br>
</div>

<div style="text-align: center; padding: 12px;">
    <input type="button" value="回到首頁" onclick="document.location.href='https://www.ris.gov.tw';">
</div>
