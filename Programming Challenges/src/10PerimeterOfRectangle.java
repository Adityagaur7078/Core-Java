import java.util.Scanner;

class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("We will calculate Perimeter of Rectangle.\n");

        System.out.print("Enter first side A = ");
        double A = input.nextDouble();

        System.out.print("Enter second side B = ");
        double B = input.nextDouble();

        System.out.print("Enter third side C = ");
        double C = input.nextDouble();

        System.out.print("Enter fourth side D = ");
        double D = input.nextDouble();

        double PerimeterOfRectangle = (A + B + C +D);

        System.out.println("Perimeter of Given ABCD side of Rectangle: " + PerimeterOfRectangle + "cm");
    }
}