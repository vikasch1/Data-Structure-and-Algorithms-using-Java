public class onetwoarray {
    //deep n shallow copy
    public static void main(String[] args) {
        int[]one = new int[3];
        one[0]=22;
        one[1]=33;
        one[2]=44;

        for(int i=0;i<one.length;i++){
            System.out.println(one[i]);
        }
        int[]two=one;
        two[2]=999;
        for (int i = 0; i < two.length; i++) {
            System.out.print(two[i]);

        }
    }

}
