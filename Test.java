package Java8;

import java.util.HashMap;

class Acce {

    public static void main(String args[]){
        HashMap<String,Integer> hs=new HashMap<>();
        hs.put("s11",1);
        hs.put("sa",2);
        hs.put("s11",1);
        System.out.println(hs.size());

        System.out.println("gg");
    }
}
