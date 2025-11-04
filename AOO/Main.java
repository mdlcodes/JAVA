public class Main {
    public static void main(String[] args) {
        
        Car car1 = new Car("Red", "Mustang");
        Car car2 = new Car("Black", "Tesla");
        Car car3 = new Car("Green", "Mustang");

        /*
        System.out.println(car1.color);
        System.out.println(car1.model);

        System.out.println(car2.color);
        System.out.println(car2.model);

        System.out.println(car3.color);
        System.out.println(car3.model);
         */
    
         Car[] cars = {car1, car2, car3};
        
         /*
         //normal for loop
         for(int i = 0; i < cars.length; i++){
            cars[i].drive();
            
         } */

         //Enhance Array Loop

         for(Car car : cars){
            car.drive();
         }
    
    }
}
