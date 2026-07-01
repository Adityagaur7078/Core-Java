import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number whose table you want: ");
        int num = scanner.nextInt();

        printMultiplicationTable(num);

        scanner.close();

    }

    public static void printMultiplicationTable(int num) {
        int i = 1;

        while (i <= 10) {
            if (i < 10) {
                System.out.println(num + " X 0" + i + " = " + (num * i));
            } else {
                System.out.println(num + " X " + i + " = " + (num * i));
            }
            i++;
        }
    }
}