package io;
import java.io.*;



/**
 * Created by apple on 13/06/17.
 */
public class BufferedOutputStreamEx5 {
    public static void main(String[] args) {
        BufferedOutputStream bout;
        FileOutputStream fout;
        try{
//             fout=new FileOutputStream("testout.txt");
//             bout=new BufferedOutputStream(fout);
            bout=new BufferedOutputStream(new FileOutputStream("testout.txt"));
            String s="Welcome to javaTpoint.ihgjjgkugkjbjgv";
            byte b[]=s.getBytes();
            bout.write(b);bout.flush();

            bout.close();

        }catch (Exception e)
        {
            System.out.println("exception occur");
        }

        System.out.println("success");
    }
}
