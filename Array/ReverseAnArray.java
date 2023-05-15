package Array;

import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        reverse(arr);
        display(arr);
    }
    public static void reverse(int[]array){
        int i=0;
        int j=array.length-1;

        while(i<j){
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            i++;
            j--;
        }
    }

    public static void display(int[]ar){
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
    }
}
