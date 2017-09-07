package Arrays;

/**
 * Created by apple on 05/06/17.
 */
public class ArrayEx2 {
    void show(int a[],int n)//passing array to a function
    {
        System.out.println("display sqaure of array elements");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]*a[i]);
        }

    }

    int min(int a[]){
        int temp = a[0];

        for(int i = 1 ; i < a.length ;i++){
            if(a[i] < temp){
                temp = a[i];
            }
        }
        return temp;
    }

    void search(int a[],int e){
        int i;


        for( i = 1 ; i < a.length ;i++){
            if(a[i] == e){
                System.out.println("found at position " + (i+1));
                break;
            }

        }
        if(i >= a.length ){
            System.out.println("not found");
        }


    }

    public static void main(String[] args) {
        ArrayEx2 obj=new ArrayEx2();
        int b[]={3,3,2,3,2,5,6,5,7,5};
        int c[] = new int [10];
        int n=4;

        //obj.show(b,n);
        //System.out.println(obj.min(b));
        obj.search(b,90);
    }
}
