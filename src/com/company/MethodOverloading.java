package com.company;

import java.awt.*;

/**
 * Created by apple on 29/05/17.
 */
class Add
{
    int a,b;
    Add()
    {
        a=10;
        b=20;
    }
    void add()
    {
        int c=a+b;
        System.out.println(c);
    }
    void add(int x)
    {
        int c=x+x;
        System.out.println(c);
    }
    void add(int x,int y)
    {
        int c=x+y;
        System.out.println(c);
    }
    double add(double x,double y)
    {
        double c=x+y;
        return c;

    }
    void add(int x,int y,int z)
    {
        int c=x+y+z;
        System.out.println(c);
    }

}
public class MethodOverloading {

    public static void main(String[] args) {
        Add obj=new Add();
        obj.add();
        obj.add(10);
        obj.add(1,2);
        obj.add(1,2,3);
        System.out.println(obj.add(1.1,3));
    }}
