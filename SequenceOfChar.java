public class SequenceOfChar {

    public static void main(String args[]){
        //A is a subsequence of B.
        String A="gksrek";
        String B="geeksforgeeks";

       // String A="AXY ";
       // String B="YADXCP";
        //Explanation: A is not a subsequence of B
        //as 'Y' appears before 'A'.
        boolean d=IsSeq(A,B);
        System.out.println(d);
    }

    private static boolean IsSeq(String a, String b) {
        int n1=a.length();
        int n2=b.length();
        int s1=0;
        int c=0;
        for(int i=0;i<n1;i++){
            for(int j=s1;j<n2;j++){
                if(a.charAt(i)==b.charAt(j)){
                   // return true;
                    c++;
                    s1=j+1;
                    break;
                }
            }
        }
        if(c==n1){
           // System.out.println("yes");
            return true;
        }
        else{
            //System.out.println("no");
            return false;
        }

    }

}
