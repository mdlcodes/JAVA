import java.util.Scanner;

public class LANDICHO_LAB3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
		double side, radius, height, base, b1,b2, h;
		System.out.println("*********************");
		System.out.println("GET YOUR SHAPES AREA");
		System.out.println("*********************");
		
        System.out.println("Enter the shape to calculate the Area (Square/Circle/Triangle/Trapezoid): ");
        String choice = sc.next().toLowerCase();

        switch(choice) {
            case "square":
                System.out.println("*******************************");
                System.out.println("CALCULATING THE AREA OF SQUARE");
                System.out.println("*******************************");
                System.out.print("Enter the length of side: ");
                side = sc.nextDouble();
                if(side <= 0){
                    System.out.println("The length of the square cannot be zero or negative");
                } else {
                    System.out.printf("The area of the square is %.4f\n", AREA(side, choice));
                }
             break;

            case "circle":
                System.out.println("*******************************");
                System.out.println("CALCULATING THE AREA OF CIRCLE");
                System.out.println("*******************************");
                System.out.print("Enter the radius: ");
             radius = sc.nextDouble();
                if(radius <= 0){
                    System.out.println("The radius cannot be zero or negative");
                } else {
                    System.out.printf("The area of the circle is %.4f\n", AREA(radius, choice));
                }
            break;


            case "triangle":
                System.out.println("*******************************");
                System.out.println("CALCULATING THE AREA OF TRIANGLE");
                System.out.println("*******************************");
                System.out.print("Enter the base: ");
                 base = sc.nextDouble();
                System.out.print("Enter the height: ");
                height = sc.nextDouble();
                if(base <= 0 || height <= 0){
                    System.out.println("Base and height must be positive");
                } else {
                    System.out.printf("The area of the triangle is %.4f\n", AREA(base, height, choice));
                }
			break;
                
            case "trapezoid":
                System.out.println("*******************************");
                System.out.println("CALCULATING THE AREA OF TRAPEZOID");
                System.out.println("*******************************");
                System.out.print("Enter the first base: ");
                b1 = sc.nextDouble();
                System.out.print("Enter the second base: ");
                b2 = sc.nextDouble();
                System.out.print("Enter the height: ");
                h = sc.nextDouble();
                if(b1 <= 0 || b2 <= 0 || h <= 0){
                    System.out.println("Base and height must be positive");
                } else {
                    System.out.printf("The area of trapezoid is %.4f\n", AREA(b1, b2, h, choice));
                }
				break;

            default:
                System.out.println("INVALID SHAPE!");
        }

        sc.close();
    }


     static double AREA(double input, String shape) {
        if(shape.equals("square")) {
            return input * input;
        } else if(shape.equals("circle")) {
            return Math.PI * input * input;
        } else {
            return 0;
        }
    }

     static double AREA(double base, double height, String shape) {
        if(shape.equals("triangle")) {
            return 0.5 * base * height;
        } else {
            return 0;
        }
    }


     static double AREA(double base1, double base2, double height, String shape) {
        if(shape.equals("trapezoid")) {
            return 0.5 * (base1 + base2) * height;
        } else {
            return 0;
        }
    }
}
