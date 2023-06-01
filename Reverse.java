package NewPrepare;

import java.util.Arrays;

public class Reverse {

    public static void main(String args[]){
        String st="SAROJ";
       /* String s="";
        for(int i=st.length()-1;i>=0;i--){
            s=s+st.charAt(i);
        }

        System.out.print(s);*/

        char ch[]=st.toCharArray();
        int i=0;
        int j=st.length()-1;
        while(i<j){
            char c=ch[i];
            ch[i]=ch[j];
            ch[j]=c;
            i++;
            j--;
        }
       String s= Arrays.toString(ch);
        System.out.print(s);
        for(char d:ch){
            System.out.print(d);
        }
    }
}
