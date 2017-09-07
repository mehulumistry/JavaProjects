package io;
import java.io.*;
/**
 * Created by apple on 13/06/17.
 */
public class SequenceInputSteamEx8 {
    public static void main(String args[])throws Exception{
        FileInputStream fin1=new FileInputStream("testin.txt");
        FileInputStream fin2=new FileInputStream("testout.txt");
        FileOutputStream fout=new FileOutputStream("testout1.txt");
        SequenceInputStream sis=new SequenceInputStream(fin1,fin2);
        int i;
        while((i=sis.read())!=-1)
        {
            fout.write(i);
        }
        sis.close();
        fout.close();
        fin1.close();
        fin2.close();
        System.out.println("Success..");
    }
}
