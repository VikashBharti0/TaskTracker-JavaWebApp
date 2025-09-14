<%@page import="todo.DAO.DAOTodo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="CSS/bootstrap-5.0.2-dist/bootstrap-5.0.2-dist/css/bootstrap.min.css">
<link rel="stylesheet" href="CSS/todo.css">
<title>Todo list</title>
</head>
<body>
	<%@include file="header2.jsp"%>
	
	

	<h1 class="text-center text-success">TODO-LIST</h1>
	<div class="container ">
		<table class="table  table-striped" border="3px">

			<thead class="bg-success text-white">
			
				<tr>
					<%-- <th scope="col">ID</th> --%>
				
					<th scope="col">Name</th>
					<th scope="col">Todo</th>
					<th scope="col">Status</th>
					<th scope="col">Action</th>
				</tr>
			</thead>
			
			<tbody>
			<%
			String mail =(String)session.getAttribute("email");
			java.util.List<todo.Entity.TodoDetails> list=DAOTodo.getTodoList(mail);
			for(todo.Entity.TodoDetails t:list){ %>
				<tr>
			<%-- 		<th scope="row"><%=t.getId()%></th   --%>
			
				
					<td><%=t.getName()%></td>
					<td><%=t.getTodo()%></td>
					<td><%=t.getStatus()%></td>
					<td>
					<a href="edit.jsp?id=<%=t.getId() %>" class="btn btn-sm btn-success">Edit</a> 
					<a href="delete?id=<%=t.getId() %>" class="btn btn-sm btn-danger">Delete</a>
					</td>
				</tr>
			<%} %>
			</tbody>

		</table>
	</div>
</body>
</html>