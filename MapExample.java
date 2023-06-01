package HackersRankk;

import java.util.HashMap;
import java.util.Scanner;

//Java Map hckers rank problem
public class MapExample {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        HashMap<String,Integer> hs=new HashMap<>();
        for(int i=0;i<n;i++){
            String x=sc.nextLine();
            String y=sc.nextLine();
             hs.put(x,Integer.valueOf(y));
        }
        while(sc.hasNext()){
            String str=sc.nextLine();
            if(hs.containsKey(str)){
                System.out.println(str+"="+hs.get(str));
            }
            else{
                System.out.println("Not found");
            }
        }

    }
}
