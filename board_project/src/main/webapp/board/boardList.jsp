<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui"     uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style type="text/css">
		table{
			width: 700px;
			border-collapse: collapse;
			}
		th,td{
			border: 1px solid #cccccc;
			padding: 5px;
		}
		#btn{
			border: 0px;
		}
	</style>
</head>
<body>
	<table>
		<caption>게시판</caption>
		<colgroup>
			<col width="10%">
			<col width="20%">
			<col width="30%">
			<col width="30%">
			<col width="10%">
		</colgroup>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>글쓴이</th>
			<th>등록일</th>
			<th>조회수</th>
		</tr>
		<c:set var="count" value="1"/>
		<c:forEach items= "${resultList}" var="result">
			<tr>
				<td align="center"><c:out value="${count}"/></td>
				<td>${result.title }</td>
				<td align="center">${result.name }</td>
				<td align="center">${result.rdate }</td>
				<td align="center">${result.hits }</td>
			</tr>
			<c:set var="count" value="${count+1}"/>
		</c:forEach>
		<tr>
			<td colspan="5" id="btn" align="right">
				<button type="button" onclick="location.href='boardWrite.do'">글쓰기</button>
			</td>
		</tr>
	</table>
<!-- 
	<div style="width:700px; margin-top:5px;text-align:right;">
		<button type="button" onclick="location.href='boardWrite.do'">글쓰기</button>
	</div>
-->
</body>
</html>