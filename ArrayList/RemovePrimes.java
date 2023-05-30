import java.util.ArrayList;

public class RemovePrimes {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(13);
        list.add(16);
        removeprime(list);
        System.out.print(list);

    }

    public static boolean isprime(int num){
        boolean isprime=true;


        for(int div=2;div*div<=num;div++){
            if(num%div==0){
                isprime=false;
                break;

            }
        }
        return isprime;


    }

    public static void removeprime(ArrayList<Integer>al){
        for(int i=0;i<al.size();i++){
            int val=al.get(i);
            boolean isthisvalueprime=isprime(val);
            if(isthisvalueprime==true){
                al.remove(i);
                i--;
            }

        }
    }
}
