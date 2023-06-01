package TwentyFive;

import java.util.Stack;



public class NextGreaterElementStack {

    static int[]  getNextGreaterElementStack(int a[]){
        int nge[]=new int[a.length];
        Stack<Integer> st=new Stack<>();
        st.push(a[a.length-1]);
        nge[a.length-1]= -1;
        for(int i=a.length-2;i>=0;i--){
            while(st.size()>0 && a[i]>=st.peek()){
                st.pop();
            }
            if(st.size()==0){
                nge[i]=-1;
            }

            else{
                nge[i]=st.peek();
            }
            st.push(a[i]);
        }
     return nge;
    }
    public static void main(String args[]){


        int a[]={2,5,9,3,1,12,6,8,7,10};
       int x[]= getNextGreaterElementStack(a);
       for(int s:x){
           System.out.println(s);
       }



    }
}
