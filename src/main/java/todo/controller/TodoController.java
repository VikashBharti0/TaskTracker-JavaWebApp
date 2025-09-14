package todo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import todo.DAO.DAOTodo;
import todo.Entity.TodoDetails;

@WebServlet("/addtodo")
public class TodoController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String todo = req.getParameter("todo");
		String status = req.getParameter("status");
		HttpSession session = req.getSession(false);
		String email = (String)session.getAttribute("email");
		
		System.out.println(email);
		TodoDetails td=new TodoDetails();
		td.setName(name);
		td.setTodo(todo);
		td.setStatus(status);
		td.setEmail(email);
		
		if((DAOTodo.addlist(td))>0) {
//			HttpSession sn =  req.getSession();
//			sn.setAttribute("state", "New Task added Successfully...");
			resp.sendRedirect("todo.jsp");
		}else {
//			HttpSession session1=req.getSession();
//			session1.setAttribute("stateF", "something wrong try again");
			resp.sendRedirect("addTodo.jsp");
		}
	}
}
