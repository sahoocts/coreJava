package LeetcodeNew;

public class LongestContineousCharacters {
    public static void main(String args[]){
        String s="abcdd";
        getCon(s);
    }

    private static void getCon(String s) {
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(isChek(s,i,j)){

                }
                else{
                    System.out.print("i is"+i);
                    System.out.print("j is"+j);
                }
            }
        }
    }

    private static boolean isChek(String s, int start, int end) {
        int t[]=new int[128];
      //  int st=start;
      //  int ed=0;
        for(int i=start;i<=end;i++){
            char c=s.charAt(i);
            t[c]++;
            if(t[c]>1){
               // ed=end-1;
                return false;
               // break;
            }
        }
        return true;
    }
}
