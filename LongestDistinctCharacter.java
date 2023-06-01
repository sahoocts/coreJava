package LogicImplemented;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LongestDistinctCharacter {
    public static void main(String args[]){
        String str="abeabs";
        char ch[]=str.toCharArray();
        Set<Character> set=new HashSet<Character>();
        int n=ch.length;
        int i=0;
        int j=0;
        while(i<n && j<n){
            if(!set.contains(ch[j])){
                set.add(ch[j]);
                j++;
            }
            else{
                set.remove(ch[i]);
                i++;
            }
        }
        Iterator it=set.iterator();
            while(it.hasNext()){
                System.out.print(it.next());
            }

        }
    }

