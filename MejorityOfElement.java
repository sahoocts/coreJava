import java.util.HashMap;
import java.util.Map;

public class MejorityOfElement {

    public static void main(String args[]){
       int N = 5;
       int A[] = {3,1,3,3,2};
       int g= getMajority(A,N);
       System.out.print(g);
    }

    private static int  getMajority(int[] a, int n) {
       int n1=a.length/2;
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(hs.containsKey(a[i])){
                hs.put(a[i],hs.get(a[i])+1);
            }
            else{
                hs.put(a[i],1);
            }
        }
        int max=0;
        int b=0;
        int k=0;
        for(Map.Entry e:hs.entrySet()){
            b=(int)e.getValue();
            if(max<b){
                max=b;
                k=(int)e.getKey();
            }
        }
        if(max>n1){
            return k;
        }
        return -1;
    }
}
