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
	
	  <h2>MINI �� ������Ʈ</h2>
	  <p>FireWork : ��ä��, ���, ���� , ���ȭ, ������, �ּ���</p>
	
	  <table class="table">
	
	    <thead>
	      <tr>
	        <th>������ List</th>
	      </tr>
	    </thead>
	
	    <tbody>
	    
			<tr class="primary"> 
			    <td><a href="${pageContext.request.contextPath}/admingoods/GoodsAddForm.ag"> 01_������ ��ǰ ��� �׽�Ʈ </a><br><br></td>
			</tr>
			<tr class="success">
			    <td><a href="${pageContext.request.contextPath}/admingoods/GoodsList.ag"> 02_������ ��ǰ ����Ʈ �׽�Ʈ </a><br><br></td>
			</tr>
			<tr class="info">
			   	<td><a href="${pageContext.request.contextPath}/member/MemberJoin.me"> 03_ȸ������ �׽�Ʈ</a><br><br></td>
			</tr>
			 <tr class="warning">
			   	<td><a href="${pageContext.request.contextPath}/member/MemberLogin.me"> 04_�α���ȭ�� �׽�Ʈ </a><br><br></td>
			</tr>
			  <tr class="danger">
				<td><a href="${pageContext.request.contextPath}/goods/GoodsList.go?item=new_item&page=1"> 05_������ ��ǰ����Ʈ �׽�Ʈ </a><br><br></td>
			</tr>
			<tr class="primary">
				<td><a href="${pageContext.request.contextPath}/goods/BasketList.ba?item=outwear&gr_goods_num=1&isitem=new"> 06_��ٱ��� ����Ʈ �׽�Ʈ </a><br><br></td>
			</tr>
	  	     
	    </tbody>
	  </table>
	</div>

</body>
</html>


<%--
<%
	//06��ٱ��� ����Ʈ �׽�Ʈ  <����Ʈ���� ��ٱ��� �׽�Ʈ�ÿ��� �α��� �� �׽�Ʈ>
	//response.sendRedirect(request.getContextPath()+"/goods/BasketList.ba?item=outwear&gr_goods_num=1&isitem=new");
	//05������ ��ǰ����Ʈ �׽�Ʈ <����Ʈ���� ��ٱ��� �׽�Ʈ�ÿ��� �α��� �� �׽�Ʈ>
	//response.sendRedirect(request.getContextPath()+"/goods/GoodsList.go?item=new_item&page=1");
	//04 �α���ȭ�� �׽�Ʈ
	//response.sendRedirect(request.getContextPath()+"/member/MemberLogin.me");
	//03ȸ������ �׽�Ʈ
	//response.sendRedirect(request.getContextPath()+"/member/MemberJoin.me");
	//02������ ��ǰ ����Ʈ �׽�Ʈ
	//response.sendRedirect(request.getContextPath()+"/admingoods/GoodsList.ag");
	//01������ ��ǰ ��� �׽�Ʈ
	//response.sendRedirect(request.getContextPath()+"/admingoods/GoodsAddForm.ag");
%>
--%>