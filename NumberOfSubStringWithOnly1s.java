package Leetcode;

public class NumberOfSubStringWithOnly1s {

    public static void main(String args[]){
        String s="0110111";//Here sub string 1 are 9 substring
       // String s="11111";
        int x=countSubString(s);
        System.out.print(x);
    }

    private static int countSubString(String s) {
        int res=0;
        int count=0;
        for(int i=0;i<s.length();i++){

            /*count=s.charAt(i)=='1' ? count+1 : 0;
            res=(res+count);*/
            if(s.charAt(i)=='1'){
               count=count+1;
                //count++;
            }
            else{
                count=0;
            }
            res=(res+count);

        }
        return res;
    }
}
