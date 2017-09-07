package com.company.Inheritance;

/**
 * Created by apple on 31/05/17.
 * 1.to refer the super class method
 * 2.to refer the instance variable
 * 3.to refer the super class ctor
 * 2.
 */
class Animal1
{
    int id;
    Animal1()
    {
        System.out.println("Animal ctor");
        id=101;
    }
    void sound()
    {

        System.out.println("animal class");
    }
}
class Dog1 extends Animal1
{

   int id;
   Dog1()
    {
        //super();
        /*  constructor have inbuilt first keyword super() and class have inbuilt first block constructor */

        id=102;
        // error  super(); must be first stmt.
    }
    @Override
    void sound()
    {
        super.sound();
        System.out.println("Dog class"+id+"  "+super.id);
    }
}


public class SuperKeyword {
    public static void main(String[] args) {
        Dog1 d=new Dog1();
        d.sound();

    }
}
