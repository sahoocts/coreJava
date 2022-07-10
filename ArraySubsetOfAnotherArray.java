import java.util.HashMap;

public class ArraySubsetOfAnotherArray {

    public static void main(String args[]){
        long  a1[] = {11, 1, 13, 21, 3, 7};
        long a2[] = {11,1};
        String x=getArraySubsetOfAnotherArray(a1,a2);
        System.out.print(x);
    }

    private static String getArraySubsetOfAnotherArray(long[] a1, long[] a2) {

        int c=0;
        int n=a2.length;
        String st=" ";
        HashMap<Long,Long> hs=new HashMap<>();
        for(int i=0;i<a1.length;i++) {
            if (hs.containsKey(a1[i])) {
                hs.put(a1[i], hs.get(a1[i]) + 1);
            } else {
                hs.put(a1[i], 1L);
            }
        }
         for(int i=0;i<a2.length;i++){
             if(hs.containsKey(a2[i])){
                 c++;
             }

         }
        if(c==n){
            st="Yes";
        }

return st;
    }
}
