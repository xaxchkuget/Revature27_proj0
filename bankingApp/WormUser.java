package bankingApp;

import java.io.Serializable;


public class WormUser implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String firstname=null;
	private String lastname=null;
	private String username=null;
	private String password=null;
	private String email=null;
	private String account=null;
	private String accountstatus=null;
	
	WormUser( String first, String last, String username, String password, String email, String account, String accountstatus){
		
		this.firstname=first;
		this.lastname=last;
		this.username=email;
		this.password=password;
		this.email=email;
		this.account=account;
		this.accountstatus=accountstatus;
		
	}
	
	
	public String toString(){
		return firstname+" "+lastname+" "+email+" "+password+" "+email+" "+account;
	}

	public String getfirstname() {
		return this.firstname;
	}

	public String getlastname() {
		return this.lastname;
	}
	public String getusername() {
		return this.username;
	}
	public String getpassword() {
		return this.password;
	}
	public String getemail() {
		return this.email;
	}
	public String getaccount() {
		return this.account;
	}
	public String getaccountstatus() {
		return this.accountstatus;
	}
}
