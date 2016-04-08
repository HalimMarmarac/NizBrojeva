
public class Metode {
	
	public static double sum(double[] n) {
		double max = n[0];
		for (int i = 1; i < n.length; i++) {
		    if (n[i] > max) max = n[i];
		}
		return max;
	}

}
