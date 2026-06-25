import java.util.Scanner;

class FloatMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("We will give product of your two floating points number number kindly give your two number below.\n");

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        double Product = num1 * num2;

        System.out.println("Product of given number " + num1 + " * " + num2 + " = " +  Product);
    }
}