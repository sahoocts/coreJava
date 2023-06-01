package Leetcode;

public class CommonPrefix {
    public static void main(String args[]){
        String str1="geeksforgeeks";
        String str2="geeks";
        int n1=str1.length();
        int n2=str2.length();
         String r="";
        for(int i=0,j=0;i<n1 && j<n2;i++,j++){
            //for(int j=0;j<n2;j++)
             {
                if(str1.charAt(i)!=str2.charAt(j)){
                    break;
                }
                r=r+str1.charAt(i);
            }
        }
        System.out.print(r);
    }
}
