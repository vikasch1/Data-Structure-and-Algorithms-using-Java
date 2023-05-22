package Array;

import java.util.Scanner;

public class sumarray {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n =s.nextInt();
        int []myarray=new int[n];
        for (int i=0; i<myarray.length; i++){
            myarray[i]=s.nextInt();
        }
        int mysum=sum(myarray);
        display(mysum);





    }

    public static int sum(int[]arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }




        return sum;
    }
    public static void display(int result){
        System.out.print(result);
    }

}
