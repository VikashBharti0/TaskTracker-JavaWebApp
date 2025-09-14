package todo.controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import todo.DAO.DAOUser;

import todo.Entity.user;

@WebServlet("/registration")
public class controller extends HttpServlet{
	DAOUser dao=new DAOUser();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String first_name=req.getParameter("first_name");
		String last_name=req.getParameter("last_name");
		String email=req.getParameter("email");
		String phone=req.getParameter("phone");
		String password=req.getParameter("password");
		String repassword=req.getParameter("repassword");
		
		
		
		
		if(password.equals(repassword)) {
			
			user u1=new user();
			u1.setFirstName(first_name);
			u1.setLastName(last_name);
			u1.setEmail(email);
			u1.setPhno(phone);
			u1.setPassword(password);
			
			
			if(dao.saveReg(u1)>0) {
				
				RequestDispatcher dis=req.getRequestDispatcher("login.jsp");
				dis.forward(req, resp);
				
			}else {
				HttpSession session=req.getSession();
				session.setAttribute("resFail", "Registeration Failed please try again");
				resp.sendRedirect("register.jsp");

			}
			
			
		}else {
			HttpSession session=req.getSession();
			session.setAttribute("miss", "Miss match password");
			resp.sendRedirect("register.jsp");

			
		}
	
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	 String email =	req.getParameter("email");
	 String password = req.getParameter("password");
	 
	 if(dao.loginVer(email, password)) {
		 	
		 	HttpSession session = req.getSession();
		 	session.setAttribute("email", email);
		 	resp.sendRedirect("todo.jsp");

	 }else {
		 	HttpSession session=req.getSession();
			session.setAttribute("wrong", "wrong userid or password");
			resp.sendRedirect("login.jsp");
		 

	 }
	}
	
}
