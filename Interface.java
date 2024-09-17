import java.io.*;

interface Vehicle {
    
    void Gear(int a);
    void speed(int a);
    void Brakes(int a);
}

class Bicycle implements Vehicle{
    
    int speed;
    int gear;
    
    public void Gear(int newGear){
        
        gear = newGear;
    }
    
    public void speed(int increment){
        
        speed = speed + increment;
    }
    
    public void Brakes(int decrement){
        
        speed = speed - decrement;
    }
    
    public void disp() {
        System.out.println("speed: " + speed
            + " gear: " + gear);
    }
}

class Bike implements Vehicle {
    
    int speed;
    int gear;
    
    public void Gear(int newGear){
        
        gear = newGear;
    }
    
    public void speed(int increment){
        
        speed = speed + increment;
    }
    
    public void Brakes(int decrement){
        
        speed = speed - decrement;
    }
    
    public void disp() {
        System.out.println("speed: " + speed
            + " gear: " + gear);
    }
    
}
class Interface {
    
    public static void main (String[] args) {
    
        Bicycle bicycle = new Bicycle();
        bicycle.Gear(2);
        bicycle.speed(3);
        bicycle.Brakes(1);
        
        System.out.println("Bicycle present state :");
        bicycle.disp();
        
        Bike bike = new Bike();
        bike.Gear(1);
        bike.speed(4);
        bike.Brakes(3);
        
        System.out.println("Bike present state :");
        bike.disp();
    }
}