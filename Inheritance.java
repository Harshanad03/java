class Vehicle{
   
    String brand,colour;
    int wheel,seats;
   
    void brake(){
        System.out.println("brake applied");
    }
    void accelator(){
        System.out.println("accelator applied");
    }
}

class car extends Vehicle{
    void airbag(){
        System.out.println("airbag available");
    }
    void ac(){
        System.out.println("ac available");
    }
}

public class Main{
    public static void main (String[] args) {
        car car_1 = new car();
        car_1.brand="bmw";
        car_1.colour="blue";
        car_1.wheel=4;
        car_1.seats=5;
        System.out.println(car_1.brand);
        System.out.println(car_1.colour);
        System.out.println(car_1.wheel);
        System.out.println(car_1.seats);
    }
}
