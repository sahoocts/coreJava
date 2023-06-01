package NewClassAdded;

public class Solution {

    public static void main(String args[]) {
        String s = "acaaabbbacdddds";
        //  String s="geeksforgeeks";
        String s11 = rremove(s);
        System.out.println(s11);
        System.out.print(0/3);
    }

    private static String rremove(String s) {
        // code here
        String s1 = "";
        while (s.length() != s1.length()) {
            s1 = s;
            s = rem(s);
        }
        return s;
    }

   private static String rem(String s) {
        StringBuilder ans = new StringBuilder();
        //String ans="";
        int n = s.length();
        int i = 0;
        while (i < n) {
            if (i < n - 1 && s.charAt(i) == s.charAt(i + 1)) {
                while (i < n - 1 && s.charAt(i) == s.charAt(i + 1)) {
                    i++;
                }
            } else {
                ans.append(s.charAt(i));
            }

            i++;
        }

        return ans.toString();
    }
}