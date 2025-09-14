<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="CSS/login.css">
<link rel="stylesheet" href="CSS/bootstrap-5.0.2-dist/bootstrap-5.0.2-dist/css/bootstrap.min.css">
<title>Register</title>
</head>
<body>
	<%@include file="header.jsp" %>
	<div class="containerB">
		<form action="registration" method="post">

			<h2>Create Account</h2>
			<input type="text" name="first_name" placeholder="First Name"> <br>
			<input type="text"  name="last_name"placeholder="Last Name"> <br>
			<input type="text" name="email" placeholder="Email Id"> <br>
			<input type="text"  name="phone" placeholder="Phone Number"> <br>
			<input type="password" name="password" placeholder="Password"><br>
			<input type="password"  name="repassword" placeholder="re type password"> <br>
			<%
				String ms=(String) session.getAttribute("miss");
				if(ms!=null){
			%>
			<div style="color:red"><%=ms%></div>
			<%
			session.removeAttribute("miss");
			}
			%>
				<div class="ch">
					<input type="checkbox" class="agree" required>
					<span>agree to the </span><a href="">terms and conditions</a>
					
				</div>
			
			<div class="co" style="margin-top:15px;">
				<button class="btn" type="submit">Register</button>
			</div>

		</form>
		<div class="alreadyAcc">
			<span>Have already an account?</span><a href="login.jsp">Login here</a>
		 </div>
	</div>
</body>
</html>