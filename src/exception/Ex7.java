package exception;

import java.io.IOException;

/**
 * Created by apple on 12/06/17.
 * If we want to use throws keyword in parent then it is necessary to write throws keyword in evey child or handle it in child using try and catch
 */
public class Ex7 {
    void m()throws IOException{
        throw new java.io.IOException("device error");//checked exception
    }
    void n()throws IOException{
        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e){System.out.println("exception handeled");}
    }

    public static void main(String args[]){
        Ex7 obj=new Ex7();
        obj.p();
        System.out.println("normal flow");
    }
}
