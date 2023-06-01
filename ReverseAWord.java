package nighteen_four;

public class ReverseAWord {

    public static void main(String args[]){
        String str="i.like.this.program.very.much";

      //  String str="i:like:this:program:very:much";
        String s[]=str.split("\\.");
        int n=s.length;
        int i=0;
        int j=n-1;
        String st="";
        while(i<j){
            st=s[i];
            s[i]=s[j];
            s[j]=st;
            i++;
            j--;
        }
     for(String d:s){
         System.out.print(d+".");
     }

    }
}
