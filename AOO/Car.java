public class Car {
    
    String color;
    String model;

    Car(String color, String model){
        this.color = color;
        this.model = model;
    }

    void drive( ){
        System.out.println("You are driving a " + color + " " + model);
    }
}
