class InvalidAge extends Exception {

	public InvalidAge(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}
	
}

class Age1 {
	boolean checkAge(int age) throws InvalidAge{
		if (age >= 18) {
			return true;
		}
		else
			throw new InvalidAge("You cannot Vote");
	}
}

public class UserDefinedException {

	public static void main(String[] args) {
		Age1 a1 = new Age1();
		try {
			a1.checkAge(8);
			System.out.println("You are eligible to vote");
		} catch (InvalidAge ia) {
			System.out.println(ia.toString());
		}
		System.out.println("Rest of the Code");
	}

}
