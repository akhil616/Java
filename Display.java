class Room{
	int roomno, roomtype;
	float roomarea;
	boolean ACmachine;
	void setData(int roomno, int roomtype, float roomarea, boolean Acmachine) {
		this.roomno = roomno;
		this.roomtype = roomtype;
		this.roomarea = roomarea;
		this.ACmachine = Acmachine;
		
	}
	void displayData() {
		System.out.println("Room No: "+roomno);
		System.out.println("Room Type: BHK"+roomtype);
		System.out.println("Room Area: "+roomarea);
		System.out.println("Does it have AC: "+ACmachine);
	}
}
public class Display {

	public static void main(String[] args) {
		Room obj1 = new Room();
		obj1.setData(1, 3, (float) 345.2, false);
		obj1.displayData();

	}

}
