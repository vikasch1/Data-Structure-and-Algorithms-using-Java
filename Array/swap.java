public class swap {
    public static void main(String[] args) {
        int[]array=new int[5];
        array[0]=12;
        array[1]=23;
        array[2]=44;
        array[3]=88;
        array[4]=99;

        swap(array,0,4);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }

    }
    public static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
