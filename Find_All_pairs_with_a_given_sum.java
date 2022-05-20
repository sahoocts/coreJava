package nighteen_four;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

 class pair {
    long first, second;

    public pair(long first, long second) {
        this.first = first;
        this.second = second;
    }
}
     class Find_All_pairs_with_a_given_sum {

         static pair[] allPairs(long A[], long B[], long N, long M, long X) {
            // Your code goes here
            ArrayList<pair> ans = new ArrayList<pair>();
            Arrays.sort(A);
            Arrays.sort(B);

            Set<Long> s = new HashSet<Long>();
            for (int i = 0; i < M; i++) {
                s.add(B[i]);
            }
            for (int i = 0; i < N; i++) {
                long diff = X - A[i];
                if (s.contains(diff)) {
                    //p.add(diff,B[i]);
                    ans.add(new pair(A[i], diff));
                }
            }
            int n = ans.size();
            pair p[] = new pair[n];
            for (int i = 0; i < n; i++) {
                p[i] = new pair(ans.get(i).first, ans.get(i).second);
            }
            return p;
        }

    public static void main(String args[]) {

        long A[] = {1, 2, 4, 5, 7};
        long B[] = {5, 6, 3, 4, 8};
        int X = 9;
        int N = A.length;
        int M = B.length;
        pair dd[] = allPairs(A, B, N, M, X);
       for(int i=0;i<dd.length;i++){
           System.out.print(dd[i].first+"::"+dd[i].second);
       }



    }
}