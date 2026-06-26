import java.util.Scanner;

public class RelationalOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Check here you are eligible for driving licence? \n");
        System.out.println("Enter your age: ");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible for driving licence.");
        } else {
            System.out.println("You are not eligible for driving licence. Abhi Cycle Chalao");
        }
    }
}