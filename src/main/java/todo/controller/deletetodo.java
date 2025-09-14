package todo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo.DAO.DAOTodo;

@WebServlet("/delete")
public class deletetodo extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		System.out.println("vikash....");
		if((DAOTodo.deletetodo(id))>0){
			resp.sendRedirect("todo.jsp");
		}else {
			
			resp.sendRedirect("todo.jsp");
		}
		
	}
}
