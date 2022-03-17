package carte;

public class CarteUtilizator {

	public static void main(String[] args) {
		
		Carte c1= new Carte(15);
		Carte c2= new Carte(16);
		Carte c3= new Carte (15);
		
		if(c1.equals(c2))
			System.out.println("Cartile sunt identice");
		else
			System.out.println("Cartile nu sunt identice");
		
		System.out.println(c1);
		System.out.println(c3);
		
		
		
		if(c1.equals(c3))
			System.out.println("Cartile sunt identice");
		else
			System.out.println("Cartile nu sunt identice");
		

	}

}
