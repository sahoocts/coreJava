package LogicImplemented;

public class lengthOfLongestSubstring {

    private static int lengthOfLongestSubstring(String s){
        int res=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(isCheck(s,i,j)){
                    res=Math.max(res,j-i+1);
                }
            }
        }
        return res;
    }
    public static boolean isCheck(String s,int start,int end){
        int temp[]=new int[128];
        for(int i=start;i<=end;i++){
            char c=s.charAt(i);
            temp[c]++;
            if(temp[c]>1){
                return false;
            }
        }
        return true;
    }



    public static void main(String args[]){
        String s = "abcdd";
        int x=lengthOfLongestSubstring(s);
        System.out.println("The value is"+x);

    }
}
