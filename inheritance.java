class AC {
	String company;
	String model;
	Float capacity;
	
	public AC(String company, String model, Float capacity) {
		this.company = company;
		this.model = model;
		this.capacity = capacity;
  }
	
	public String getDisplay() {
		return "AC [company = " + company + ", model = " + model + ", capacity = " + capacity + "]";
	}
}

class SmartAC extends AC{
	boolean wifi;
	boolean iotEnabled;
	public SmartAC(String company, String model, Float capacity, boolean wifi, boolean iotEnabled) {
		super(company, model, capacity);
		this.wifi = wifi;
		this.iotEnabled = iotEnabled;
		
	}
	
	public String getACInfo() {
		return "SmartAC [wifi = " + wifi + ", iotEnabled = " + iotEnabled + ", company = " + company + ", model = " + model
				+ ", capacity = " + capacity + "]";
	}
	
}
public class InheritanceEx {

	public static void main(String[] args) {
		AC a1 = new AC("LG", "2023", 1.5f);
		System.out.println(a1.getDisplay());
		SmartAC a2 = new SmartAC("LG", "2023", 1.5f, true, false);
		System.out.println(a2.getACInfo());
	}
}
