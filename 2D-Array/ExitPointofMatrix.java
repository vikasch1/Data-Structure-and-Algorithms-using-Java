import java.util.Scanner;

public class ExitPointofMatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r=s.nextInt();
        int c=s.nextInt();
        int [][]arr= new int[r][c];
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[0].length;j++){
//                arr[i][j]=s.nextInt();
//            }
//        }
//        int i=0;
//        int j=0;
//        int dir=0; //e-0,s-1.w-2.n-2
//        while(true){
//            dir=(dir+arr[i][j])%4;
//            if(dir==0){ //going east
//                j++;
//                if(j==arr[0].length){
//                    j--;
//                    break;
//                }
//
//            }else if(dir==1){ //going south
//                i++;
//                if(i==arr.length){
//                    i--;
//                    break;
//                }
//
//            }else if(dir==2){ //going west
//                j--;
//                if(j==-1){
//                    j++;
//                    break;
//                }
//            }else{ //going north
//                i--;
//                if(i==-1){
//                    i++;
//                    break;
//                }
//            }
//
//
//
//        }
//        System.out.print(i);
//        System.out.print(j);

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=s.nextInt();
            }
        }

        int i=0;
        int j=0;
        int dir=0;
        while(true){
            dir=(dir+arr[i][j])%4;
            if(dir==0){
                j++;
                if(j==arr[0].length){
                    j--;
                    break;
                }


            }else if(dir==1){
                i++;
                if(i== arr.length){
                    i--;
                    break;
                }

            }else if(dir==2){
                j--;
                if(j==-1){
                    j++;
                    break;
                }


            }else{
                i--;
                if(i==-1){
                    i++;
                    break;
                }


            }
        }
        System.out.print(i);
        System.out.print(j);



    }
}
