package com.company.Inheritance;

/**
 * Created by apple on 31/05/17.
 * Overiding-It is kind of run time polymorphism.
 * method having same name and same parameters
 *
 */
class Animal
{
    void sound()
    {
        System.out.println("animal class");
    }
}
class Dog extends Animal
{
    @Override
    void sound()
    {
        System.out.println("Dog class");
    }
}

public class MethodOveriding {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sound();
    }
}
