import java.util.Scanner;

class swap{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Swapping station");
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("Swapping done...");
        System.out.println("Value of first number is: " + num1);
        System.out.println("Value of second number is: " + num2);
    }
}
