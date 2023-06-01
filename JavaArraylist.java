package HackersRankk;

import java.util.ArrayList;
import java.util.Scanner;

//Java Arraylist hackers rank
public class JavaArraylist {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> lines=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        for(int i=0;i<n1;i++){
            int n2=sc.nextInt();
            ArrayList<Integer> line=new ArrayList<>();
            for(int j=0;j<n2;j++){
                line.add(sc.nextInt());
            }
            lines.add(line);
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(x>0 && x<=n1 && y<=lines.get(x-1).size()){
                System.out.println(lines.get(x-1).get(y-1));
            }
            else{
                System.out.println("ERROR!");
            }
        }
        sc.close();
    }
}
//Input
//5
//5 41 77 74 22 44
//1 12
//4 37 34 36 52
//0
//3 20 22 33
//5
//1 3
//3 4
//3 1
//4 3
//5 5

//Output
//74
//52
//37
//ERROR!
//ERROR!