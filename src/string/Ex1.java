package string;

/**
 * Created by apple on 08/06/17.
 *
 * String-collection of characters /array of characters
 * char ch[10]={'a','m','i','t'};
 *
 * String datatype -is a class.
 *
 * 1.string literals
 * 2.by using string object
 */
public class Ex1 {
     String s1="hally";//string literals

     String s2=new String("hally");
    void show()
    {
        System.out.println(s1);
        System.out.println(s1);
    }
    void methods()
    {
        System.out.println(s1.charAt(3));
        System.out.println(s1.length());
        String s3=s1.concat("mehul");
        s1="priya";
        System.out.println(s1.concat("tiwari"));
        System.out.println(s3);
        System.out.println(s1);
        System.out.println(s1.indexOf('y'));
        //s2=null;
        //System.out.println(s2.isEmpty());
        System.out.println(s1.equals(s1));

    }

    public static void main(String[] args) {
        Ex1 e=new Ex1();
        e.show();
        e.methods();
    }
}
