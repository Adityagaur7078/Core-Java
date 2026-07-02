import java.util.Scanner;

class LCM
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Take first number

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        // Take second number

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        // Call method

        findLCM(num1, num2);

        input.close();
    }

    // Method to find LCM

    public static void findLCM(int num1, int num2)
    {
        // Start from the greater number

        int lcm = (num1 > num2) ? num1 : num2;

        // Repeat until LCM is found

        while(true)
        {
            // Check whether current number is divisible by both numbers

            if(lcm % num1 == 0 && lcm % num2 == 0)
            {
                System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
                break;
            }

            // Check next number

            lcm++;
        }
    }
}