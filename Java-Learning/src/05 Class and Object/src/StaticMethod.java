class MathUtility{
    static double pi = 3.14159;
    static double calculateCircleArea(double radius) {
        return pi * radius * radius;
    }
}

public class StaticMethod{
    public static void main(String[] args) {
        System.out.println(MathUtility.calculateCircleArea(5));
        System.out.println(MathUtility.calculateCircleArea(10));
    }
}