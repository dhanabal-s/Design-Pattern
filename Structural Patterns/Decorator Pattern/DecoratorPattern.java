
interface Pizza {
    public int price = 100;
    public void changePrice(int newPrice);
    public int cost();
    public String description();
}

// Pizza classes
class VegPizza implements Pizza {

    int price = 95;
    
    @Override
    public int cost() {
        return price;
    }

    @Override
    public String description() {
        return "Veg Pizza";
    }

    @Override
    public void changePrice(int newPrice) {
        price = newPrice;
    }
    
}

class ChickenPizza implements Pizza {

    int price = 150;
    @Override
    public void changePrice(int newPrice) {
        price = newPrice;
    }
    
    @Override
    public int cost() {
        return price;
    }

    @Override
    public String description() {
        return "Chicken Pizza";
    }
    
}

 abstract class Decorator implements Pizza {

    public abstract int cost();

    public abstract String description();
    
}
// Topping Classes
// Cheese Class
class Cheese extends Decorator {
    Pizza pizza;
    Cheese(){
        
    }
    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }
    
    static int price = 30;
    @Override
    public void changePrice(int newPrice) {
        price = newPrice;
    }
    @Override
    public int cost() {
        return price+pizza.cost();
    }

    @Override
    public String description() {
        return pizza.description()+" with Cheese";
    }

    
}


// Onion Topping Class 
class Onion extends Decorator {

    Pizza pizza;
    public Onion(Pizza pizza) {
        this.pizza = pizza;
    }
    static int price = 20;

    Onion() {
    }
    @Override
    public void changePrice(int newPrice) {
        price = newPrice;
    }
    @Override
    public int cost() {
        return price+pizza.cost();
    }

    @Override
    public String description() {
        return pizza.description()+" with Onion";
    }
    
}


// Client or Test Class
public class DecoratorPattern {

    
    public static void main(String[] args) {
        
        Pizza vegPizza = new VegPizza();
        vegPizza = new Cheese(vegPizza);
        vegPizza = new Onion(vegPizza);
        System.out.println(vegPizza.description()+" Cost is :"+vegPizza.cost());
        
        // Change Onion price 
        
        new Onion().changePrice(30);
        System.out.println(vegPizza.description()+" Cost is :"+vegPizza.cost());

    }
    
}

