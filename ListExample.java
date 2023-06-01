package HackersRankk;

import java.util.ArrayList;
import java.util.Scanner;

public class ListExample {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            al.add(sc.nextInt());
        }
        int n1=sc.nextInt();
        for(int i=0;i<n1;i++){
            String str=sc.next();
            if(str.equals("insert")){
                int x=sc.nextInt();
                int y=sc.nextInt();
                al.add(x,y);
            }
            //String str=sc.nextLine();
            if(str.equals("delete")){
                int s=sc.nextInt();
                al.remove(s);
            }
        }

        for(int d:al){
            System.out.println(d);
        }
    }
}
