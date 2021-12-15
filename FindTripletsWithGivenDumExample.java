package LogicImplemented;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTripletsWithGivenDumExample {
    public static void main(String args[]){
        int a[]={1,2,-3,4,-2,-1};
        System.out.println(FindTripletsWithGivenDumExample.getTriplet1(a,1));
      //  System.out.println("hhh");
        //FindTripletsWithGivenDum.getTriplet(a);
    }
    // private static void getTriplet(int[] a) {
//List<List<Integer>>
    private static List<List<Integer>> getTriplet1(int[] a,int target){
        List<List<Integer>> triplet=new ArrayList<>();
        int sum=1;
        Arrays.sort(a);//-3,-2,-1,1,2,4

        for(int k=0;k<a.length;k++){
            sum=target-a[k];
            int i=k+1;
            int j=a.length-1;
            while(i<j){
                if(sum==a[i]+a[j]){
                    System.out.println(a[i]+"::"+a[j]);
                    triplet.add(Arrays.asList(a[i],a[j],a[k]));
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

        }
        return triplet;
    }
}
