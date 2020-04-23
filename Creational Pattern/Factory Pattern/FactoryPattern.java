// This is the client class
public class FactoryPattern {

  
    public static void main(String[] args) {
        
        // I just used bus for sample run
        String travelBy= new String("Bus");
        
        // Client get the object specific travel class by calling Factory class
        Travel travelObj = Factory.getInstance(travelBy);
        travelObj.book();
        
    }
    
}

// which returns the object of the specific class depends on the user request
class Factory {
    
    public static Travel getInstance(String travelBy) {
        
        switch (travelBy.toLowerCase()) {
            // if user choice bus it returns the BusTravel object
            case "bus": return new BusTravel();
           
            // if user choice is Train it returns the TrainTravel object
            case "train": return new TrainTravel();
                
            // if user choice is Flight it returns the FlightTravel object    
            case "flight": return new FlightTravel();
                
            // if user choice is undefined it returns null
            default : return null;
        }
    }
}

// interface of travel site.
interface Travel {
    void book();
}

// implemented the bus travel class by overridding travel interface methods
class BusTravel implements Travel{

    @Override
    public void book() {
      System.out.println("Booked in Bus Travel");
    }
    
    // other methods of bus travel
    
}

// implemented the train travel class by overridding travel interface methods
class TrainTravel implements Travel{

    @Override
    public void book() {
      System.out.println("Booked in Train Travel");
    }
    
    // other methods of train travel
    
}

// implemented the flight travel class by overridding travel interface methods
class FlightTravel implements Travel{

    @Override
    public void book() {
      System.out.println("Booked in Flght Travel");
    }
    
    // other methods of flight travel
    
}
