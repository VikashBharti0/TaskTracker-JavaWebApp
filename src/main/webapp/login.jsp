<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="CSS/login.css">
<link rel="stylesheet"
	href="CSS/bootstrap-5.0.2-dist/bootstrap-5.0.2-dist/css/bootstrap.min.css">
<title>Register</title>
</head>
<body>
	<%@include file="header.jsp" %>
	<div class="containerB" id="loginCon">
		<form action="registration" method="get">

			<h2>Login</h2>

			<input type="text" class="form-control" name="email"
				placeholder="Email Id"> <br> <input type="password"
				class="form-control" name="password" placeholder="Password"><br>


			<%
			String wg = (String) session.getAttribute("wrong");
			if (wg != null) {
			%>
			<p style="color: red"><%=wg%></p>

			<%
			session.removeAttribute("wrong");
			}
			%>
			<div class="co" style="margin-top: 15px;">
				<button class="btn" type="submit">Log In</button>
			</div>

		</form>
		<div class="alreadyAcc">
			<span>Don't have an account </span><a href="register.jsp">Sign Up</a>
		</div>
	</div>
</body>
</html>