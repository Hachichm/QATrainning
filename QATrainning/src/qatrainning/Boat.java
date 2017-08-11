


public class Boat extends Vehicle {

	private int speed;
	private String boatName;

   
	public int getNumberOfEngines() {
		return speed;
	}
	public void setNumberOfEngines(int numberOfEngines) {
		this.speed = numberOfEngines;
	}
	public String getName() {
		return boatName;
	}
	public void setName(String name) {
		boatName = name;
	}
	 public Boat(int id,String make, String colour, int yearOfMake, String vehicleType, int speed, String boatName)
         {
            super(id,make, colour, yearOfMake, vehicleType);
            this.speed = speed;
            this.boatName = boatName;
         }
	
}

