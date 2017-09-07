package MultiThreading;

/**
 * Created by apple on 16/06/17.
 */
public class ThreadClass extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {


            System.out.println(i+"   "+getName());

        }
    }
    public static void main(String[] args) {
        ThreadClass t1=new ThreadClass();
        ThreadClass t2=new ThreadClass();
        ThreadClass t3=new ThreadClass();
        t1.start();
        t2.start();
//        t1.start();  error illegal thread exception
try {
    t1.join(2000);
}catch (Exception e)
{
    System.out.println("exception occur");
}

        t3.start();
    }
}
