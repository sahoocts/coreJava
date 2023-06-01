package NewHackersRank;

import java.util.StringTokenizer;

public class Test {
    public static void main(String args[]){
        String str="This is an example string right Yes";
       // String s=str.replaceAll("[.,!?]","");
      //  String s1=s.replaceAll(" "," ");
        String d[]=str.split(" ");
        for(String dd:d){
            System.out.println(dd);
        }

        /*StringTokenizer st=new StringTokenizer(s);
           int n=st.countTokens();
        for(int i=0;i<n;i++){
            System.out.println(st.nextToken());
        }*/
       // System.out.println(s);
    }
}
