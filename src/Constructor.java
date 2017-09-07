import java.awt.*;

/**
 * Created by apple on 29/05/17.
 *
 * Constructor -is used to intialize the values of class variables .
 * It is special kind of member function .
 * 1.ctor name is same as class name .
 * 2.It automatically calls when u will create an object of that class
 * and it allocates the memory by new keyword .
 * Types of ctor
 * 1.default ctor
 * 2.parameterised  ctor
 *
 *
 * make constructor when ever u want to intialize variablg
 * Checking is done during compiler time (Constructor Overloading)
 */
class Example
{
    int a,b;

    Example()
    {
        System.out.print("default ctor ");
        a=10;
        b=20;
    }

    Example(int x,int y)
    {
        System.out.print("default ctor ");
      a=x;
      b =y;
    }
    void show()
    {
        System.out.println(a+"  "+b);
    }

}
public class Constructor {
    public static void main(String[] args) {
        Example e=new Example();
        e.show();
        Example e1=new Example(11,12);
        e1.show();

    }

}
