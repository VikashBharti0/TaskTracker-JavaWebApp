package todo.Entity;

public class user {
	
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String phno;
	private String password;
	private String repasswrod;
	
	public user(int id, String firstName, String lastName, String email, String phno, String password,
			String repasswrod) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phno = phno;
		this.password = password;
		this.repasswrod = repasswrod;
	}

	public user() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRepasswrod() {
		return repasswrod;
	}

	public void setRepasswrod(String repasswrod) {
		this.repasswrod = repasswrod;
	}
	
	
	
}
