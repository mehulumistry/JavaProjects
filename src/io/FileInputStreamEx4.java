package io;


import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by apple on 13/06/17.
 */
public class FileInputStreamEx4 {
    public static void main(String[] args) {
        try{
            FileInputStream fin=new FileInputStream("testout.txt");
            int i=0;
            while((i=fin.read())!=-1){
                System.out.print((char)i);
            }
           fin.close();
        }catch(Exception e){System.out.println(e);}
    }

}
