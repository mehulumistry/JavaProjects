package com.company;

public class Main {


    public static void main(String[] args){

        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);

        Demo d = new Demo();
        Sub s = new Sub();
        s.sub();
        d.add();
        System.out.println(i+j);

    }

    }

 class Demo{


    void add() {
        int a = 5;
        int b = 6;
        int c = a + b;
        System.out.println(c);

    }
}

class Sub{


    void sub() {
        int a = 5;
        int b = 6;
        System.out.println(a - b);
    }

 }



