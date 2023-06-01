package NewPrepare;



public class Longest_Common_Prefix_using_Word {
    //
    static String getLongestCommonPrefix(String str,String s){

        int n1=str.length();
        int n2=s.length();
        String pre="";
        for(int i=0,j=0; i<=n1-1 && j<=n2-1;i++,j++){
            if(str.charAt(i)!=s.charAt(j)){
                break;
            }
            pre=pre+str.charAt(i);
        }
        return pre;
    }

    static String getCommonPrefix(String a[],int n){
        String prefix= a[0];
        for(int i=1;i<n;i++){
            prefix =getLongestCommonPrefix(prefix,a[i]);
        }
        return prefix;
    }

    public static void main(String args[]){
        String arr[] = {"geeksforgeeks", "geeks",  "geek", "geezer"};
        int n=arr.length;
        String ss= getCommonPrefix(arr,n);
        System.out.println(ss);

    }
}
