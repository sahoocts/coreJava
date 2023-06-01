package LeetcodeNew;

import java.util.HashSet;
import java.util.Set;

//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.
public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s){
        Set<Character> set=new HashSet<>();
        int i=0;
        int j=0;
        int max=0;
        while(j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                max=Math.max(max,set.size());

            }
            else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }

    public static void main(String args[]){

        String s="abcabcbb";
        int n=lengthOfLongestSubstring(s);
        System.out.print(n);
    }

}
