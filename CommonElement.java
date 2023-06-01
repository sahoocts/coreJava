package New_Leetcode;

import java.util.ArrayList;
import java.util.HashSet;

public class CommonElement {

    private static void getCommonElement(int a[],int b[],int c[]){

       // HashSet<Integer> hs=new HashSet<>();
      //  HashSet<Integer> hss=new HashSet<>();
        ArrayList<Integer> al=new ArrayList<>();
        ArrayList<Integer> all=new ArrayList<>();
        ArrayList<Integer> common=new ArrayList<>();
       // int a[]=new int[2];
        for(int i=0;i<a.length;i++){
            al.add(a[i]);
        }
        for(int j=0;j<b.length;j++){
            if(al.contains(b[j])){
                all.add(b[j]);
            }
        }


        for(int k=0;k<c.length;k++){
            if(all.contains(c[k])){
               // System.out.println(all.get(c[k]));
                common.add(c[k]);

            }
        }

 for(int i=0;i<common.size();i++){
     System.out.println(common.get(i));
 }
    }
    public static void main(String args[]){
      int  ar1[] = {1, 5, 10, 20, 40, 80};
      int  ar2[] = {6, 7, 20, 80, 100};
      int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120};
      getCommonElement(ar1,ar2,ar2);
    }
}
