package LogicImplemented;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveChar {

    public static void main(String argc[])
    {
       String str="aabccd";
       char ch[]=str.toCharArray();
       getRemove(ch);

    }
    private static void getRemove(char[] ch) {
       Set<Character> set=new HashSet<Character>();
        for(int i=0;i<ch.length-1;i++){
           // for(int j=i+1;j<ch.length;j++){
                if(ch[i]!=ch[i+1]){
                    set.add(ch[i]);
                }
           // }
           //
        }
        set.add(ch[ch.length-1]);

        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }
    }
}
