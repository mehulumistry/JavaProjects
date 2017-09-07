package com.company.Inheritance;
import com.company.*;

/**
 * Created by apple on 02/06/17.
 * hiding the details  0 to 100% security
 *
 * in abstract only body of method is not allowed
 * printf();//to display output on the screen
 *
 *
 */


abstract class Demo
{

        int i;
        static int j;
        final int k = 10;
        static final int l = 30;

         Demo()
         {
             System.out.println("this is an abstract ctor ");
         }

        abstract void show();//incomplete method  //so make abstract only when you want to make some changes in the method in future.

        void msg() {
            System.out.println("this is non abstract");
        }

        static void display() {
            System.out.println("this is static method ");
        }


}
class Abc extends Demo
{

    @Override
    void show() {
        System.out.println("this is an abstract method"+i+"  "+j+"  "+k+"  "+l);
    }
}
public class DataAbstraction {
    public static void main(String[] args) {
       // Demo d=new Demo(); can't be instantiated bcs demo is an abstract
        Abc obj;
        obj=new Abc();
        obj.show();
        obj.msg();
        Demo.display();
    }
}
