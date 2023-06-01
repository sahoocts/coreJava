package NewPrepare;

import java.util.HashMap;

public class FirstelementToOccurkTimes {

    private static int getKthElement(int[] a, int n,int k) {

        HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            if (hs.containsKey(a[i])) {
                hs.put(a[i], hs.get(a[i]) + 1);
            } else {
                hs.put(a[i], 1);
            }

            if (hs.get(a[i]) == k) {
                return a[i];
            }
        }
        return -1;

    }
        /*int kth=0;
        for(Map.Entry en:hs.entrySet()){
            int kk=(int)en.getValue();
            if(kk==k){
                kth=(int)en.getKey();
                break;
            }
        }
        return kth;*/



    public static void main(String args[]){
        int N = 7, K = 2;
        int A[] = {1, 7, 4, 3, 4, 8, 7};
        int x= getKthElement(A,N,K);
        System.out.println(x);

    }


}
