import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = input.nextInt();

        factorial(num);
        input.close();
    }

    public static long factorial(int num) {
        long i = 1;
        long fact = 1;

        while (i <= num) {
            fact = fact * i;
            i++;
        }

        System.out.println("Factorial of " + num + " is: " + fact);
        return fact;
    }
}