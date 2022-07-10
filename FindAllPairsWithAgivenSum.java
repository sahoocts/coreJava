import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

class Pair{
    long key;
    long value;
    Pair(long key,long value){
        this.key=key;
        this.value=value;
    }
}
public class FindAllPairsWithAgivenSum {

    public static void main(String args[]){
        long A[] = {1, 2, 4, 5, 7};
       long B[] = {5, 6, 3, 4, 8};
        int X = 9;
       Pair pp[]= getFindAllPairsWithAgivenSum(A,B,X);
     for(int i=0;i<pp.length;i++){
         System.out.println(pp[i].key+" "+pp[i].value);
     }


    }

    private static Pair[] getFindAllPairsWithAgivenSum(long[] a, long[] b, int x) {

        ArrayList<Pair> al=new ArrayList<>();
        HashSet<Long> set=new HashSet<>();
        Arrays.sort(a);
        for(int i=0;i<b.length;i++){
            set.add(b[i]);
        }

        for(int i=0;i<a.length;i++){
            long diff=x-a[i];
            if(set.contains(diff)){
                al.add(new Pair(a[i],diff));
            }
        }

        Pair[] p=new Pair[al.size()];
        for(int i=0;i<p.length;i++){
            p[i]=new Pair(al.get(i).key,al.get(i).value);
        }
        return p;
    }
}
