<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<h1 class="text-center text-success">Add-Todo</h1>

		<form action="addtodo" method="post">
			
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Name</label> 
				<input type="text" class="form-control" id="name" name="name">

			</div>
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Todo</label> 
				<input type="text" class="form-control" id="todo" name="todo">

			</div>
			<div class="mb-3">
				<label for="disabledSelect" class="form-label">Status</label> 
				<select id="disabledSelect" class="form-select" name="status">
					<option >--Select--</option>"
					<option value="Panding">Pending..</option>
					<option value="Complited">Complited</option>
				
				</select>
			</div>
			<div class="text-center mt-5">
			<button type="submit" class="btn btn-primary">ADD</button>
			</div>
		</form>
	</div>
</body>
</html>