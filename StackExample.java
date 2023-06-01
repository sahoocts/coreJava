package TwentyFive;

import java.util.Stack;

public class StackExample {

    public static void main(String args[]){
        int a[]={6,2,5,4,5,1,6};
        int rb[]=new int[a.length];
        System.out.print("length"+a.length);
        Stack<Integer> st=new Stack<>();
        st.push(a.length-1);
        rb[a.length-1]=a.length;

        for(int i=a.length-1;i>=0;i--){
            System.out.println("peek"+st.peek());
            while(st.size()>0 && a[i]<a[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                rb[i]=a.length;
            }
            else{
            rb[i]=st.peek();
            }
            st.push(i);
        }
    //    System.out.print(st+"...");
        for(int d:rb){
       //     System.out.println("::::"+d);
        }
    }
}
