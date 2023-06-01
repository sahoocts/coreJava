package NewClassAdded;

public class RecursivelyRemAlAdjacentDup {

    public static void main(String args[]) {
        String s = "acaaabbbacdddds";
        //  String s="geeksforgeeks";
        String s11 = removeDupAdj(s);
        System.out.println(s11);
    }

    private static String removeDupAdj(String s) {
        String s1 = "";
        while (s.length() != s1.length()) {
            s = res(s);
        }
           return s;
    }

    private static String res(String s) {
        int n = s.length();
        //char c[]=s.toCharArray();
        StringBuilder rs = new StringBuilder();
        int i = 0;
        while (i < n) {
            // if(s.charAt(i)!=s.charAt(i+1)){
            //  rs=rs+s.charAt(i);
            //  i++;
            //  }
            if (i < n - 1 && s.charAt(i) == s.charAt(i + 1)) {
                while (i < n - 1 && s.charAt(i) == s.charAt(i + 1)) {
                    i++;
                }
            } else {
                rs.append(s.charAt(i));
            }
            i++;
        }
        return rs.toString();
    }
}



