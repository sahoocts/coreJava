import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindtheContiguesSubarray {

    private static void getCont(int[] arr) {
        int n=arr.length;
        /*for(int i=0;i<n;i++){
            int t=0;
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }*/
       /* for(int d:arr){
            System.out.print(d+",");
        }*/
//1,2,3,4,5,7,8,9,13,14
       /* int i=0;
        int j=1;

        int max=0;*/
       /*while(n>0 && j<n-1){
           if(arr[i]==arr[j]-1){
               c++;
           }

           i++;
           j++;
       }*/
        int c=1;
        int max=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<=i+1;j++){

                if(arr[i]==arr[j]-1){
                    c++;
                    if(c>max){
                        max=c;
                    }
                }
                else{
                    c=1;
                }
            }
        }
System.out.println(max);

       /* List<Integer> a=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            a.add(arr[i]);
        }*/
        /*for(int i=0;i<a.size();i++){
            System.out.println(a.get(i));
        }*/

      //  List<Integer> a= Arrays.asList(arr);
       /*List<Integer> l= a.stream().sorted((i1, i2)->(i1<i2) ? -1:(i1>i2) ? 1:0).collect(Collectors.toList());
        l.forEach(System.out::println);*/

    }
    public static void main(String args[]){
       // Integer arr[]={7,8,9,3,5,4,2,1,13,14};
        int arr[]={1,2,3,4,5,7,8,9,10,11,12,13};
        getCont(arr);
    }


}
