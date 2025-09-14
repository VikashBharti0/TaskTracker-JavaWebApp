<%@page import="todo.DAO.DAOTodo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="todo.Entity.TodoDetails" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="CSS/add.css">
<title>Todo Details post</title>
</head>
<body class="background-color:#f0f1f2;">
	<%@include file="header2.jsp"%>

	<div class="container" style="width: 500px" id="cnt">
	<%
	int id=Integer.parseInt(request.getParameter("id"));
	DAOTodo dt = new DAOTodo();
	TodoDetails td= dt.getDetailsById(id);
	
	%>
	
	<h1 class="text-center text-success">Update Details</h1>

		<form action="update" method="post">
		
			<input type="hidden" value="<%=id%>" name="id">
			
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Name</label> 
				<input type="text" class="form-control" value="<%=td.getName() %>" name="name">

			</div>
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Todo</label> 
				<input type="text" class="form-control" value="<%=td.getTodo() %>" name="todo">

			</div>
			<div class="mb-3">
				<label for="disabledSelect" class="form-label">Status</label> 
				<select id="disabledSelect" class="form-select" name="status">
					<%
						if("Pending".equals(td.getStatus())){
					%>
					<option value="Pending">Pending..</option>
					<option value="Complited">Complited</option>
				   <%}else{%>
					<option value="Complited">Complited</option>
					<option value="Pending">Pending..</option>
					<% 
					}%>
					
				</select>
			</div>
			<div class="text-center mt-5">
			<button type="submit" class="btn btn-primary">UPDATE</button>
			</div>
		</form>
	</div>
</body>
</html>