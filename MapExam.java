package JAVA8;

import java.util.HashMap;

public class MapExam {

    public static void main(String args[]){
        HashMap<Integer,Integer> hs=new HashMap<>();
        hs.put(1,10);
        hs.put(2,20);
        hs.put(1,2);
        System.out.print(hs.size());
        System.out.print(hs);
    }
}
