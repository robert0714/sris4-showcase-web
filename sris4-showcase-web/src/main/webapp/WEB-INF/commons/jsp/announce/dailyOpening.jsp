<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<div style="text-align: center; font-size: 18pt; padding-top: 20px;line-height: 28pt;">
    <c:choose>
        <c:when test="${empty serviceTimeInfo.msg}">資訊系統作業公告</c:when>
        <c:otherwise>${serviceTimeInfo.msg}</c:otherwise>
    </c:choose>
    <br>
    本項服務開放時間為每日<span style="color: #0000E3;">${serviceTimeInfo.startTimeString}</span>至<span style="color: #0000E3;">${serviceTimeInfo.endTimeString}</span>。   
    <br>
</div>

<div style="text-align: center; padding: 12px;">
    <input type="button" value="回到首頁" onclick="document.location.href='https://www.ris.gov.tw';">
</div>
