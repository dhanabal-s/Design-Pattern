
public class PrototypePattern {

    public static void main(String[] args) throws CloneNotSupportedException {
        //Creating cloner class for cloning
        Cloner cloner = new Cloner();
        
        //Cloning the Object from call the clone method
        Fighter fighter = (Fighter)cloner.clone();
        //clone 2nd fighter
        Fighter fighter2 = (Fighter)cloner.clone();
        //change fighter looks
        fighter2.changeColor("Block");
        //just print the fighter charactor
        System.out.println(fighter.toString()+"\n"+fighter2.toString());
    }
    
}

class Fighter implements Cloneable {
    String color;
    String hairStyle;
    String shirt;
    // fighter other things
    Fighter (String color, String hairStyle, String shirt){
        this.color = color;
        this.hairStyle = hairStyle;
        this.shirt = shirt;
    }
    // change the fighter color
    public void changeColor(String color){
        this.color = color;
    }
    
    public void changeHairStyle(String hairStyle){
        this.hairStyle = hairStyle;
    }
    
    public void changeShirt(String shirt){
        this.shirt = shirt;
    }
    
    // method for clone the object
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Fighter{" + "color=" + color + ", hairStyle=" + hairStyle + ", shirt=" + shirt + '}';
    }
    
    
}

class Cloner {
    public static Fighter fighterObj;
    
    // Create the initial fighter with basic things
    static {
        fighterObj = new Fighter("White","Spikes","Coat");
    }
    // clone the fighter
    public Object clone() throws CloneNotSupportedException{
        return fighterObj.clone();
    }
}

