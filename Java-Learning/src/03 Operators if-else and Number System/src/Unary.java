public class Unary {
    public static void main(String[] args) {
        int x = 5;
        int y = -x;
        int z = -y;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        System.out.println("Watching Increment...");
        int n = 5;

        System.out.println("Post Increment: " + (n++)); // first use → 5, then becomes 6
        System.out.println("After Post Increment: " + n); // 6

        System.out.println("Pre Increment: " + (++n)); // first increase → 7

        System.out.println("Post Decrement: " + (n--)); // 7 then becomes 6
        System.out.println("After Post Decrement: " + n); // 6

        System.out.println("Pre Decrement: " + (--n)); // becomes 5
    }
}