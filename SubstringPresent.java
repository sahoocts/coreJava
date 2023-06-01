package NewPrepare;

public class SubstringPresent {
    static int CharPresent(String str1,String str2){
        int n1=str1.length();
        int n2=str2.length();
        int m=n1-n2;
        for(int i=0;i<m;i++){
            int j;
            for(j=0;j<n2;j++){
                if(str1.charAt(i+j)!=str2.charAt(j)){
                    break;
                }

            }
            if(j==n2){
                return 1;
            }

        }

        return -1;
    }
    public static void main(String[] args) {
        String str1="geeksforgeeks";
        String str2="for";
        int x= CharPresent(str1,str2);
        System.out.println("x is"+x);
    }
}
