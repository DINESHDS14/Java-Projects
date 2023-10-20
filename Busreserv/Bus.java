package Busreserv;

public class Bus {
	private int busNo;
	private Boolean ac;
	private int capacity;
	
	Bus(int no, boolean ac, int cap){
		this.busNo = no;
		this.ac = ac;
		this.capacity = cap;
	}
	public int getBusNo() {    //accesser method
		return busNo;
	}
	public boolean isaAc() {   //accesser method
		return ac;
	}
	public int getCapacity() {  //accesser method
		return capacity;
	}
	public void setAc(boolean val) {  //mutator method
		ac = val;
	}
	public void setCapacity(int cap) {    //mutator method
		capacity = cap;
	}
	public void displayBusInfo() {
		System.out.println("Bus.no"+" "+busNo+"AC :"+" "+ac+"Total Capacity :"+" "+capacity);
	}
	
	
}
