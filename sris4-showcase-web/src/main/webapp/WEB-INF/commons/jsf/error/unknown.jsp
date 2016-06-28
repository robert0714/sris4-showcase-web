<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/commons/layout/include/tag-libraries.jsp"%>

<div style="text-align: center;">
    <c:if test="${not empty message.title}">
        <h2 style="font-size: 18pt; color: blue; font-weight: bold;">${message.title}</h2>
    </c:if>
</div>

<div style="text-align: center; font-size: 12pt;">
    <table style="width: 80%; margin-left: auto; margin-right: auto;">
        <c:if test="${not empty message.resultMsg}">
            <tr>
                <td style="color: blue; line-height: 20pt;">${message.resultMsg}</td>
            </tr>
        </c:if>
        <c:if test="${not empty message.alertMsg}">
            <tr>
                <td style="color: red;">${message.alertMsg}</td>
            </tr>
        </c:if>
    </table>
    <br>

    <div class="alert alert-warning">
        <strong>Warning!</strong> Indicates a warning that might need attention.
    </div>

    <div class="alert alert-danger">
        <strong>Danger!</strong> Indicates a dangerous or potentially negative action.
    </div>


</div>