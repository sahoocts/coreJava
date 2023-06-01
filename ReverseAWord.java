package NewPrepare;

public class ReverseAWord {
    public static void main(String args[]){
        String str="i.like.this.program.very.much.";
        String st[]=str.split("\\.");
       // String st[]=str.split(" ");
        int i=0;
        int j=st.length-1;
        String st1="";
        while(i<j){
            st1=st[i];
            st[i]=st[j];
            st[j]=st1;
            i++;
            j--;
        }
        String d="";
        for(String s:st){
            System.out.print(s+".");
        }
    }
}
