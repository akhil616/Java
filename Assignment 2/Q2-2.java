abstract class Display{
	abstract void message();
	void printMessage() {
		System.out.println("This is normal method");
	}
}

class Message extends Display{
	@Override
	void message() {
	   System.out.println("This is message child class");	
	}
}

public class AbstractionEx {
  public static void main(String[] args) {
          Display d1 =new Message();
          d1.message();
	}
}
