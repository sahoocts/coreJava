import java.util.Stack;

public class TestExample {
    public static void main(String args[]){
       // String str="JORAS";
       /* char ch[]=str.toCharArray();
        int i=0;
        char c;
        int j=ch.length-1;
        while(i<j){
            c=ch[i];
            ch[i]=ch[j];
            ch[j]=c;
            i++;
            j--;
        }
        for(char c1:ch){
            System.out.print(c1);
        }*/

        /*int a1[]={1,2,3};
        int a2[]={4,5,6};
        int c[]=new int[a1.length+a2.length];
        int k=0;
        for(int i=0;i<a1.length;i++){
            c[k]=a1[i];
            k++;
        }
        for(int j=0;j<a2.length;j++){
            c[k]=a2[j];
            k++;
        }

        for(int s:c){
            System.out.print(":"+s);
        }
*/

        Stack<Character> st=new Stack<>();
        st.push('s');
        st.push('a');
        st.push('r');
        st.push('o');
        st.push('j');
      //  System.out.print(st.peek());
        st.pop();
        System.out.print(st.peek());







    }
}
