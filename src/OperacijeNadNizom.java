import java.util.*;

public class OperacijeNadNizom {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// niz od 10 brojeva
		double[] n = new double[10];
		// popunjavanje niza
		System.out.println("***POPUNJAVANJE NIZA***");
		for(int i = 0; i < n.length; i++) {
			try {
				System.out.println("Unesite broj: ");
				n[i] = in.nextDouble();
				// niz prihvata samo brojeve
			} catch (InputMismatchException ex) {
				System.out.println("Samo brojevi!");
				in.nextLine();
				i--;
			}
		}
		
		// ispis rezultata
		Metode m = new Metode();
		System.out.println("\nZbir brojeva u nizu = " + m.sum(n));
		System.out.println("Prosjek brojeva u nizu = " + m.average(n));
		// ostale metode
		
		in.close();
	}

}
