
public class Metode {
	
	public static double sum(double[] n) {
		double sum = 0;
		for (int i = 0; i < n.length; i++) {
		    sum += n[i];
		}
		return sum;
	}
	
	public static double average(double[] n) {
		double sum = 0;
		for (int i = 0; i < n.length; i++) {
		    sum += n[i];
		}
		return sum/n.length;
	}

}
