package Arrays;

import java.util.Scanner;

/**
 * Created by apple on 05/06/17.
 */
public class MultiDimensional {

    public static void main(String[] args) {

        int [][]a = new int[4][];
        //int[][] arr=new int[3][3];
        //int arr[][]={{1,2,3},{2,4,5},{4,4,5}};


//        int twoD[][] = new int[4][];
//
//        twoD[0] = new int[5];
//
//        twoD[1] = new int[6];
//
//        twoD[2] = new int[7];
//
//        twoD[3] = new int[8];
        for(int i = 0 ;i < a.length; i++){

            a[i] = new int[i];

            for(int j = 0 ; j< a[i].length;j++){
                a[i][j] = j;


            }

        }






    }
}



//public class UserInput {
//    public static void main(String[] args) {
//        List<String> list = new ArrayList<String>();
//        Scanner stdin = new Scanner(System.in);
//
//        do {
//            System.out.println("Current list is " + list);
//            System.out.println("Add more? (y/n)");
//            if (stdin.next().startsWith("y")) {
//                System.out.println("Enter : ");
//                list.add(stdin.next());
//            } else {
//                break;
//            }
//        } while (true);
//
//        System.out.println("List is " + list);
//        String[] arr = list.toArray(new String[0]);
//        System.out.println("Array is " + Arrays.toString(arr));
//    }
//}
