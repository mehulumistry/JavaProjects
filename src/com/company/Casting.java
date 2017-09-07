package com.company;

/**
 * Created by apple on 04/06/17.
 */

class Ae{
    void disp(){
        System.out.println("Class Ae");
    }
}

interface AA
{
    void display();
}
class BB implements AA
{
    public void display() {
        System.out.println("Am in class B");
    }
    void b(){
        System.out.println("Class B");
    }

}
class CC extends BB
{
    @Override
    public void display() {
        System.out.println("Am in class C");
    }
    void c(){
        System.out.println("Class C");
    }
}


class Casting {

    public static void main(String[] args) {

        // Upcasting from subclass to super class.
        AA aRef = new CC();



        BB breff = new BB();
        aRef.display();//Am in class C
        //Downcasting of reference to subclass reference.
        BB bRef = (BB) aRef;
        System.out.println(bRef);

        System.out.println(aRef);
        bRef.display();//Am in class C

    }
}