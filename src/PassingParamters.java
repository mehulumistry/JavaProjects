import java.awt.*;

/**
 * Created by apple on 27/05/17.
 */
public class PassingParamters {

public  static  void main(String args[])
{


    First f=new First();
    f.add(10,20);//actual parametrs
    int res=f.sub(20,15);
    System.out.println(res);
    System.out.println(f.sub(10,5));

}

}
class First {
    void add(int a, int b) {//formal parameters
        int c = a + b;
        System.out.println(c);
    }
    int sub(int x,int y)
    {
        int c=x-y;
        return c;
    }
}