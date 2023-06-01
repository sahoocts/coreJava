package NewHackersRank;

import java.util.HashMap;
import java.util.Scanner;

//Task
//Given n names and phone numbers, assemble a phone book that maps
//friends' names to their respective phone numbers. You will then be given an unknown number of names to query your phone book for. For each name queried, print the associated entry from your phone book on
//a new line in the form name=phoneNumber; if an entry for name is not found, print Not found instead
public class DictionariesAndMaps {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> hs = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            String name = sc.next();
            int ph = sc.nextInt();
              hs.put(name,ph);
        }
        while(sc.hasNext()){
            String name1=sc.next();
            if(hs.containsKey(name1)){
                System.out.print(hs.get(name1));
            }
            else{
                System.out.print("not found");
            }
        }
    }
}
