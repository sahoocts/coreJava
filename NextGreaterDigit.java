import java.util.Stack;

public class NextGreaterDigit {

    public static void main(String args[]){
        int a[]={1,3,6,8,10,7};
        int nge[]=new int[a.length];
         nge[a.length-1]=-1;

        Stack<Integer> st=new Stack<>();
        st.push(a.length-1);

        for(int i=a.length-2;i>=0;i--){

            while(st.size()>0 && a[i]>st.peek()){
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

        for(int d:nge){
            System.out.println(d);
        }
    }
}
