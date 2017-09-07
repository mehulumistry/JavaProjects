package com.company;

/**
 * Created by apple on 29/05/17.
 */
public class MethodOverloading1 {
    public static void main(String[] args) {
        Add1 obj=new Add1();
        obj.add(1,1);
        /*
         when integer is passed  it will prefer to typecast
         smaller data type like float instead of double but when
          floating parameter is passed it will prefer give maximum memory double
          instead of float. :) but it is not true

         */
    }
}

class Add1 {
    int a, b;


    void add(float  x,float  y)
    {

        System.out.print(x+y);
    }
    void add(double a,double b)
    {
        System.out.print(a+b);

    }

}