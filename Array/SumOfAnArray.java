package Array;

import java.util.Scanner;

public class SumOfAnArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        int ans=sumarray(arr);
        System.out.print(ans);
    }
    public static int sumarray(int[] array){
        int rv=0;
        for(int i=0;i<array.length;i++){
            rv=rv+array[i];
        }



        return rv;
    }

}
