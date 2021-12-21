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
		border-collapse: collapse;	
		}
	td, th{
		border: 1px solid #cccccc;
		padding: 5px;
	}
</style>
<script src="/board_project/script/jquery.js"></script>
<script src="/board_project/script/jquery-ui.min.js"></script>
<script type="text/javascript">
	function fn_submit(){
/*	
		if(document.frm.title.value == ""){
			alert("제목을 입력해 주세요!");
			document.frm.title.focus();
			return false;
		}
		if(document.frm.pass.value == ""){
			alert("암호을 입력해 주세요!");
			document.frm.pass.focus();
			return false;
		}
		if(document.frm.name.value == ""){
			alert("글쓴이를 입력해 주세요!");
			document.frm.name.focus();
			return false;
		}
		if(document.frm.content.value == ""){
			alert("내용을 입력해 주세요!");
			document.frm.content.focus();
			return false;
		}
*/
		if($("#title").val() == ""){
			alert("제목을 입력해 주세요!");
			$("#title").focus();
			return false;
		}
		if($("#pass").val() == ""){
			alert("암호을 입력해 주세요!");
			$("#pass").focus();
			return false;
		}
		if($("#name").val() == ""){
			alert("글쓴이를 입력해 주세요!");
			$("#name").focus();
			return false;
		}
		if($("#content").val() == ""){
			alert("내용을 입력해 주세요!");
			$("#content").focus();
			return false;
		}
		
		//비동기방식
		var formData = $("#frm").serialize();
		
		$.ajax({
			type:"POST",
			data:formData,
			url:"boardWriteSave.do",
			dataType:"text",
			success:function(data){
				if(data == "ok"){
					alert("저장완료");
					location="boardList.do";
				}else{
					alert("저장실패");
				}
			},
			error:function(){
				alert("오류발생");
			}
		});
		
		//동기방식
		/* document.frm.submit(); */
		
	}
</script>
</head>
<body>
<!-- <form name= "frm" action="boardWriteSave.do" method="post"> -->
	<form id="frm">
		<table>
			<caption>게시판 등록</caption>
			<tr>
				<th width="20%"><label for="title"/>제목</th>
				<td width="80%"><input type="text" name="title" id="title"></td>
			</tr>
			<tr>
				<th><label for="pass"/>암호</th>
				<td><input type="password" name="pass" id="pass"></td>
			</tr>
			<tr>
				<th><label for="name"/>글쓴이</th>
				<td><input type="text" name="name" id="name"></td>
			</tr>
			<tr>
				<th><label for="content"/>내용</th>
				<td><textarea name="content" id="content"></textarea></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<button type="submit" onclick="fn_submit(); return false;">저장</button>
					<button type="reset">취소</button>
					<button type="button" onclick="location.href='boardList.do'">목록</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>