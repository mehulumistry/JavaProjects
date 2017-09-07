package exception;

/**
 * Created by apple on 12/06/17.
 *
 * Checked Exception are exceptions which occur during Compile time
 * Eg IO , SQL
 *
 */
public class Ex1 {
    public static void main(String[] args) {
        int a=10,b=0;
        try{
            int c=a/b;
            System.out.println("division "+c);
        }catch (ArithmeticException e)
        {
            System.out.println("exception occur"+e);
        }finally {
            System.out.println("this block is always executed ");
        }

        System.out.println("end of thr main");
    }
}
