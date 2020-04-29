// Base interface
interface Vehicle {
    void specification();
}

class PetrolCar implements Vehicle {

    @Override
    public void specification() {
        System.out.println("Petrol Car");
    }
    
}

class PetrolBike implements Vehicle {

    @Override
    public void specification() {
        System.out.println("Petrol Bike");
    }
    
}

class DieselCar implements Vehicle {

    @Override
    public void specification() {
        System.out.println("Diesel Car");
    }
    
}

class DieselBike implements Vehicle {

    @Override
    public void specification() {
        System.out.println("Diesel Bike");
    }
    
}

//Factory interface
interface ShowRoom {
    Vehicle getVehicle(String vehicleType);
}

//It returns the specific class object in a petrol factory
class PetrolFactory implements ShowRoom {

    @Override
    public Vehicle getVehicle(String vehicleType) {
        
        switch (vehicleType.toLowerCase()) {
            case "car" : return new PetrolCar();
             
            case "bike" : return new PetrolBike();
                
            default : return null;
        }
    }
    
}

//It returns the specific class object in a diesel factory
class DieselFactory implements ShowRoom {

    @Override
    public Vehicle getVehicle(String vehicleType) {
        switch (vehicleType.toLowerCase()) {
            case "car" : return new DieselCar();
             
            case "bike" : return new DieselBike();
                
            default : return null;
        }
    }
    
}

//It returns specific factory object
class ShowRoomFactory {
    
    public static ShowRoom getFactory(String factoryType) {
         switch (factoryType.toLowerCase()) {
            case "petrol" : return new PetrolFactory();
             
            case "diesel" : return new DieselFactory();
                
            default : return null;
        }
    } 
}

public class AbstractFactory {

    
    public static void main(String[] args) {
        
        //Create the DieselBike for testing
        String factoryType = new String("Diesel");
        String vehicleType = new String("Bike");
        
        Vehicle vehicleObj = (ShowRoomFactory.getFactory(factoryType)).getVehicle(vehicleType);
        # (OR)
        ShowRoom showObj = ShowRoomFactory.getFactory(factoryType);
        Vehicle vehicleObj = showObj.getVehicle(vehicleType);
        
        vehicleObj.specification();
    }
    
}
