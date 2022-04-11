package NewTry;

import java.util.HashMap;
import java.util.Map;

public class ConsequenceOfCharacter {

    public static void main(String args[]){
        String str="sarojkumarsahoo";
        char ch[]=str.toCharArray();
        HashMap<Character,Integer> hs=new HashMap<Character, Integer>();
        for(char c:ch){
            if(hs.containsKey(c)){
                hs.put(c,hs.get(c)+1);
            }
            else{
                hs.put(c,1);
            }
        }
     int a=0;
        for(Map.Entry<Character,Integer> eset:hs.entrySet()){

            if(eset.getValue()>a){
                a=eset.getValue();
            }

            //System.out.println(eset.getKey()+":"+eset.getValue());
        }
        System.out.println(":::"+a);
    }
}
