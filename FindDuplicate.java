package TwentySeven;
import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicate {
    private static ArrayList<Integer> getDuplicates(int[] a) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        int n=a.length;
        int aa[]=new int[n];
        for(int i=0;i<n;i++){
            aa[a[i]]++;
        }
        for(int i=0;i<n;i++){
            if(aa[i]>1){
                al.add(i);
            }
        }
 if(al.size()==0){
     al.add(-1);
     return al;
 }
 else{
     Collections.sort(al);
     return al;
 }

     //  List<Integer> d= al.stream().distinct().collect(Collectors.toList());
        //System.out.print(d);
     //   return (ArrayList<Integer>) d;
        /*int n=a.length;
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=i;j<n;j++){
                if(a[i]==a[j]){
                    c++;
                }

            }
            if(c==2){
                int v=a[i];
                al.add(a[i]);
            }

        }
        if(al.size()==0){
            al.add(-1);
            return al;
        }
       else{
           return al;
        }*/
    }
    public static void main(String args[]){
       int a[] = {2,3,1,2,3};
       // int a[] = {2,7,1,8,3};
        ArrayList<Integer> a1=getDuplicates(a);
        System.out.print(a1);
    }


}
