public class main {
    public static void main(String[] args){

        car Car = new car();

        System.out.println(Car.brand);
        System.out.println(Car.model);
        System.out.println(Car.year);
        System.out.println(Car.color);
        System.out.println(Car.price);

        System.out.println(Car.isRunning);
        Car.start();
        System.out.println(Car.isRunning);
        Car.stop();
    }
    
}
