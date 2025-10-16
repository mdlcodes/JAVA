import java.util.Scanner;

public class ShapeArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the shape (square, circle, triangle, trapezoid):");
        String shape = sc.next().toLowerCase(); // convert input to lowercase

        if (shape.equals("square")) {
            System.out.print("Enter side length: ");
            double side = sc.nextDouble();
            System.out.printf("Area of Square: %.4f\n", AREA(side));

        } else if (shape.equals("circle")) {
            System.out.print("Enter radius: ");
            double radius = sc.nextDouble();
            System.out.printf("Area of Circle: %.4f\n", AREA(radius));

        } else if (shape.equals("triangle")) {
            System.out.print("Enter base: ");
            double base = sc.nextDouble();
            System.out.print("Enter height: ");
            double height = sc.nextDouble();
            System.out.printf("Area of Triangle: %.4f\n", AREA(base, height));

        } else if (shape.equals("trapezoid")) {
            System.out.print("Enter base1: ");
            double b1 = sc.nextDouble();
            System.out.print("Enter base2: ");
            double b2 = sc.nextDouble();
            System.out.print("Enter height: ");
            double h = sc.nextDouble();
            System.out.printf("Area of Trapezoid: %.4f\n", AREA(b1, b2, h));

        } else {
            System.out.println("Invalid shape!");
        }

        sc.close();
    }

    // Overloaded AREA methods
    public static double AREA(double side) {
        return side * side;
    }

    public static double AREA(double radius) {
        return Math.PI * radius * radius;
    }

    public static double AREA(double base, double height) {
        return 0.5 * base * height;
    }

    public static double AREA(double base1, double base2, double height) {
        return 0.5 * (base1 + base2) * height;
    }
}
