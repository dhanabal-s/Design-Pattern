// Dragon Interface
interface DragonInterface {
    void run();
    void fire();
}
public class Dragon implements DragonInterface{

    @Override
    public void run() {
        System.out.println("Run Run Run...");
    }

    @Override
    public void fire() {
        System.out.println("Fire.......");
    }
  
}

// Bird interface
interface BirdInterface {
    void fly();
}
// Bird class, which implements BirdInterface methods
public class Bird implements BirdInterface {

  @Override
    public void fly() {
        System.out.println("Fly Fly Fly......");
    }
    
}


// Adapter class, which have both Bird and Dragon class methods
class FlyingDragon implements DragonInterface  {
    BirdInterface flyingDragon;
    // Constructure of Flying Dragon
    FlyingDragon (BirdInterface obj){
        flyingDragon = obj;
    }

    @Override
    // Call's Bird's fly() methods of bird
    public void run() {
        flyingDragon.fly();
    }

    @Override
    // Call's Dragon's fire() method
    public void fire() {
        System.out.println("Flying dragon fires");
    }
    
}

// Client class
public class Client {
    
    public static void main(String[] args) {
        BirdInterface bird = new Bird();
        DragonInterface flyingDragon = new FlyingDragon(bird);
        DragonInterface dragon = new Dragon();
        flyingDragon.run();
        flyingDragon.fire();
        dragon.run();
        dragon.fire();
    }
    
}

