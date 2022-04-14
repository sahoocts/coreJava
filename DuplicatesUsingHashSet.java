package Geeksforgeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class DuplicatesUsingHashSet {

    public static ArrayList<Integer> getDuplicates(int a[]){
        int n=a.length;
        Arrays.sort(a);
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int i=0;i<n-1;i++){
            if(a[i]==a[i+1]){
                hs.add(a[i]);
            }
        }
        ArrayList<Integer> duplicate=new ArrayList<>(hs);
        if(duplicate.size()==0){
            duplicate.add(-1);
            return duplicate;
        }
        else{
            Collections.sort(duplicate);
            return duplicate;
        }
    }

    public static void main(String args[]){
        int a[] = {2,3,1,2,3};
       // int a[] = {0,3,1,2};
        ArrayList<Integer> al=getDuplicates(a);
        for(int i=0;i<al.size();i++){
            System.out.println("::"+al.get(i));
        }

    }
}
