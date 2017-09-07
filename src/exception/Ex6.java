package exception;

/**
 * Created by apple on 12/06/17.
 *
 * Chaining is not possible in Checked Exception
 * So use throws keyword to perform chaining in Checked one. and it is used with method
 * throw is used with class its new object is created.
 *
 * In Run Time Exception Function chaining is possible
 */
public class Ex6 {
    void m(){
        int data=50/0;
    }
    void n(){
        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e){System.out.println("exception handled");}
    }
    public static void main(String args[]){
        Ex6 obj=new Ex6();
        obj.p();
        System.out.println("normal flow...");
    }
}
