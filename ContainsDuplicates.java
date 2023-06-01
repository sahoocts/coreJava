package LeetcodeNew;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {

    public static void main(String args[]){
        int nums[] = {1,2,3};
        Set<Integer> set=new HashSet<>();
        boolean b=false;
        for(int s:nums){
            if(!set.contains(s)){
                set.add(s);
            }
            else{
                b=true;
            }
        }
        System.out.print(b);
    }
}
