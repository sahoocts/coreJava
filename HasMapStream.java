package HackersRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HasMapStream {
    public static void main(String args[]){
        HashMap<Integer, List> hs=new HashMap<Integer, List>();
        List<String> list1 = new ArrayList<String>();

        list1.add("r1");
        list1.add("r4");

        List<String> list2 = new ArrayList<String>();
        list2.add("r2");
        list2.add("r5");

        List<String> list3 = new ArrayList<String>();
        list3.add("r3");
        list3.add("r6");


        hs.put(1,list1);
        hs.put(2,list2);
        hs.put(3,list3);

        hs.put(10,list1);
        hs.put(15,list2);

        List<List> l=hs.entrySet().stream().filter(e->e.getKey()==1).map(Map.Entry::getValue)
                .collect(Collectors.toList());
        System.out.print(l);

    }
}
