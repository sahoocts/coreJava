package HackersRankk;

import java.util.Arrays;
import java.util.Comparator;
//Largest Number formed from an Array
public class LargeNumberFormedArray {

    public static void main(String args[]){
        LargeNumberFormedArray ln = new LargeNumberFormedArray();
        int arr[] = { 7, 58, 87, 2, 16, 34, 54, 0, 90 };
       String st= ln.largestNumber(arr);
       System.out.println(st);
    }

    private String largestNumber(int[] arr) {
        String s[]=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            s[i]=String.valueOf(arr[i]);
        }

        Arrays.sort(s,new largeNumber());
        String larNum="";
        for(String ss:s){
            larNum+=ss;
        }
        return larNum;
    }


}

class largeNumber implements Comparator<String>{

public int compare(String s1,String s2){
    return s1.compareTo(s2);
}
}
