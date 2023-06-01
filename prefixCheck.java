package NewPrepare;

public class prefixCheck {
    public static void main(String args[]){
        String arr[] = {"geeksforgeeks", "geeks",  "geek", "geezer"};
        int n=arr.length;
        String s=getCommonPrefix(arr,n);
        System.out.println(s);
    }

    private static String getCommonPrefix(String[] arr, int n) {

        String prefix=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix=getPrefix(prefix,arr[i]);
        }
       return prefix;
    }


    private static String getPrefix(String str1,String str2){
        String pre="";
        for(int i=0,j=0;i<str1.length() && j<str2.length();i++,j++){
            if(str1.charAt(i)!=str2.charAt(j))
                break;
            else{
                pre=pre+str1.charAt(i);
            }
        }
        return pre;
    }
}
