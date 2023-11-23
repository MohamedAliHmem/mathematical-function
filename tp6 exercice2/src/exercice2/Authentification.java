package exercice2;
import java.util.*;

public class Authentification {
	final private String LoginCorrect = "scott" ;
	final private String PwdCorrect = "tiger" ;
	
	String UserLogin ;
	String UserPwd ;
	
	Authentification() throws WrongInputLength,WrongLoginException,WrongPwdException{
		this.getUserLogin();
		this.getUserPwd();
	}
	
	
	void getUserLogin() throws WrongInputLength,WrongLoginException{
		Scanner sc = new Scanner(System.in);
		System.out.println("login : ");
		String log = sc.nextLine();
		if(log.length()>10) throw new WrongInputLength("login length is longer than 10");
		if(!log.equals(this.LoginCorrect)) throw new WrongLoginException("login isn't correct");
		
	}
	
	
	void getUserPwd() throws WrongPwdException,WrongInputLength{
		Scanner sc = new Scanner(System.in);
		System.out.println("Pwd : ");
		String pwd = sc.nextLine();
		if(pwd.length()>10) throw new WrongInputLength("Pwd length is longer than 10");
		if(!pwd.equals(this.PwdCorrect)) throw new WrongPwdException("pwd isn't correct");
	}
	
	
	
	public static void main(String[] args) {
		

	}

}
