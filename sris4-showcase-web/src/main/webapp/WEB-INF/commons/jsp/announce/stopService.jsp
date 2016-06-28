<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<div style="text-align: center; font-size: 18pt; padding-top: 20px;line-height: 28pt;">
    <c:choose>
        <c:when test="${empty serviceTimeInfo.msg}">因應戶役政資訊系統版本更新作業</c:when>
        <c:otherwise>${serviceTimeInfo.msg}</c:otherwise>
    </c:choose>
    ，本項服務目前暫停使用。<br>
    <span style="color: #0000E3;"><c:choose>
                <c:when test="${empty serviceTimeInfo.endTimeString}">將於近日重新開放</c:when>
                <c:otherwise>預定開放時間為：${serviceTimeInfo.endTimeString}</c:otherwise>
            </c:choose> </span>。<br> 
            造成不便，敬請見諒。<br>
</div>

<div style="text-align: center; padding: 12px;">
    <input type="button" value="回到首頁" onclick="document.location.href='https://www.ris.gov.tw';">
</div>
