<%@page import="todo.DBUtil.DBUtil"%>
<html>
<head>
<title>Welcome to TODO List</title>

<link rel="stylesheet" href="CSS/stylehome.css">
<link rel="stylesheet" href="CSS/bootstrap-5.0.2-dist/bootstrap-5.0.2-dist/css/bootstrap.min.css">
</head>
<body >
	<nav class="navbar navbar-expand-lg navbar-dark bg-primary" >
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
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#">Home</a></li>
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#"></a></li>
				</ul>
				
				<div>
					<h3><a href="login.jsp" style="color:red; text-decoration:none;"><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-arrow-right" viewBox="0 0 16 16">
  <path fill-rule="evenodd" d="M1 8a.5.5 0 0 1 .5-.5h11.793l-3.147-3.146a.5.5 0 0 1 .708-.708l4 4a.5.5 0 0 1 0 .708l-4 4a.5.5 0 0 1-.708-.708L13.293 8.5H1.5A.5.5 0 0 1 1 8"/>
</svg>Login</a></h3>
				</div>
			</div>
		</div>
	</nav>
	
	<div class="bd">
		<div>
			<img alt="" src="image/todo.png">
		</div>
		<div class="text">
			<p style="text-align: left; color: red; font-wight: bold">HI
			DEAR,</p>
		<h1>Welcome to TaskTracker</h1>
		<h4 style="color:white">Simplify your workflow with smart task tracking.</h4>
		<p style="text-align: left ;color:white;">Whether you're planning your day,
			managing work projects, or tracking personal goals, TaskTrackr helps
			you stay on top of your tasks with ease. Create to-do lists, set
			deadlines, and focus on what matters most — all in one place.</p>
		
		
		<a href="login.jsp"><button class="btns" id="login">Login</button></a>
		<a href="register.jsp"><button class="btns" id="register">Register</button></a>
		</div>
	
	</div>
	
</body>
</html>
