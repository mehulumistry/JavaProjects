package io;
import  java.io.*;

/**
 * Created by apple on 13/06/17.
 */
public class FileOutputStreamEx1 {
    public static void main(String args[]){
        try{
            FileOutputStream fout=new FileOutputStream("testout.txt");
            fout.write(65);
            fout.close();
            System.out.println("success...");
        }catch(Exception e){System.out.println(e);}
    }
}
