package Java8;

import java.util.HashSet;
import java.util.Set;

public class UncommonCharConcanate {

    public static void main(String args[]){
        String s1 = "aacdb";
        String s2 ="gafd";
        String k="";
        char ch1[]=s1.toCharArray();
        char ch2[]=s2.toCharArray();
        Set<Character> s11=new HashSet();
        Set<Character> s12=new HashSet();
        for(int i=0;i<ch1.length;i++){
             s11.add(ch1[i]);
        }

        for(int i=0;i<ch2.length;i++){
            s12.add(ch2[i]);
        }

        for(int i=0;i<ch1.length;i++){
            if(!s12.contains(ch1[i])){
                k=k+ch1[i];
            }
        }
        for(int i=0;i<ch2.length;i++){
            if(!s11.contains(ch2[i])){
                k=k+ch2[i];
            }
        }

        System.out.println(k);
    }
}
