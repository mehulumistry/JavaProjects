package io;
import java.io.*;
/**
 * Created by apple on 13/06/17.
 * The input and output is in form of byte in stream and in reader writer it is in the form of int unicode
 */
public class BufferedInputStreamEx6 {
    public static void main(String args[]){
        try{
            FileInputStream fin=new FileInputStream("testout1.txt");
            BufferedInputStream bin=new BufferedInputStream(fin);
            int i;
            while((i=bin.read())!=-1){
                System.out.print((char)i);
            }
            bin.close();
            fin.close();
        }catch(Exception e){System.out.println(e);}
    }
}
