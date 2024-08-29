<%@ page import="java.util.Map"%>
<%@ page import="java.util.List"%>
<%@ page import="com.tenco.movie.repository.model.Notice"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!-- header.jsp -->
<%@ include file="/WEB-INF/view/layout/header.jsp"%>

<div class="notice--list">
	<h3 class="notice--title">공지사항</h3>

	<c:choose>
		<c:when test="${noticeList != null}">
			<table class="table">
				<thead>
					<tr>
						<th>id</th>
						<th>카테고리</th>
						<th>제목</th>
						<th>날짜</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="notice" items="${noticeList}">
						<tr>
							<td>${notice.id}</td>
							<td>${notice.category}</td>
							<td><a href="/notice/detail?id=${notice.id}">${notice.title}</a></td>
							<td>${notice.timestampToString()}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:when>
		<c:otherwise>
			<div class="jumbotron display-4">
				<h5>게시된 공지가 없습니다.</h5>
			</div>
		</c:otherwise>
	</c:choose>
	
	<br>
		<!-- Pagination -->
		<div class="d-flex justify-content-center" >
			<ul class="pagination">
				<!-- Previous Page Link -->
				<li class="page-item  <c:if test='${currentPage == 1}'>disabled</c:if>">
					<a class="page-link" href="?page=${currentPage - 1}&size=${size}" >Previous</a>
				</li>
				
				<!-- Page Numbers -->
				<!-- [Previous]  1 2 3 4 5 6 7 8   [Next] -->
				<c:forEach begin="1" end="${totalPages}"  var="page" >
				<li class="page-item  <c:if test='${page == currentPage}'>active </c:if>">
					<a class="page-link"  href="?page=${page}&size=${size}" >${page}</a>
				</li>
				</c:forEach>
				
				<!-- Next Page Link  -->	
				<li class="page-item <c:if test='${currentPage == totalPages}'>disabled</c:if>" >
					<a class="page-link" href="?page=${currentPage + 1}&size=${size}" >Next</a>
				</li>
			</ul>
			
		</div>
	
</div>
</div>
</div>
<!-- end of content.jsp(xxx.jsp) -->
<%@ include file="/WEB-INF/view/layout/footer.jsp"%>
</body>
</html>
