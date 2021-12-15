package LogicImplemented;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTripletsWithGivenDum {

    public static void main(String args[]){
        int a[]={1,2,-3,4,-2,-1};
      System.out.println(FindTripletsWithGivenDum.getTriplet(a));
        System.out.println("hhh");
       //FindTripletsWithGivenDum.getTriplet(a);
    }
   // private static void getTriplet(int[] a) {
//List<List<Integer>>
   private static List<List<Integer>> getTriplet(int[] a){
        List<List<Integer>> triplet=new ArrayList<>();
        int sum=1;

        Arrays.sort(a);//-3,-2,-1,1,2,4
        int i=0;
        int j=a.length-1;
        while(i<j){

            if(sum==a[i]+a[j]){
                System.out.println(a[i]+"::"+a[j]);
                triplet.add(Arrays.asList(a[i],a[j]));
                i++;
                j--;
            }
            else if(sum>a[i]+a[j]){
                i++;
            }
            else{
                j--;
            }
        }
return triplet;
    }
}
