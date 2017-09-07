package com.company;

/**
 * Created by apple on 30/05/17.
 */
class StaticVariables
{
    int id;
    String n;
    static String cname="NIRMA";

    StaticVariables(int id,String n)
    {
        this.id=id;
        this.n=n;

    }
    void show()//non-static
    {
        System.out.println(id+"  "+n+"  "+cname);
    }
    static  void display()
    {
        System.out.println(cname);
    }
    static {
        System.out.println("static block invoked ");
    }
}
public class StaticDataMembers {

    public static void main(String[] args) {
        System.out.println("main method invoked");

        StaticVariables s=new StaticVariables(101,"hally");
        s.display();
        s.show();
    }
}
