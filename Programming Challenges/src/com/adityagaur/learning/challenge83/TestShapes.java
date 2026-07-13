package com.adityagaur.learning.challenge83;

public class TestShapes {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        Square square = new Square(10.3);

        System.out.printf("Area of Circle is %f\n", circle.calculateArea());
        System.out.printf("Area of Square is %f\n", square.calculateArea());
    }
}
