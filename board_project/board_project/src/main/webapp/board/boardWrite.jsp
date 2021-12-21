<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style type="text/css">
		table {
			width: 400px;
			border-collapse:collapse; 
		}
		th,td{
			border: 1px solid #cccccc;
			padding: 5px;
		}
	</style>
	<script type="text/javascript">
		function fn_submit() {
			document.frm.submit();
		}
	</script>
</head>
<body>
	<form name="frm" method="post" action="boardWriteSave.do">
		<table>
			<caption>게시판 등록</caption>
			<tr>
				<th width="20%">제목</th>
				<td width="80%"><input type="text" name="title"></td>
			</tr>
			<tr>
				<th>암호</th>
				<td><input type="password" name="pass"></td>
			</tr>
			<tr>
				<th>글쓴이</th>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea name="content"></textarea></td>
			</tr>
			<tr>
				<td colspan="2">
					<button type="submit" onclick="fn_submit();">저장</button>
					<button type="reset">취소</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
