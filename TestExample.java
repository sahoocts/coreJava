package Java8;

import java.util.HashMap;
import java.util.Map;

public class TestExample {
    public static void main(String ars[]){
        String str="adbaccadcaa";//abc
        getM(str);
    }

    private static void getM(String str) {

        char ch1[]=str.toCharArray();
        HashMap<Character,Integer> hs=new HashMap<>();
        for(int i=0;i<ch1.length;i++){
            if(hs.containsKey(ch1[i])){
                hs.put(ch1[i],hs.get(ch1[i])+1);
            }
            else{
                hs.put(ch1[i],1);
            }
        }

        for(Map.Entry e:hs.entrySet()){
            int n= (int)e.getValue();
            if(n%2!=0){
                System.out.print(e.getKey());
            }
        }

    }
}
