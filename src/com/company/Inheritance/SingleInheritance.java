package com.company.Inheritance;

/**
 * Created by apple on 31/05/17.
 */
class First//parent
{
    First()
    {
        System.out.println("first class ctor");
    }
    void show()
    {
        System.out.println("First class show method");
    }
}
class Second extends  First//child
{
    Second()
    {
        System.out.println("second class ctor");
    }
    void display()
    {
        System.out.println("this is second class display method");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Second s=new Second();
        s.show();
        s.display();
    }
}
