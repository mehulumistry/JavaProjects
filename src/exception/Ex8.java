package exception;

import java.io.IOException;

/**
 * Created by apple on 12/06/17.
 */
class A
{
    void show()throws ArithmeticException
    {
        System.out.println("parent class method");
    }
}

public class Ex8 extends A {
    void show()throws ArithmeticException
    {
        int a = 6;
        int b = 0;

        System.out.println("child class method "+a/b);
    }

    public static void main(String[] args ) throws ArithmeticException{
        Ex8 e=new Ex8();
        e.show();
    }
}
