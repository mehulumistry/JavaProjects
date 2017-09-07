package Arrays;

/**
 * Created by apple on 05/06/17.
 */
class Sort
{

    void  sort(int a[])
    {
//bubble sort
        
        int i,j,temp;
        for(i=0;i<a.length-1;i++)
        {
            for(j=0;j<a.length-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

        System.out.println("sorted array is");
        for(i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"\t");
        }
    }
}
public class ArrayEx3 {
    public static void main(String[] args) {
        Sort obj=new Sort();
        int b[]={1,32,43,5,6,-5,7,4,514,23,55};
        obj.sort(b);
    }
}
