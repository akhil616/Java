class commandAdd{
	int add(String[] ar){
		int sum = 0;
		for(int i = 0; i < ar.length; i++){
			int num = Integer.parseInt(ar[i]);
			sum += num;
			
		}
		return sum;
	}
}
public class Addition{
	public static void main(String [] args){
		String ar[] = args;
		commandAdd obj1 = new commandAdd();
		int sum = obj1.add(ar);
		System.out.println("Addition is: "+sum);
	}
}