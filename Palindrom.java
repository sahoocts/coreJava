package HackersRank;

public class Palindrom {
    public static String getpalindrom(String s){
        char c[]=s.toCharArray();
        int i=0;
        int j=c.length-1;
        char c1;
        while(i<j){
            c1=c[i];
            c[i]=c[j];
            c[j]=c1;
            i++;
            j--;
        }
       String sr=String.valueOf(c);
       // System.out.print(sr);
          return sr;
    }
    public static void main(String args[]){
        String str="madam";
       String palin= getpalindrom(str);
       if(palin.equals(str)){
           System.out.print("Its a palindrom:::"+palin);
       }
       else{
           System.out.print("not");
       }

    }
}
