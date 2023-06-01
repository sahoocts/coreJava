package NewClassAdded;

import java.util.Stack;

public class DeleteAdjDup {
    public static void main(String args[]){
        //String str="geeksforgeeks";
        String str="acaaabbbacdddds";
        StringBuilder sb=new StringBuilder();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str.length();i++){
            if(!stack.isEmpty() && stack.peek()==str.charAt(i)){
                stack.pop();
            }
            else{
                stack.add(str.charAt(i));
            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

       System.out.println(sb.reverse().toString());
    }
}
