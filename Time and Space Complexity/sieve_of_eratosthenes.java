import java.util.Scanner;

public class sieve_of_eratosthenes {
    //O(nloglogn)
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        boolean[]arr= new boolean[n+1];
        for(int i=2;i * i<arr.length;i++){
            if(arr[i]==false){
                for(int ja=i;i * ja<arr.length;ja++){
                    arr[i * ja]=true;

                }
            }
        }

        for(int i=2;i<arr.length;i++){
            if(arr[i]==false){
                System.out.println(i);
            }
        }

    }
}
