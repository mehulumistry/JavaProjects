package com.company;

/**
 * Created by apple on 29/05/17.
 * this keyword is used to refer the current class object
 * 1.this is used to refer the current class instance variables .
 * this() will call default constructor.
 */
class Student
{
    int rno;//instance variables
    String n;
    Student()
    {
        System.out.println("default ctor");
    }
    Student(String n)
    {
        this();
        System.out.println(" ctor invoked  "+n);
    }
    Student(int rno,String n)//local variables
    {
        this("mehul");

        this.rno=rno;

        this.n=n;
    }


    void show()
    {
        System.out.print(rno+"  "+n);
    }

}
public class ThisKeyword {
    public static void main(String[] args) {

        Student s=new Student(101,"hally");
        s.show();

    }
}
