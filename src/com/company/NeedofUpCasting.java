package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by apple on 04/06/17.
 */


class UpA{
    void a(UpA aa){
        System.out.println("datatype UpA");
    }
    void a(UpB aa){
        System.out.println("datatype UpB");
    }

}


class UpB extends UpA{
    void b(UpB bb){
        System.out.println("datatype UpB");
    }
    void b1(UpA bb){
        System.out.println("datatype UpA");
    }

}
public class NeedofUpCasting {

    public static void main(String[] args) {

        UpB b = new UpB();
        UpA a = new UpB();// parent a = new child; upcasting
        // a.b & a.b1 is not possible
        UpA aa = new UpA();
        UpB bb = (UpB) new UpA();
        UpB c = (UpB) a;

        //UpB a = (UpB) new UpA();
        //UpB c = (UpB) UpA()  will not work throw some Error;


        bb.b(bb);
        bb.a(bb);
        c.b(c);  // now class UpB methods is accessible
        b.b1(b);
        b.b1((UpA)b);   // no need to Upcast here
        b.b(b);
        a.a(a);
        a.a((UpB)a);



        System.out.println(b);
        System.out.println(a);
        System.out.println(c);


    }
}
