package todo.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import todo.DBUtil.DBUtil;
import todo.Entity.user;

public class DAOUser {

	static int n;

	public int saveReg(user ur) {

		String sql = "insert into userDB(fname,lname,email,phoneno,password) values(?,?,?,?,?)";
		try {

			Connection con = DBUtil.getConnection();
			PreparedStatement pr = con.prepareStatement(sql);

			pr.setString(1, ur.getFirstName());
			pr.setString(2, ur.getLastName());
			pr.setString(3, ur.getEmail());
			pr.setString(4, ur.getPhno());
			pr.setString(5, ur.getPassword());

			n = pr.executeUpdate();

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return n;
	}

	public boolean loginVer(String email, String pass) {

		String sql = "select * from userdb where email=? and password=?";

		try (Connection con = DBUtil.getConnection(); PreparedStatement pr = con.prepareStatement(sql)) {

			pr.setString(1, email);
			pr.setString(2, pass);

			ResultSet rs = pr.executeQuery();

			if (rs.next()) {
				return true;
			}

	
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}

		return false;
	}

}
