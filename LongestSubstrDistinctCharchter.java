package Leetcode;

import java.util.ArrayList;

public class LongestSubstrDistinctCharchter {
    static int longestSubstrDistinctChars(String S) {
        // code here
        ArrayList<Character> al = new ArrayList<>();
        int count = 0, i = 0, j = 0;
        int ans = count;//i <= j &&
        while (j < S.length()) {
            if (!al.contains(S.charAt(j))) {
                al.add(S.charAt(j));
                count = j - i + 1;
                j++;
            } else {
                al.remove(0);   //removing first element
                i++;
            }
            ans = Math.max(ans, count);
        }
        for(int k=0;k<al.size();k++){
            System.out.print(al.get(k)+",");
        }
        return ans;
    }
        public static void main(String args[]){
        String str="geeksforgeeks";
        int x=longestSubstrDistinctChars(str);
        System.out.print("str is:"+x);
    }
}
