package io;
import  java .io.*;
/**
 * Created by apple on 13/06/17.
 */
public class FileInputStreamEx3 {

    public static void main(String args[]){
        try{
            FileInputStream fin=new FileInputStream("testout.txt");
            int i=fin.read();
            System.out.print((char)i);

            fin.close();
        }catch(Exception e){System.out.println(e);}
    }
}
