class Number {
	private double a;
	Number(double a){
		this.a = a;
	}
	
	boolean isZero() {
		return (a == 0);
	}
	
	boolean isPositive() {
		return (a > 0);
		
	}
	
	boolean isNegative() {
		return (a < 0);
	}

	boolean isOdd() {
		return (a % 2 != 0);
	}

	boolean isEven() {
		return (a % 2 == 0);
	}
	
//	boolean isPrime() {
//		
//	}
//	
//	boolean isArmstrong() {
//		
//	}
}
public class DisplayStatus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number n1 = new Number(5);
		System.out.println(n1.isOdd());

	}

}
