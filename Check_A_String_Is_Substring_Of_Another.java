package NewTry;

public class Check_A_String_Is_Substring_Of_Another {

    // Returns true if s1 is substring of s2
    static int isSubstring(
            String s1, String s2)
    {
        int M = s1.length();
        int N = s2.length();
System.out.println(":::"+(N-M));
        // A loop to slide pat[] one by one
        for (int i = 0; i <= N - M; i++)
        {
            int j;
            /* For current index i, check for
               pattern match */
            for (j = 0; j < M; j++)
                if (s2.charAt(i + j) != s1.charAt(j))
                    break;
            if (j == M)
                return i;
        }
        return -1;
    }

    // Driver code
    public static void main(String args[])
    {
       // String s1 = "for";
        String s1 = "wxy";
        String s2 = "geeksforgeeks";
        int res = isSubstring(s1, s2);
        if (res == -1)
            System.out.println("Not present");
        else
            System.out.println(
                    "Present at index " + res);
    }
}
