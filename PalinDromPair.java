

public class PalinDromPair {

    static boolean isPalindrom(String s1){
        int n1=s1.length();
        for(int i=0;i<n1/2;i++)
            if(s1.charAt(i)!=s1.charAt(n1-i-1))
                return false;
            return true;

    }

    private static boolean getM(String[] st) {
        int n=st.length;
        System.out.println(n);
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                String s="";
                s=st[i]+st[j];
                if(isPalindrom(s)){
                    return true;
                }
                s=st[j]+st[i];
                if(isPalindrom(s)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        String st[]={"abc","a","ab"};
        if(getM(st)==true){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

    }


}
