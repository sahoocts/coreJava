package HackersRankk;

public class StringAdd {
    public static void main(String args[]){
        String x = "12560";
        int n=x.length();
      String c[]=new String[n];
      for(int i=0;i<x.length();i++){
          c[i]=x.charAt(i)+" ";
      }
   for(String d:c){
       System.out.print(d+" ");
   }
    }
}
