package tp6;

public class Mathematique {
	
	static double f(double x, double n) throws NullParametreException,NegatifException {
		if (n==0) {
			throw new NullParametreException("n = 0!!!!!!");
		}
		if (x == -3) {
			throw new NegatifException("-3 est négatif : on ne peut pas calculer une racine pour un réel négatif !!!!!!");
		}
		return Math.sqrt(x)/n ;
	}

	public static void main(String[] args) {
		double x = 0;
		double n = 0;
		try {
		x = Double.parseDouble(args[0]);
		n = Double.parseDouble(args[1]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("Vous devriez entrer deux nombres sur la ligne de commande pour que ça fonctionne");
		}
		catch(NumberFormatException e){
			System.out.println(e.getMessage());
			System.out.println("Les arguments doivent être des nombres");
		}
		
		
		
		try {
		System.out.println(Mathematique.f(x, n));
		}
		catch (NullParametreException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(NegatifException e) {
			System.out.println(e.getMessage());
		}

	}


}
