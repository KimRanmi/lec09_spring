<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 상세</title>
<link href="<c:url value='/resources/css/board/detail.css'/>" rel="stylesheet" type="text/css">
</head>
<body>
	<jsp:include page="../include/header.jsp"/>
	<jsp:include page="../include/nav.jsp"/>
	<section>	
		<div id="section_wrap">
			<div class="word">
				<h3>게시글 상세 보기</h3>
			</div>
			<div class="board_detail">
				<ul>
					<li>
						<figure>
							<figcaption>
								<c:out value="${detail.ori_thumbnail }"/>
							</figcaption>
							<img src="<c:url value='/boardUploadImg/${detail.new_thumbnail }'/>"/>
						</figure>
					</li>
					<li>
						<table>
							<tr>
								<td>게시글 제목</td>
								<td><c:out value="${detail.board_title }"/></td>
							</tr>
							<tr>
								<td>게시글 내용</td>
								<td><c:out value="${detail.board_content }"/></td>
							</tr>
							<tr>
								<td>등록일</td>
								<td>
									<fmt:formatDate pattern="yy-MM-dd" value="${detail.reg_date}"/>
								</td>
							</tr>
						</table>
					</li>
				</ul>
				
			</div>
			
			<div class="buttons">
				<a class="update_board_button" href="<c:url value='/board/update/${detail.board_no }'/>">게시글 수정</a>
				<a class="delete_board_button" onclick="deleteFrm();" href="<c:url value='/board/${detail.board_no }'/>">게시글 삭제</a>			
			</div>
		</div>
	</section>
	<script type="text/javascript">
		const deleteFrm = function(){
			if(confirm("정말 삭제 하시겠습니까?")){
			fetch('<%= request.getContextPath()%>/board/${detail.board_no}',{
				method : 'DELETE',
			})
			.then(response => response.json())
				.then(data => {
					alert(data.res_msg);
					if(data.res_code == '200'){
						location.href="<%=request.getContextPath()%>/board";
					}
				})
			}
		};
	</script>	
</body>
</html>