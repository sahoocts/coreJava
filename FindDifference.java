package Leetcode;

public class FindDifference {

    public static void main(String args[]){
        String s = "abcd", t = "abcde";
        char c=findTheDifference(s,t);
        System.out.print(c);
    }
    private static char findTheDifference(String s, String t) {
        int sum=0;
        for(int i=0;i<t.length();i++){
            sum=sum+t.charAt(i);
        }
        for (int i=0; i< s.length(); i++){

            sum-= s.charAt(i);
        }
        return (char)sum;
    }
}
