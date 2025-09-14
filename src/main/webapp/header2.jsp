<html>
<head>
<link rel="stylesheet" href="CSS/navbar.css">
<link rel="stylesheet" href="CSS/bootstrap-5.0.2-dist/bootstrap-5.0.2-dist/css/bootstrap.min.css">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">Todo</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo02"
				aria-controls="navbarTogglerDemo02" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarTogglerDemo02">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
				
					<li class="nav-item">
						<a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
					</li>
					<li class="nav-item">
						<a class="nav-link active" aria-current="page" href="addTodo.jsp">Add-Todo</a>
					</li>


				</ul>
				
			</div>
		</div>
	</nav>
	<% String email = (String)session.getAttribute("email"); %>
				<div class="email">
					<h3 class="mail"><%=email %>
					<form  action="logout" method="get">
						<button class="logoutb" type="submit"><a href="login.jsp" >Logout</a></button>
					</form></h3>
					
				</div>
	
</body>
</html>