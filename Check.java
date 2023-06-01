package New_Leetcode;

import java.util.ArrayList;

public class Check {
    public static void main(String argsp[]){
        ArrayList<Integer> al=new ArrayList<>();
        int a[]={5,7,7,7,7,7,8,8,10};
        int t=7;
        int i=0;
        int j=a.length-1;
        while(i<j){
            if(a[i]==t){
                al.add(i);
                break;

            }
            i++;
        }
        while(i<j){
            if(a[j]==t){
                al.add(j);
                break;

            }
            j--;
        }
        System.out.print(al);
    }
}
