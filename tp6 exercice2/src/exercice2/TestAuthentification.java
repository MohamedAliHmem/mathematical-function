package exercice2;
//import java.io.IOException;

public class TestAuthentification {

	 public static void main(String [] args) {
		 
		 
		 boolean error;
		do {
			 error = false;
		 try {
			 Authentification a = new Authentification();
		 }
		 catch(WrongInputLength e) {
			 System.out.println(e.getMessage());
			 error = true ;
		 }
		 catch(WrongLoginException e) {
			 System.out.println(e.getMessage());
			 error = true ;
		 }
		 catch(WrongPwdException e) {
			 System.out.println(e.getMessage());
			 error = true ;
		 }
		 }while(error);
		 
		 System.out.println("congratulations");
		 
		 
		 
	 }
}
