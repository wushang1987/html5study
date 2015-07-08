package example;



public class LoginAction {
	private String username;
	private String password;
	
	private String title;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String execute() throws Exception{
		System.out.println(title);
		return "error";
	}
}
