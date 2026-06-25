public class ShortHandOperators {
    public static void main(String[] args) {
        int num = 10;

        num += 8;   // num = num + 8 → 18
        System.out.println("Assignment result: " + num);

        num -= 2;   // num = num - 2 → 16
        System.out.println("Assignment result: " + num);

        num *= 2;   // num = num * 2 → 32
        System.out.println("Assignment result: " + num);

        num /= 4;   // num = num / 4 → 8
        System.out.println("Assignment result: " + num);

        num %= 3;   // num = num % 3 → 2
        System.out.println("Assignment result: " + num);
    }
}