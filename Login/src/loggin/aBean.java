
package loggin;

//import javax.servlet.http.HttpSession;

public class aBean {

	private String uname = "Fatmir", pass = "123";
	private String uname2 = "Fatmir2", pass2 = "1234";

	private String inUsername;
	private String inPassword;

	public String getName() {
		if (inPassword.equals(pass) && (inUsername.equals(uname))) {
			return user1.getName();
		}

		else if (inPassword.equals(pass2) && (inUsername.equals(uname2))) {
			return user2.getName();
		}
		return "";
	}

	public void setName(String message) {
		this.uname = message;
	}

	public String getPassword() {
		return pass;
	}

	public void setPassword(String password) {
		this.pass = password;
	}

	public String getNameb() {
		if (inPassword.equals(pass2) || (inUsername.equals(uname2))) {
			return "nameb";
		}

		return "";
	}

	public boolean validate() {
		if ((inPassword.equals(pass) && (inUsername.equals(uname)))
				|| ((inPassword.equals(pass2)) && (inUsername.equals(uname2)))) {
			return true;
		} else {
			return false;
		}
	}

	public void setNameb(String name) {
		this.uname2 = name;
	}

	public String getPasswordb() {
		return pass2;
	}

	public void setPasswordb(String password) {
		this.pass2 = password;
	}

	public String getInPassword() {
		return inPassword;
	}

	public void setInPassword(String inPassword) {
		this.inPassword = inPassword;
	}

	public String getInUsername() {
		return inUsername;
	}

	public void setInUsername(String inUsername) {
		this.inUsername = inUsername;
	}

}