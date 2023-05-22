package Array;

import java.util.Scanner;

public class reversearray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int [] myarray=new int[n];
        for(int i=0;i<myarray.length;i++){
            myarray[i]=s.nextInt();
        }
        reverse(myarray);
        display(myarray);

    }
    public static void reverse(int []arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left=left+1;
            right=right-1;
        }

    }
    public static void display(int[]arrr){
        for(int i=0;i<arrr.length;i++){
            System.out.print(arrr[i]);
        }
    }
}
