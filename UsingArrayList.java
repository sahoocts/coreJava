package Practice;

import java.util.ArrayList;

public class UsingArrayList {
    public static void main(String args[]){
        String str="sarkkj";
        String d=getChar(str);
        System.out.print(d);
    }
    private static String getChar(String str) {
        //char c[]=str.toCharArray();
        String s="";
        ArrayList<Character> al=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(al.contains(c)){
                s=s+c;
                return s;
            }
            else{
                al.add(c);
            }
        }
        return "-1";
    }
}
