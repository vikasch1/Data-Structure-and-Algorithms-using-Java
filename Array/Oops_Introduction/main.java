package Oops_Introduction;

public class main {
    public static void main(String[] args) {
        // marks of 5 students


//        int []marks = new int[5];
//
//
//        //name of 5 students
//        String[] name = new String[5];

//        //data of 5 students? name age marks?
//        int []rollno= new int[5];
//        int [] age= new int[5];
//        float[]markss= new float[5];

        //create class- name group of props and funcs-template-logical constuct
        //object-instances of a class-physically present-occupies object


        class Student{
            int rollno;

            int age;
            String name;

            float marks;

        }


//        Student[]students= new Student[5];

//        Student vikas= new Student();  // new keyword is used to create an object of a class.it dynamically allocates memory and create a refernce to it.
        Student rahul;  //rahul is a refernce variable (initially its null)lying in stack memory
        rahul= new Student();
        rahul.age=12;
        System.out.print(rahul);
        System.out.print(rahul.marks);
        System.out.print(rahul.age);




//        System.out.print(students.toString());



        //state(value of an object props),behaviour and identity of An object

        //dot operator-links instance variables
//        System.out.print(vikas.markss);













    }
}
