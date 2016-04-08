
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

}
