package nighteen_four;

import java.util.ArrayList;

public class Factorials_of_large_numbers {
    /*static ArrayList<Integer> getFact(int n){
        ArrayList<Integer> al=new ArrayList<Integer>();
        int s=1;
        for(int i=1;i<=n;i++){
            s=s*i;
        }
        al.add(s);
return al;
    }*/

    static ArrayList<Integer> factorial(int N){
        int a=0,c=0;
        ArrayList<Integer> fact = new ArrayList<Integer>();
        fact.add(0,1);
        a = 1;
        int value=2;
        while(value<=N)
        {
            for(int i=fact.size()-1;i>=0;i--)
            {
                int temp = fact.get(i)*value+c;
                fact.set(i,temp%10);
                c = temp/10;
            }
            while(c!=0)
            {
                fact.add(0,c%10);
                c=c/10;
                // size++;
            }
            value++;
        }
        return fact;
    }
    public static void main(String args[]){
        int N = 5;
       // 1*2*3*4*5
        ArrayList<Integer> a= factorial(N);
        for(int i=0;i<a.size();i++){
            System.out.println(":::"+a.get(i));
        }
    }
}

//
