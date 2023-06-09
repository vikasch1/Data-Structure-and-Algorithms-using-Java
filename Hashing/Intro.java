import java.util.HashMap;

public class Intro {
    public static void main(String[] args) {
        int [] arr= new int[]{1,2,2,3,4,3,4,5,5,6,2,3,5,6,6,7,7,8,2,8,8};
        HashMap<Integer,Integer>heap= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(heap.containsKey(arr[i])){
                int value=heap.get(arr[i]);
                heap.put(arr[i],value+1);
            }
            else{
                heap.put(arr[i],1);
            }

        }
     for(Integer key:heap.keySet()){
         System.out.println(key+":"+heap.get(key));
     }

    }
}
