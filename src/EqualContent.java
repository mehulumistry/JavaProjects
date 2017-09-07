/**
 * Created by apple on 9/1/17.
 */



class Student{

    String name;
    int roll;

    Student(String name,int roll){
        this.name = name;
        this.roll = roll;
    }
    public boolean equals(Object Obj){

        String name1 = this.name;
        int roll1 = this.roll;

        Student s2 = (Student)Obj;
        String name2 = s2.name;
        int roll2 = s2.roll;



        if(name1.equals(name2)){      // here String internally calls equals method and overrides it
            System.out.println("yes");
            return true;
        }

        else{
            System.out.println("no");
            return false;

        }




    }

}
public class EqualContent {


    public static void main(String[] args) {



        Student s1 = new Student("Mehul",59);
        Student s2 = new Student("Alisha",4);
        s1.equals(s2);

    }

}
