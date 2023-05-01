interface Sum{
	void add(int num1, int num2);//public abstract
	void display();
	double PI=3.14;  //public, static, final
}
interface Sub extends Sum{
	void Subtract(int num1, int num2);
}
class SumImp implements Sub, Sum{

	@Override
	public void add(int num1, int num2) {
		System.out.println("Addition: "+(num1+num2));
  }

	@Override
	public void display() {
		
	}

	@Override
	public void Subtract(int num1, int num2) {
		System.out.println("Subtraction: "+(num1 - num2));
	}
	
}
public class MultipleIn {

	public static void main(String[] args) {
		System.out.println(Sum.PI);
          SumImp s1=new SumImp();
          s1.add(12,34);
          Sum s2=new SumImp();
          s2.add(23,56);
          s1.Subtract(90,70);
          Sub s3 = new SumImp();
          s3.Subtract(20,10);          
	}
}
