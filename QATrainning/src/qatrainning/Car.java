


public class Car extends Vehicle {
    
	private int noOfDoors;
	private String seatColour;
	
	public int getNoOfDoors() {
		return noOfDoors;
	}
	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}
	public String getSeatColour() {
		return seatColour;
	}
	public void setSeatColour(String seatColour) {
		this.seatColour = seatColour;
	}

   
        
        
	
	public Car (int id, String make, String colour, int yearOfMake, String vehicleType, int noOfDoors, String SeatColour)
        {
            super(id,make,colour,yearOfMake,vehicleType);
            this.noOfDoors = noOfDoors;
            this.seatColour = SeatColour;
            
        }

}
