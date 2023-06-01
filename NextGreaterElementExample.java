package TwentyFive;

import java.util.Stack;

public class NextGreaterElementExample {

    public static int[] getNextGreaterElementExample(int a[]){
        int n=a.length;
        int nge[]=new int[n];
        nge[n-1]=-1;
        Stack<Integer> st=new Stack<Integer>();
        st.push(a[n-1]);
        for(int i=n-2;i>=0;i--){
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
        int a[]={2,5,9,3,1,12,6,8,7};
        int b[]=getNextGreaterElementExample(a);
        for(int d:b){
            System.out.println(d);
        }
    }
}
