package io;
import java.io.*;

/**
 * Created by apple on 13/06/17.
 */
public class FileOutputStreamEx2 {
    public static void main(String args[]){
        try{
            FileOutputStream fout=new FileOutputStream("testin.txt");
            String s="hi mehul.How r u?";
            byte b[]=s.getBytes();//converting string into byte array
            fout.write(b);
            fout.close();
            System.out.println("success...");
        }catch(Exception e){System.out.println(e);}
    }
}

