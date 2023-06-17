
//class- data +functions together
//reference of an object
//instance of an class.
//instance == object
//reference -stack - points (this parameter by default)to ab object
//data members and methods -class
//(verb + actions )
// "new" operators works on only class and give address of the instance/object to us.




public class Classes_Objects {
    private static class person{
        String name;
        int age;
        void sayHi(){
            if(this.age>30){
                System.out.println("hello from  "+this.name);

            }else{
                System.out.println("HI from  "+this.name);

            }

        }


    }

    public static void main(String[] args) {
        person p1;
        p1=new person();
        p1.age=24;
        p1.name="vikas";
        p1.sayHi();



        person p2;
        p2=new person();
        p2.age=30;
        p2.name="rohan";
        p2.sayHi();

        person p3=p2;
        p3.name="amit";
        p3.age=27;

        p3.sayHi();
        p2.sayHi();



    }

}

