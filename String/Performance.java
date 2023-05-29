public class Performance {
    public static void main(String[] args) {
        int n =10000;
//        String s="";
        long start=System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(i);
        }


//        for(int i=0;i<n;i++){
//            s+=i;
//        }
        long end=System.currentTimeMillis();
        long dur=end-start;
        System.out.println(dur);
    }
}
