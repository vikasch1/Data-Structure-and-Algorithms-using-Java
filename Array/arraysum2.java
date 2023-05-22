package Array;

import java.util.Scanner;

public class arraysum2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a1kasize=s.nextInt();
        int[]array1= new int[a1kasize];
        for(int i=0;i<array1.length;i++){
            array1[i]=s.nextInt();
        }
        int a2kasize=s.nextInt();
        int []array2= new int[a2kasize];
        for(int i=0;i<array2.length;i++){
            array2[i]=s.nextInt();
        }

        int []resultarray=new int[a1kasize>a2kasize?a1kasize:a2kasize];
        int c=0;
        int i=array1.length-1;
        int j=array2.length-1;
        int k=resultarray.length-1;


        while(k<0){
            int d=c+array1[i]+array2[j];
            d=d%10;
            c=d/10;
            resultarray[k]=d;

            i--;
            j--;
            k=k--;


        }
        for(int ii=0;ii<resultarray.length;ii++){
            System.out.println(resultarray[ii]);
        }



    }
}
