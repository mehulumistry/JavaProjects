package Arrays;

/**
 * Created by apple on 05/06/17.
 */
public class ArrayDemo  {
    void div()
    {
        int a=10,b=0,c;
        try {
            c=a/b;
            System.out.println(c);
        }catch (Exception e)
        {
            System.out.println("division by zero "+e);
        }
        System.out.println("end of successfully");

    }

    public static void main(String[] args) {
        ArrayDemo obj=new ArrayDemo();
        obj.div();
    }
}
