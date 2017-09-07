package exception;

/**
 * Created by apple on 12/06/17.
 * creation of custom class
 */
class InvalidAgeException extends Exception{
    InvalidAgeException(String s){
        super(s);
    }
}

public class Ex9 {
    static void validate(int age)throws InvalidAgeException{
        if(age<18)
            throw new InvalidAgeException("not valid");
        else
            System.out.println("welcome to vote");
    }

    public static void main(String args[]){
        try{
            validate(13);
        }catch(InvalidAgeException m){System.out.println("Exception occured: "+m);}

        System.out.println("rest of the code...");
    }

}
