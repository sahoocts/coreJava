package Java8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AnaGram {
    public static int remAnagrams(String s1,String s2)
    {
        //add code here.
        if (s1.equals(s2)) {
            return 0;
        }
        int length1 = s1.length();
        int length2 = s2.length();
        int [] frequency = new int [26];
        int countOfStringToDelete = 0;
        for (char firstStringChar : s1.toCharArray()) {
            frequency[firstStringChar - 'a'] += 1;
        }
        for (char secondStringChar : s2.toCharArray()) {
            frequency[secondStringChar - 'a'] -= 1;
        }
        for (int freq : frequency) {
            // System.out.print(freq + " ");
            if (freq != 0) {
              //  countOfStringToDelete= countOfStringToDelete+Math.abs(freq);
                countOfStringToDelete++;
            }
        }
        return countOfStringToDelete;
    }


    public static void main(String args[]){
            String S1 = "bcadeh";
            String S2 = "hea";
       int x= remAnagrams(S1,S2);
       System.out.println(x);
}
}