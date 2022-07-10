//

import java.util.ArrayList;

//N = 5, K = 3
//arr[] = {1,2,3,4,5}
//Output: 3 2 1 5 4
public class ReverseArrayInGroup {

   /* private static int[] getReverseArrayInGroup(int[] arr) {
        int k=3;
        int t[]=new int[arr.length];
        int j=0;
        for(int i=k-1;i>=0;i--){
            t[j]=arr[i];
            j++;
        }
      for(int i=k;i<arr.length;i++){
          t[j]=arr[i];
          j++;
      }
      return t;
    }

    public static void main(String args[]){
       int arr[] = {1,2,3,4,5};
       int a[]=getReverseArrayInGroup(arr);
       for(int d:a){
           System.out.print(d+" ");
       }*/


    public static void main(String args[]) {
       int arr[] = {1, 2, 3, 4, 5};
        ArrayList<Integer> all=new  ArrayList<Integer> ();
        for(int i=0;i<arr.length;i++){
            all.add(arr[i]);
        }

      //  ArrayList<Integer> al= getReverseArrayInGroup(all);
        getReverseArrayInGroup(all);
      /*  for(int i=0;i<al.size();i++){
            System.out.print(al.get(i));
        }*/


    }

//    private static ArrayList<Integer> getReverseArrayInGroup(ArrayList<Integer> arr) {
        private static void getReverseArrayInGroup(ArrayList<Integer> arr) {
       /* int i=0;
        int k=3;
        ArrayList<Integer> a=new ArrayList<Integer>();
      //  while(i<arr.size()){
            for(int j=k-1;j>=0;j--){
                a.add(arr.get(j));
            }
            for(int j=k;j<arr.size();j++){
                a.add(arr.get(j));
            }

     //   }
        return a;*/

        ArrayList<Integer> a=new ArrayList<Integer>();
            int k=3;
            int n=arr.size();
        int i = 0;
        while(i < n)
        {
            for(int j=k-1;j>=0;j--)
            {
                if(i + j >= n){
                    continue;
                }
                a.add(arr.get(i+j));
            }
            i=i+k;
        }
        arr.clear();
        for(int l=0;l<n;l++)
        {
            arr.add(a.get(l));
        }

        for(int f=0;f<a.size();f++){
            System.out.print(" "+a.get(f));

    }
    }
}