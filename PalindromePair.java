import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Pairr{
    int a;
    int b;
    Pairr(int a,int b){
        this.a=a;
        this.b=b;
    }
}
public class PalindromePair {
    static boolean isPalindrome(String str)
    {
        int len = str.length();
        // compare each character from starting
        // with its corresponding character from last
        for (int i = 0; i < len/2; i++ )
            if (str.charAt(i) != str.charAt(len-i-1))
                return false;

        return true;
    }

    // Function to check if a palindrome pair exists
   // static boolean checkPalindromePair(List<String> vect)
    static Pairr[] checkPalindromePair(List<String> vect)
    {
        ArrayList<Pairr> al=new ArrayList<Pairr>();
        // Consider each pair one by one
        for (int i = 0; i< vect.size()-1; i++)
        {
            for (int j = i+1; j< vect.size() ; j++)
            {
                String check_str = "";

                // concatenate both strings
                check_str = check_str + vect.get(i) + vect.get(j);

                // check if the concatenated string is
                // palindrome
                if (isPalindrome(check_str)==true){
                    al.add(new Pairr(i,j));
                   // return true;
                }

                check_str = vect.get(j) + vect.get(i);

                // check if the concatenated string is
                // palindrome
                if (isPalindrome(check_str)==true){
                   // return true;
                    al.add(new Pairr(i,j));
                }

            }
        }

       // return false;
        Pairr p[]=new Pairr[al.size()];
        for(int i=0;i<p.length;i++){
            p[i]=new Pairr(al.get(i).a,al.get(i).b);
        }
    return p;
    }

    // Driver code
    public static void main(String args[])
    {
        List<String> vect = Arrays.asList("geekf", "geeks", "or","keeg", "abc", "bc");

       /* if (checkPalindromePair(vect) == true)
            System.out.println("Yes");
        else
            System.out.println("No");*/

           Pairr[] p1= checkPalindromePair(vect);
           for(int i=0;i<p1.length;i++){
               System.out.println(p1[i].a+","+p1[i].b);
           }
    }

}
