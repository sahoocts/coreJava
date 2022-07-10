public class stringsAreRotationsOfEachOtherOrNot {

    public static void main(String args[]){
        String str1="ABACD";
        String str2="CDABA";
        if(str1.length()!=str2.length()){
            System.out.println("Not present");
        }
        if((str1+str2).contains(str2)){
            System.out.println("present");
        }
    }
}
