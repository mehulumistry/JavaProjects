package com.company.Inheritance;

/**
 * Created by apple on 31/05/17.
 */
//error bcs inherting class is final
// final class A2
class A2
{
    protected int i;
    final void show()
    {
        System.out.println("a class ");
    }

}
class B2 extends A2
{
    /*error bcs over-ridden method is final
    void show()
    {
        System.out.println("b class ");
    }*/
    void show1()
    {
        System.out.println("b class "+i);
    }

}
public class FinalMethod {
    public static void main(String[] args) {

    }
}
