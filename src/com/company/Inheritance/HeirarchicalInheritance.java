package com.company.Inheritance;

/**
 * Created by apple on 31/05/17.
 */
class  A1
{
    void show()
    {
        System.out.println("this is A class method");
    }
}
class B1 extends A1
{
    void show1()
    {
        System.out.println("this is B class method");
    }
}

class C1 extends A1
{
    void show2()
    {
        System.out.println("this is C class method");
    }
}
class D1 extends A1
{
    void show3()
    {
        System.out.println("this is B class method");
    }
}
public class HeirarchicalInheritance {
    public static void main(String[] args) {
        D1 d=new D1();

    }
}
