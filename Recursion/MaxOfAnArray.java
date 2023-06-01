import java.util.Scanner;

public class MaxOfAnArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int []arr= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        int ans=maxarray(arr,0);
        System.out.print(ans);
    }

    public static int maxarray(int []arr,int idx ){
        if(idx==arr.length-1){
            return arr[idx];
        }


        int misa=maxarray(arr,idx+1);
        if(arr[idx]>misa){
            return arr[idx];
        }else{
            return misa;
        }
    }

}
