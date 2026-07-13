package com.adityagaur.learning.equals;

public class EqualsAndHashCodeTest {
    public static void main(String[] args) {
        int age = 31;
        Person person1 = new Person("Hitesh", 32, "001");
        Person person2 = new Person("Hitesh", 30, "001");

        if (person1.equals(person2)) {
            System.out.println("Equals");
        } else {
            System.out.println("Not equal");
        }
    }
}
