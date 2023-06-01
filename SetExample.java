package HackersRankk;

import java.util.HashSet;
import java.util.Scanner;

//Java Hashset
//Hackerrank example
//5
//john tom
//john mary
//john tom
//mary anna
//mary anna
public class SetExample {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String left[]=new String[t];
        String right[]=new String[t];
        for(int i=0;i<t;i++){
            left[i]=sc.next();
            right[i]=sc.next();
        }
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<t;i++){
            String pair=left[i]+" "+right[i];
            set.add(pair);
            System.out.println(set.size());
        }
    }
}
