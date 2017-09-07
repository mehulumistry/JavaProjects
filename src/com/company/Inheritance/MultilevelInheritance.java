package com.company.Inheritance;

/**
 * Created by apple on 31/05/17.
 *
 * in inheritance parent constructor will run first
 *
 */
class A
{
    A()
    {
        System.out.println("a class ctor");
    }
    void show()
    {
        System.out.println("a class method");
    }
}
class B extends  A
{
    B()
    {
        System.out.println("b class ctor");
    }
    void display()
    {
        System.out.println("b class method");
    }
}class C extends B
{
    C()
    {
        System.out.println("c class ctor");
    }
    void msg()
    {
        System.out.println("c class method");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        C obj=new C();
        obj.show();obj.display();obj.msg();
    }
}
