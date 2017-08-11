
import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Iterator;



public class Garage {
    

private ArrayList<Vehicle> garage = new ArrayList<>();
 

    public double calculateBill()
    {
        double total = 0;
        if(!garage.isEmpty()){
            for (Vehicle vehicle : garage){                
                total = total + getPrices(vehicle.getVehicleType());
            }        
        }
        return total;
   
    }
   
    public double getPrices(String vehicleType){
        double price = 0;
        switch(vehicleType){
            case "Car":
                price = 99.99;
                break;
            case "Motorcycle":
                price = 50.00;
                break;
            case "Boat":
                price = 85.00;
                break;
        }
        return price;
    }
   
    public void addCar(int id, String make, String colour, int yearOfMake, String vehicleType, int noOfDoors, String SeatColour)
    {
        Car car = new Car(id,make,colour,yearOfMake,vehicleType,noOfDoors,SeatColour);
        garage.add(car);
        //System.out.println("Hello!");
    }
    
     public void addMotorbike(int id,String make, String colour, int yearOfMake, String vehicleType, int noOfGears, int cc)
    {
        Motorcycle bike = new Motorcycle(id,make,colour,yearOfMake,vehicleType,noOfGears,cc);
        garage.add(bike);
        //System.out.println("Hello!");
    }
       public void addBoat(int id,String make, String colour, int yearOfMake, String vehicleType, int speed, String boatName)
    {
        Boat boat = new Boat(id,make,colour,yearOfMake,vehicleType,speed,boatName);
        garage.add(boat);
        //System.out.println("Hello!");
    }
    
    public void removeAll()
    {
        for (int i = 0; i < garage.size(); i++)
        {
            if (!garage.isEmpty())
            {
                garage.clear();
            }
        }
    }
    
    public void removeVehicleById(int id)
    {
      for (int i=0; i <garage.size(); i++)
        {
            if (garage.get(i).getId() == id){
                garage.remove(i);
            }
        }         
    }
   
    public void removeVehicleByName(String vehicleType)
    {
 
        for (int i=0; i <garage.size(); i++)
        {
            if (garage.get(i).getVehicleType().equals("Car")){
                garage.remove(i);
            }
                  
        }
    }
    
    
    public ArrayList<Vehicle> getGarage() {
        return garage;
    }

    public void setGarage(ArrayList<Vehicle> garage) {
        this.garage = garage;
    }

   
    
        public static void main (String [] args)
        {
   
        
        Garage g = new Garage();
        Car car = new Car (1, "Honda", "Red", 2010,"Car" , 5, "Cream");
        Boat boat = new Boat (2, "Audi", "Blue", 2015, "Boat", 215, "Boulevard");
        Motorcycle bike = new Motorcycle (3,"BMW", "Black", 2017,"Motorcycle", 6, 1000);
        
        g.getGarage().add(car);
        g.getGarage().add(boat);
        g.getGarage().add(bike); 
        g.addCar(4, "Vauxhall", "White", 2012, "Car" , 3, "Black");           
        g.addBoat(5, "Mercedes", "Gun Grey", 2009, "Boat", 89, "Sinker");
        g.addMotorbike(6, "Ducati", "Red", 2017, "Motorcycl", 7, 1198);
        
        //Un Comment the bottom for the methods created above to work

        //g.removeAll();
        
        //g.removeVehicleByName("Car");
        
        //g.removeVehicleById(6);
        
        g.calculateBill();
         
            for (Vehicle value: g.getGarage()){ 
                System.out.println(value);
            }        
        
        
       }

}
