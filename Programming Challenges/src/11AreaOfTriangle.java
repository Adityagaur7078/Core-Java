import java.util.Scanner;

class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("We will calculate Area of Triangle.\n");

        System.out.print("Enter breath of triangle = ");
        double b = input.nextDouble();

        System.out.print("Enter height of triangle = ");
        double h = input.nextDouble();

        double AreaOfTriangle = 0.5 * b * h;

        System.out.println("Area of triangle is: " + AreaOfTriangle + "cm2");
    }
}