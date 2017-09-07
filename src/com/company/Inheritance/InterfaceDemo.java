package com.company.Inheritance;

/**
 * Created by apple on 02/06/17.
 * interface -is same as class
 * data-members and members functions
 * cannot create object of interface class
 *
 */
interface  MyInter
{
    static final int MAX=10;//bydefault interface variable is final  and static
    static int MIN=12;
   
default void moo()
{

    System.out.println("moo method");
}
     void show();// bydefault interface method is public and abstract
static  int cube(int x)
{
    return  x*x*x;
}

}
class Fruits implements MyInter
{


    @Override
    public void show() {
        System.out.println("this is fruit show  method "+MIN);
    }
}
class Vegetables implements MyInter
{

    @Override
    public void show() {
        System.out.println("this is vegetable show method"+MAX);
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
//        Fruits f=new Fruits();
//        f.show();
//        Vegetables v=new Vegetables();
//        v.show();
        MyInter m1=new Fruits();
        m1.show();
        m1.moo();
        MyInter m2=new Vegetables();
        m2.show();
        System.out.println(MyInter.MAX);
        System.out.println(MyInter.cube(6));

    }
}
