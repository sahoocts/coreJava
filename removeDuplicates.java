package NewClassAdded;

public class removeDuplicates {
    public static void main(String args[]){
       String s = "zvvo";
       String a="";
       for(int i=0;i<s.length();i++){
           if(!a.contains(s.charAt(i)+"")){
               a=a+s.charAt(i);
           }
       }
       System.out.print(a);
    }
}
