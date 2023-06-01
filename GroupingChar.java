package HackersRankk;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class GroupingChar {
    public static void getGroup(String str){
        char c[]=str.toCharArray();
       // char ch[]=new char[c.length];
        int k=0;
        LinkedHashMap<Character,Integer> hs=new LinkedHashMap<>();
        for(int i=0;i<c.length;i++){
            if(hs.containsKey(c[i])){
                hs.put(c[i],hs.get(c[i])+1);
            }
            else{
                hs.put(c[i],1);
            }
        }
        char ch[]=new char[c.length];
        int j=0;
        for(Map.Entry<Character,Integer> e:hs.entrySet()){
             int v=(int)e.getValue();
          //   System.out.print(e.getKey()+"::"+e.getValue());
            for(int i=0;i<v;i++){
                ch[j]=e.getKey();
                j++;
            }

        }

        for(char f:ch){
            System.out.print(f);
        }
     /*   for(int i=0;i<c.length;i++){
            for(int j=i+1;j<c.length;j++){
                   if(c[i]==c[j]){
                        ch[k]=c[i];
                        k++;
                }
                   if(c[i]!=c[j]){
                       ch[k]=c[i];
                       k++;
                       break;

            }
        }
        String d=String.valueOf(ch);
        return d;*/
    }

    public static void main(String args[]){
        String input= "occurrence";//occcurreen
        getGroup(input);
      //  System.out.print(d);
    }
}
