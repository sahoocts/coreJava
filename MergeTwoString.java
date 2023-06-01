package NewPrepare;

public class MergeTwoString {

    public static void main(String args[]){
        // String S1 = "Hello";
        String S1 = "He";
        String S2 = "Byea";
        getMerge(S1,S2);
    }

    private static void getMerge(String s1, String s2) {

        int i=0;
        int j=0;
        String s="";
       /* while(i<s1.length() && j<s2.length()){
            s=s+s1.charAt(i)+s2.charAt(j);
            i++;
            j++;
        }*/
        while(i<s1.length()){
            s=s+s1.charAt(i);
            i++;
        }

        while(j<s2.length()){
            s=s+s2.charAt(j);
            j++;
        }
        System.out.print(s);
    }
}
