package exception;

/**
 * Created by apple on 12/06/17.
 */
public class Ex3 {
    public static void main(String[] args) {

        try{
            int a[]=new int[5];
           // System.out.println(a[7]);
            a[5]=30/0;
        }
       //catch(Exception e){System.out.println("common task completed");}
        catch(ArithmeticException e){System.out.println("task1 is completed");}
        catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}
        System.out.println("rest of the code...");
    }
}
