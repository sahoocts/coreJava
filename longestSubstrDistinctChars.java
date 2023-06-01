package NewPrepare;

import java.util.ArrayList;

public class longestSubstrDistinctChars {
    static int longestSubstrDistinctChars(String S){
        // code here
        ArrayList<Character> al = new ArrayList<>();
        int count=0,i=0,j=0;
        int ans = count;
        while(i<=j && j<S.length()){

            if(!al.contains(S.charAt(j))){
                al.add(S.charAt(j));
                count = j-i+1;
                j++;
            }
            else{
                al.remove(0);
                i++;
            }
            ans = Math.max(ans,count);
        }
        return ans;
    }
    public static void main(String args[]){
        String S = "geeksforgeeks";
        int x=longestSubstrDistinctChars(S);
        System.out.println(x);
    }
}
