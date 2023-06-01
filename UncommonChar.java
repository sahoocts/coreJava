package Leetcode;

import java.util.ArrayList;

public class UncommonChar {
    public static void main(String args[]){
       String A = "geeksforgeeks";
        String B = "geeksquiz";
        getUncommonChar(A,B);
    }

    private static void getUncommonChar(String a, String b) {
        ArrayList<Character> al1=new ArrayList<>();
        ArrayList<Character> al2=new ArrayList<>();
        ArrayList<Character> store=new ArrayList<>();
        int n1=a.length();
        int a2=b.length();

        for(int i=0;i<a.length();i++){
            al1.add(a.charAt(i));
        }
        for(int i=0;i<b.length();i++){
            char c1=b.charAt(i);
            if(!al1.contains(c1)){
                store.add(c1);
            }
        }
        for(int j=0;j<b.length();j++){
            al2.add(b.charAt(j));
        }

        for(int j=0;j<a.length();j++){
            char c2=a.charAt(j);
            if(!al2.contains(c2)){
                store.add(c2);
            }
        }
        System.out.print(store);

       /* for(int i=0;i<b.length();i++){
            for(int j=0;j<a.length();j++){
                if(b.charAt(i)!=a.charAt(j)){
                    al.add(b.charAt(i));
                }
            }
        }*/

       /* for(int k=0;k<al.size();k++){
            System.out.print(al.get(k)+",");
        }*/
    }
}
