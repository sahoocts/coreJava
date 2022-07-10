//S = "abCD"
//Output: abcd
//Explanation: The first letter (a) is
//lowercase. Hence, the complete string
//is made lowercase.

public class ChangeString {

    public static void main(String args[]){

        String str="dbCD";
        String s1=getM1(str);
        System.out.println(s1);
    }

    private static String getM1(String str) {
        String s="";
        if (str.charAt(0) >='A' && str.charAt(0) <='Z') {

            s=s+str.toUpperCase();
        }
        else{
            s=s+str.toLowerCase();
        }
        return s;
    }

}
