package HackersRankk;

import java.util.HashSet;
import java.util.Set;

public class DuplicateRemove {

    public static void main(String args[]){
        String st="abaccb";
        String dup="";
        //char c = 0;
        Set<Character> set=new HashSet<>();
        set.add('a');
        set.add('b');
        set.add('c');
        set.add('a');
       /* for(int i=0;i<st.length();i++){
           if(!set.contains(st.charAt(i))){
               set.add(st.charAt(i));
           }
        }*/
        System.out.print(set);
        System.out.print(set.size());
      //  System.out.print("helll");
    }
}
