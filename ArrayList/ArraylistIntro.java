import java.util.ArrayList;

public class ArraylistIntro {
    public static void main(String[] args) {
        ArrayList<Integer> list;
        list= new ArrayList<>();
        System.out.println(list.size()+"->"+list);

        list.add(10);
        list.add(20);
        list.add(30);


        System.out.println(list.size()+"->"+list);


        list.set(1,2000);

        System.out.println(list.size()+"->"+list);


        list.add(1,5000);
        System.out.println(list.size()+"->"+list);


        int val=list.get(3);
        System.out.println(val);

        list.remove(1);
        System.out.println(list.size()+"->"+list);



        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("------------------------------------");

        for(int val2:list){
            System.out.println(val2);
        }




    }

}
