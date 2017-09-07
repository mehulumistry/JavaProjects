package string;

/**
 * Created by apple on 09/06/17.
 */
public class Exp2 {
    void show()
    {
        int p = 0;
        char ch[] = new char[50];
        String s3="this is an apple and banana";
        for(int i=0;i<s3.length();i++)
        {
            ch[i]= s3.charAt(i);
            if(ch[i] == ' '){
                p = p+ 1;


            }
        }
        System.out.println(p);
    }
    public static void main(String[] args) {
        String s = "This is an Apple";
        Exp2 ss = new Exp2();
        ss.show();


        System.out.println(s.trim()); // only trims before and after spaces from string "  Hello Java " not in between spaces.
        int u= 0,l = 0,t = 0;
        for(int k = 0; k < s.length() ; k++){
            char c = s.charAt(k);

            if(Character.isUpperCase(c)){
                u = u + 1;

            }
            else if(Character.isLowerCase(c)){
                l = l + 1;
            }
            else if(Character.isSpaceChar(c)){
                t = t+ 1;
            }

        }
        System.out.println("UPPERCASE = " + u);
        System.out.println("lowercase = " + l);
        System.out.println("Length of String = " + (u+l));
        System.out.println(t);

    }

}


