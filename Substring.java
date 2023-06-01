package NewPrepare;

public class Substring {

    static int getSub(String s1,String s2){
        int n1=s1.length();
        int n2=s2.length();
        int m=n1-n2;
        for(int i=0;i<m;i++){
            int j;
            for(j=0;j<n2;j++){
                if(s1.charAt(i+j)!=s2.charAt(j)){
                    break;
                }
            }
            if(j==n2){
                return i;
            }

        }
    return -1;
    }

    public static void main(String args[]){
        String s1="geeksforgeeks";
        String s2="for";
        int x=getSub(s1,s2);
        if(x == -1){
            System.out.print("not");
        }
        else{
            System.out.print("present");
        }

    }
}
