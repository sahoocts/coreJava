package LogicImplemented;

import java.util.HashMap;
import java.util.Map;
public class MapExample {

    public static void main(String args[]){
        HashMap<String,Integer> hs=new HashMap<>();
        hs.put("saroj",100);
        hs.put("kumar",200);
        hs.put("sahoo",300);

        for (Map.Entry en:hs.entrySet()){
           System.out.println(en.getKey()+":::"+en.getValue());
        }
        for(String s:hs.keySet()){

        }

    }
}
