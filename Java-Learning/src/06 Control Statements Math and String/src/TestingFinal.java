public class TestingFinal {

    final double PI = 3.1412;

    public static void main(String[] args) {
        TestingFinal obj = new TestingFinal();
        System.out.println(obj.PI);   // Prints 3.1412

        // obj.PI = 3.14;   // Compile-time error
    }
}