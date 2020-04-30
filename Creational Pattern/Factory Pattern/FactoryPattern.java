# Client class
public class FactoryPattern {

  
    public static void main(String[] args) {
        
        // Select bus for testing
        String travelBy= new String("Bus");
        
        // Client get the object of specific travel class(bus, train,flight) by calling Factory class
        Travel travelObj = Factory.getInstance(travelBy);
        travelObj.book();
        
    }
    
}

// It returns the object of the specific class depends on the user request
class Factory {
    
    public static Travel getInstance(String travelBy) {
        
        switch (travelBy.toLowerCase()) {
            // If user choice is bus, it returns the BusTravel object
            case "bus": return new BusTravel();
           
            // If user choice is Train, it returns the TrainTravel object
            case "train": return new TrainTravel();
                
            // If user choice is Flight, it returns the FlightTravel object    
            case "flight": return new FlightTravel();
                
            // If user choice is undefined, it returns null
            default : return null;
        }
    }
}

// interface of travel site.
interface Travel {
    void book();
}

// implementing the bus travel class by overridding travel interface methods
class BusTravel implements Travel{

    @Override
    public void book() {
      System.out.println("Booked in Bus Travel");
    }
    
    // Other methods of bus travel
    
}

// implementing the train travel class by overridding travel interface methods
class TrainTravel implements Travel{

    @Override
    public void book() {
      System.out.println("Booked in Train Travel");
    }
    
    // Other methods of train travel
    
}

// implementing the flight travel class by overridding travel interface methods
class FlightTravel implements Travel{

    @Override
    public void book() {
      System.out.println("Booked in Flght Travel");
    }
    
    // Other methods of flight travel
    
}
