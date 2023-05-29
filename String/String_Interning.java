import java.awt.*;
import java.util.*;
import java.util.Scanner;

public class String_Interning {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //interning
        //why
        //new keyword
        //internpool
        //performance
        //1.implication-equals,==
        //2.implication-immutability (refernce(address)is immutable but instance is not)
        //what if we can change the instance then all pointers in internpool also changes.
        //due to immutability string performance gets slow
        // string str="";
//    for i to 100
//    s+=i; at every ops new interpool is created-copy previous data and change the new refernce.
        //to overcome this performance issue we have stringbuilder class in java


        //stringbuilder-mutable string
        StringBuilder sb = new StringBuilder("hello");
        System.out.print(sb);

        char ch=sb.charAt(2);
        System.out.println(ch);

        sb.setCharAt(3,'z');
        System.out.println(sb);


        sb.insert(2,'y');
        System.out.println(sb);


        sb.deleteCharAt(3);
        System.out.println(sb);


        sb.append('g');
        System.out.println(sb);

        System.out.println(sb.length());





    }










}
