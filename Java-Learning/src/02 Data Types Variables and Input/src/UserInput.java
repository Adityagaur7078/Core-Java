import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("Happy Birthday to you " + name);
        System.out.print(name + ", Also enter your age: ");
        int age = input.nextInt();
        System.out.println(name + " age is " + age);
    }
}