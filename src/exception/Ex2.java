package exception;

/**
 * Created by apple on 12/06/17.
 */

public class Ex2 {
   static int a[]={1,2,3,4,5};

    public static void main(String[] args) {
        System.out.println("hello");
        try {
            System.out.println(a[8]);
        }catch (ArithmeticException ae) {
            System.out.println("exception occur "+ae);
        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println("array index exception"+a);
        }
               finally {
            System.out.println("finally block");
        }

        System.out.println("end of the main");
    }
}

