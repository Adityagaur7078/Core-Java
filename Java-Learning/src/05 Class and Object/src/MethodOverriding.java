class Animal
{
    void makeSound()
    {
        System.out.println("Animal makes a sound");
    }

    void eat()
    {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal
{
    void makeSound()
    {
        System.out.println("Dog barks");
    }
}

public class MethodOverriding{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.eat();
    }
}

