package exception;

/**
 * Created by apple on 12/06/17.
 */
public class Ex5 {
    static void validate(int age){
        if(age<18)
           throw  new ArithmeticException("exception occur");
        else
            System.out.println("welcome to vote");
    }

    public static void main(String args[]){
        validate(23);
        System.out.println("rest of the code...");
    }
}
