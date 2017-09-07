package com.company;

/**
 * Created by apple on 03/06/17.
 * first constructor then inside its super and inside its intance intializer block
 */


interface Ee {
    default void ini(){
        System.out.println("interface invoked");
    }


}
class Ex implements Ee
{
    String ss ;
    {
        ss = "String of parent invoked";
        System.out.println(ss);
    }
    Ex()
    {

        System.out.println("parent class ctor");
        ini();
    }

}
class Ex1 extends Ex
{
    int a;//instance variable
    {
        a=20;//instance intializer
        System.out.println("instance intializer invoked");
    }
    Ex1()
    {
        System.out.println("default ctor");
    }
    void show()
    {
        System.out.println("method invoked"+"  "+a);
    }

}
public class InstanceIntializerBlock {
    public static void main(String[] args) {
        Ex1 e=new Ex1();
        Ex ee = new Ex();  // see first super if it is already in super class then second instance intializer block will execute


    }
}
