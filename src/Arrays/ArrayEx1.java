package Arrays;

/**
 * Created by apple on 05/06/17.
 */

/*
*
* Array -is a collection of elements with same datatype.Array is a sequential storage of elements .It
* always starts with 0 and complete with n-1 .Array is a static memory alloaction it allocates the memory at compile time .
* array is an object
*
* */
public class ArrayEx1 {

    int a[]={1,2,3,4,5,};
    int [] a1=new int[8];

    void display() {

        System.out.println("display array elements ");
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
       // System.out.println(a.getClass());
        Class c=a1.getClass();
        String name=c.getName();
        System.out.println(name);
    }

    public static void main(String []args) {
        ArrayEx1 obj=new ArrayEx1();
        obj.display();
    }
}
