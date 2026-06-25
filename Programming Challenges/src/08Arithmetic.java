import java.util.Scanner;

class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("We will +,_,*,/,% your two number kindly give your two number below.\n");
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        int subtract = num1 - num2;
        int multiply = num1 * num2;
        int divide = num1 / num2;
        int modulus = num1 % num2;
        System.out.println("Sum of given number " + num1 + " + " + num2 + " = " +  sum);
        System.out.println("Subtract of given number " + num1 + " - " + num2 + " = " + subtract);
        System.out.println("Multiply of given number " + num1 + " * " + num2 + " = " +  multiply);
        System.out.println("Divide of given number " + num1 + " / " + num2 + " = " +  divide);
        System.out.println("Modulus of given number " + num1 + " % " + num2 + " = " +  modulus);
    }
}