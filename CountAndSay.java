package Leetcode;

public class CountAndSay {

   // private static String countAndSay(int n) {
        /*String say="1";
        for(int i=1;i<n;i++){
            say=process(say);
        }
        return say;*/
        public static String countAndSay(int n) {
            String say = "1";
            for (int i = 1; i < n; i++) {
                say = process(say);
            }
            return say;
        }
    private static String process(String before) {
        StringBuilder after = new StringBuilder();
        int i = 0;
        while (i < before.length()) {
            int j = i;
            // To count same numbers
            while (j < before.length() && before.charAt(i) == before.charAt(j)) {
                j++;
        }
                // Add count
                after.append(j - i);
                // Add number
                after.append(before.charAt(i));
                i = j;
           // }
        }
        return after.toString();
    }
    public static void main(String args[]){
        int n=4;
        String s=countAndSay(n);
        System.out.print(s);
    }
}
