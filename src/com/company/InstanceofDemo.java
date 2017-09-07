package com.company;

/**
 * Created by apple on 03/06/17.
 */


class Aa{

    void instancep(){
        System.out.println("datatype Aa");
    }

}


class Bb extends Aa{

    void instanceb(){
        instancep();

       // Aa b = (Aa)Bb;
    }


}

class Cc {
    void instancem(Bb c1){
        System.out.println("datatype Bb");
    }


}

public class InstanceofDemo {
    public static void main(String[] args) {
  Bb b= (Bb) new Aa();
  b.instanceb();
  b.instancep();
    }
}


