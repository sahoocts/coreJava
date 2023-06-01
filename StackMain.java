package stack;

public class StackMain {
    public static void main(String args[]) throws StackException {
        DynamicStack s=new DynamicStack(5);
      //  CustomStack s=new CustomStack(5);
        s.push(34);
        s.push(20);
        s.push(22);
        s.push(21);
        s.push(44);
       s.push(55);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());


    }
}
