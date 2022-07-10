public class RepeatedSubstring {

    static boolean repeatedSubstringPattern(String s) {

     //   public static boolean repeatedSubstringPattern (String s){
            String str = s + s;
            return str.substring(1, str.length() - 1).contains(s);
        }
        public static void main (String args[]){

        //static  int x;

            boolean x=repeatedSubstringPattern("abaaba");
         //   String s="abaaba";
            //String s1=s.substring(1,s.length()-1);
            //System.out.println(s1);
            //abaaba:true
            //ababb//false
            System.out.println(x);

        }
    }
//Input: s = "abab"
//Output: true
//Explanation: It is the substring "ab" twice.