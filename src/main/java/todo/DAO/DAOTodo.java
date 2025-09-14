package todo.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import todo.DBUtil.DBUtil;
import todo.Entity.TodoDetails;

public class DAOTodo {

	public static List<TodoDetails> getTodoList(String email) throws Exception {
		System.out.println(email);
		Connection con = DBUtil.getConnection();

		String sql = "select * from tododetails where email=?";

		PreparedStatement pr = con.prepareStatement(sql);

		pr.setString(1, email);

		ResultSet rs = pr.executeQuery();

		List<TodoDetails> list = new ArrayList<TodoDetails>();

		while (rs.next()) {

			TodoDetails td = new TodoDetails();
			td.setId(rs.getInt(1));
			td.setName(rs.getString(2));
			td.setTodo(rs.getString(3));
			td.setStatus(rs.getString(4));
			td.setEmail(rs.getString(5));

			list.add(td);
		}
		con.close();
		return list;
	}

	public static int addlist(TodoDetails td) {

		Connection con;
		int n=0;
		String sql = "insert into tododetails(name,todo,status,email) values(?,?,?,?)";
		try {
			con = DBUtil.getConnection();
			PreparedStatement pr = con.prepareStatement(sql);
			
			pr.setString(1, td.getName());
			pr.setString(2, td.getTodo());
			pr.setString(3, td.getStatus());
			pr.setString(4, td.getEmail());
			
			n = pr.executeUpdate();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return n;

	}
	
	public  TodoDetails getDetailsById(int id) {
		
		String sql = "select * from tododetails where id=?";
		try {
			Connection con =DBUtil.getConnection();
			
			PreparedStatement pr = con.prepareStatement(sql);
			
			pr.setInt(1, id);
			
			ResultSet rs = pr.executeQuery();
			
			while(rs.next()) {
				TodoDetails td = new TodoDetails();
				td.setId(rs.getInt(1));
				td.setName(rs.getString(2));
				td.setTodo(rs.getString(3));
				td.setStatus(rs.getString(4));
				td.setEmail(rs.getString(5));
				
				return td;
			}
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return null;
	}
	
	
	//for update the details based on the id
	
	public static int update(TodoDetails td) {
		
		int n=0;
		try {
			Connection con = DBUtil.getConnection();
			
			String sql = "update tododetails set name=?,todo=?,status=? where id=?";
			
			PreparedStatement pr = con.prepareStatement(sql);
			
			pr.setString(1, td.getName());
			pr.setString(2, td.getTodo());
			pr.setString(3, td.getStatus());
			pr.setInt(4, td.getId());
			
			
			
			n = pr.executeUpdate();
			con.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return n;
		
	}
	

	public static int deletetodo(int id) {
		
		int n=0;
		
		try {
			Connection con = DBUtil.getConnection();
			String sql = "delete from tododetails where id=?";
			
			PreparedStatement pr = con.prepareStatement(sql);
			pr.setInt(1, id);
			n = pr.executeUpdate();
			
			con.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return n;
		
	}
}
