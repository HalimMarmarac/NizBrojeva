import java.util.HashSet;

public class Metode {
	// suma brojeva u nizu
	public double sum(double[] n) {
		double sum = 0;
		for (int i = 0; i < n.length; i++) {
		    sum += n[i];
		}
		return sum;
	}
	// prosjek brojeva u nizu
	public double average(double[] n) {
		double sum = 0;
		for (int i = 0; i < n.length; i++) {
		    sum += n[i];
		}
		return sum/n.length;
	}
	
	//util Arrays sort zato sto sam lijen ko top
	public double [] sortiraj (double [] niz )
	{
		 java.util.Arrays.sort(niz);
		 return niz;
	}
	
	/**
	 * Napravi novi niz koji sadrzi unikatne brojeve
	 * eto ovaj sam malo zakomplikovo :D
	 */
	public double [] unikatanNiz (double [] niz)
	{
		double tempNiz[] = new double [niz.length];
		
		//brojUnik broji unikatne brojeve
		int brojUnik = 0;
		//unesit u temp unikatne brojeve a na mjestima gdje se brojevi ponavljaju ostane default vrijednost 0.0
		for (int i = 0; i < niz.length; i++) {
			boolean nijeUnikat = false;
			for (int j = 0; j < tempNiz.length; j++) {
			
				if(niz[i] == tempNiz[j]){
					nijeUnikat = true;
					break;
					
				}
			}
			
			if(!nijeUnikat){
				brojUnik++;
				tempNiz[i] = niz[i];
			}
		}
		//napravi novi niz za unikatne brojeve
		double unikatanNiz[] = new double[brojUnik];
		int brojac = 0;
		//stavi unikatne brojeve u niz 
		for (int i = 0; i < tempNiz.length ; i++) {
			if(tempNiz[i] > 0){
				unikatanNiz[brojac] = tempNiz[i];
				brojac++;
			}
		}
		//vrati niz brojeva
		return unikatanNiz;
		
	}
	
	//Ja sam još ljenji
	
	
	public double najmanjiBroj(double[] niz){
		niz = sortiraj(niz);
		return(niz[0]);
	}

}
