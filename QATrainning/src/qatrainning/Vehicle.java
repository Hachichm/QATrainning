


public  class Vehicle {
	
        private int id;
	private String make;
	private String colour;
	private int yearOfMake;
        private String vehicleType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "id=" + id + ", make=" + make + ", colour=" + colour + ", yearOfMake=" + yearOfMake + ", vehicleType=" + vehicleType + '}';
    }

    

    

 
 
        
    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getYearOfMake() {
		return yearOfMake;
	}
	public void setYearOfMake(int yearOfMake) {
		this.yearOfMake = yearOfMake;
	}
	
	public Vehicle(int id, String make,String colour,int yearOfMake,String vehicleType)
        {
            this.id = id;
            this.make = make;
            this.colour = colour;
            this.yearOfMake = yearOfMake;
            this.vehicleType = vehicleType;
            
        }
}
