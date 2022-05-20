package Eighteen_four;

import java.util.HashMap;
import java.util.Scanner;

public class Count_Subarrays_with_Equal_0_and_1 {
//{0,0,1,0,1,0};
    //Here 0=-1;and 1=1;
    //
    public static int solution(int a[]){
        int ans=0;
        HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
        int sum=0;
        hs.put(sum,1);
       // hs.put(0,1);
        for(int b:a){
            if(b==0){
                sum+=-1;
            }
            else{
                sum+=+1;
            }
            if(hs.containsKey(sum)){
                ans=ans+hs.get(sum);
                hs.put(sum,hs.get(sum)+1);
            }
            else{
                hs.put(sum,1);
            }
        }
        return ans;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
       // int arr[]=new int[n];
       // for(int i=0;i<n;i++){
       //     arr[i]=sc.nextInt();
      //  }

        int arr[]={0,0,1,0,1,0};
     System.out.println(solution(arr));
    }
}
