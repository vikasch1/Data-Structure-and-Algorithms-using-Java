
import java.io.*;
        import java.util.*;

public class FirstIndex {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int []arr= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        int d=s.nextInt();
        int fi=firstIndex(arr,0,d);
        System.out.print(fi);

    }

    public static int firstIndex(int[] arr, int idx, int x){
        if(idx==arr.length){
            return -1;
        }

        if(arr[idx]==x){
            return idx;
        }else{
            int fiisa= firstIndex(arr,idx+1,x);
            return fiisa;

        }


    }

}
