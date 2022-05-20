package nighteen_four;

import java.util.Arrays;
import java.util.*;

class Pair{
    long first;
    long second;
    public Pair(long first,long second){
        this.first=first;
        this.second=second;
    }
}
public class FindPairWithGivenSum {

    static ArrayList<Pair> FindPair(int x,long a[],long b[]){
        int n=a.length;
        int m=b.length;
        Arrays.sort(a);
        Arrays.sort(b);

        ArrayList<Pair> ans=new ArrayList<Pair>();
        Set<Long> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(a[i]);
        }

        for(int j=0;j<m;j++){
            long d=x-b[j];
            if(set.contains(d)){
                ans.add(new Pair(d,b[j]));
            }
        }
        return ans;
    }

    public static void main(String args[]){
        long A[] = {1, 2, 4, 5, 7};
        long B[] = {5, 6, 3, 4, 8};
        int X = 9;
        int n=A.length;
        int m=B.length;
        ArrayList<Pair> p=FindPair(X,A,B);
        for(int i=0;i<p.size();i++){
            System.out.println(p.get(i).first+"::"+p.get(i).second);
        }

    }
}
