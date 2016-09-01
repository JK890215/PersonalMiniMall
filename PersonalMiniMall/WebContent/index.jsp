<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>

<!DOCTYPE html>

<html>

<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
	
	  <h2>MINI 팀 프로젝트</h2>
	  <p>FireWork : 전채은, 김용, 강현 , 양경화, 이은진, 최수빈</p>
	
	  <table class="table">
	
	    <thead>
	      <tr>
	        <th>관리자 List</th>
	      </tr>
	    </thead>
	
	    <tbody>
	    
			<tr class="primary"> 
			    <td><a href="${pageContext.request.contextPath}/admingoods/GoodsAddForm.ag"> 01_관리자 상품 등록 테스트 </a><br><br></td>
			</tr>
			<tr class="success">
			    <td><a href="${pageContext.request.contextPath}/admingoods/GoodsList.ag"> 02_관리자 상품 리스트 테스트 </a><br><br></td>
			</tr>
			<tr class="info">
			   	<td><a href="${pageContext.request.contextPath}/member/MemberJoin.me"> 03_회원가입 테스트</a><br><br></td>
			</tr>
			 <tr class="warning">
			   	<td><a href="${pageContext.request.contextPath}/member/MemberLogin.me"> 04_로그인화면 테스트 </a><br><br></td>
			</tr>
			  <tr class="danger">
				<td><a href="${pageContext.request.contextPath}/goods/GoodsList.go?item=new_item&page=1"> 05_구매자 상품리스트 테스트 </a><br><br></td>
			</tr>
			<tr class="primary">
				<td><a href="${pageContext.request.contextPath}/goods/BasketList.ba?item=outwear&gr_goods_num=1&isitem=new"> 06_장바구니 리스트 테스트 </a><br><br></td>
			</tr>
	  	     
	    </tbody>
	  </table>
	</div>

</body>
</html>


<%--
<%
	//06장바구니 리스트 테스트  <리스트에서 장바구니 테스트시에는 로그인 후 테스트>
	//response.sendRedirect(request.getContextPath()+"/goods/BasketList.ba?item=outwear&gr_goods_num=1&isitem=new");
	//05구매자 상품리스트 테스트 <리스트에서 장바구니 테스트시에는 로그인 후 테스트>
	//response.sendRedirect(request.getContextPath()+"/goods/GoodsList.go?item=new_item&page=1");
	//04 로그인화면 테스트
	//response.sendRedirect(request.getContextPath()+"/member/MemberLogin.me");
	//03회원가입 테스트
	//response.sendRedirect(request.getContextPath()+"/member/MemberJoin.me");
	//02관리자 상품 리스트 테스트
	//response.sendRedirect(request.getContextPath()+"/admingoods/GoodsList.ag");
	//01관리자 상품 등록 테스트
	//response.sendRedirect(request.getContextPath()+"/admingoods/GoodsAddForm.ag");
%>
--%>