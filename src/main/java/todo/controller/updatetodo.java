package todo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo.DAO.DAOTodo;
import todo.Entity.TodoDetails;

@WebServlet("/update")
public class updatetodo extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		System.out.println("id in the up :"+id);
		String name=req.getParameter("name");
		String todo=req.getParameter("todo");
		String status=req.getParameter("status");
		
		TodoDetails td = new TodoDetails();
		td.setId(id);
		td.setName(name);
		td.setTodo(todo);
		td.setStatus(status);
		
		if(DAOTodo.update(td)>0) {
			resp.sendRedirect("todo.jsp");
		}
		else {
			resp.sendRedirect("edit.jsp");
		}
	}
}
