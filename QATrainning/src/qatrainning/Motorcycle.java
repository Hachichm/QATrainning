


public class Motorcycle extends Vehicle{

	private int noOfGears; 
	private int cc;

   
	public int getNoOfGears() {
		return noOfGears;
	}
	public void setNoOfGears(int noOfGears) {
		this.noOfGears = noOfGears;
	}

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }
	
        
	public Motorcycle(int id,String make, String colour, int yearOfMake, String vehicleType, int noOfGears, int cc)
        {
           super(id, make, colour, yearOfMake, vehicleType);
           this.noOfGears = noOfGears;
           this.cc = cc;
         }
	
	
}
