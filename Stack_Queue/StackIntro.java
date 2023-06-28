import java.util.Stack;

public class StackIntro {
    public static void main(String[] args) {
        Stack<Integer>stack= new Stack<>();
        System.out.println(stack);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        int ele=stack.peek();
        System.out.println(ele);




    }


}
