package Lab11;

import java.text.DecimalFormat;

public class Function2 extends Function{

	@Override
	public String answerString(double optVal, double x, double y, double z) {
		
		DecimalFormat decimal = new DecimalFormat("#,###.##");
		return "The ditance for the dog to reach the ball is " + decimal.format(optVal) +
				" in minimum time is " + decimal.format(x) + ".";
	}
	
	public String toString() {
		return "Minimum time that takes the dog to reach the ball on land and in the water.";
		
	}

	@Override
	public double fnValue(double x) {
		return (x/3) + (2 * Math.sqrt(Math.pow(x, 2) - 8 * x + 25));
	}

	
	@Override
	public double getXVal(double x) {
		return x;
	}

	@Override
	public double getYVal(double x) {
		return -1;
	}

	@Override
	public double getZVal(double x) {
		return -1;
	}

}
