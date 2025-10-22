public class car {
    
    String brand = "Jeep Wrangler";
    String model = "Sahara";
    String color = "Black";
    int year = 2025;
    double price = 3000345.99;
    boolean isRunning = false;

    void start()
    {
        isRunning = true;
        System.out.println("Your engine is running");
    }

    void stop(){
        isRunning = false;
        System.out.println("Your engine stopped running");
    }
}
