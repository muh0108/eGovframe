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
	<script type="text/javascript">
		function fn_submit() {
			if(document.frm.name.value==""){
				alert("코드명을 입력해 주세요.");
				document.frm.name.focus();
				return false;
			}
			document.frm.submit();
		}
	</script>
	<style type="text/css">
		table {
			width: 400px;	
			border-collapse: collapse;	
		}
		td, th{
			border: 1px solid #cccccc;
			padding: 5px;
		}
	</style>
</head>
<body>
	<form name="frm" action="codeModifyWrite.do" method="post">
		<input type="hidden" name="code" value="${codeVO.code }">
		<table>
			<tr>
				<th>분류</th>
				<td>
					<select name="gid">
						<option value="1" <c:if test="${codeVO.gid == 1}">selected</c:if>>Job(업무)</option>
						<option value="2" <c:if test="${codeVO.gid == 2}">selected</c:if>>Hobby(취미)</option>
					</select>
				</td>
			</tr>
			<tr>
				<th>코드명</th>
				<td><input type="text" name="name" value="${codeVO.name}"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<button type="submit" onclick="fn_submit(); return false;">저장</button>
					<button type="reset">취소</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>