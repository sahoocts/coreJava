package Small_Program;

public class stringContainsAllTheDigits {

    public static boolean allDisit(String str,int n){
        return true;

    }
    public static void main(String args[]){

        String str = "Geeks12345for69708";
        int len=str.length();
        if(allDisit(str,len)){
            System.out.println("yes");
        }
        else{
            System.out.println("NO");
        }
    }
}
