import java.util.*;
class Great{
	int greater(int a, int b, int c) {
		if (a > b){
			if (a > c) {
				return a;
			}
			else
				return b;
		}else if(b > c) {
			return b;
		}
		else
			return c;
	}
}
public class Greatest{

	public static void main(String[] args) {
		Great obj1 = new Great();
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter 3 Numbers: ");
		int num1 = kb.nextInt();
		int num2 = kb.nextInt();
		int num3 = kb.nextInt();
		int greatest = obj1.greater(num1, num2, num3);
		System.out.println("Greatest Number is: "+greatest);
		

	}

}
