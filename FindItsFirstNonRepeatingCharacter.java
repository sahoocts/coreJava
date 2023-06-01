package Small_Program;

public class FindItsFirstNonRepeatingCharacter {

    static final int no_of_char=256;
    static char count[]=new char[no_of_char];
    static void getChar(String str1){
        for(int i=0;i<str1.length();i++){
            count[str1.charAt(i)]++;
        }
    }
    static int firstNonRepeating(String str){
        getChar(str);
        int index=-1,i;
        for(i=0;i<str.length();i++){
            if(count[str.charAt(i)]==1){
                index=i;
                break;

            }
        }
return index;
    }

    public static void main(String args[]){
        String str = "gaaksforgeeks";
        int index=firstNonRepeating(str);
        System.out.println("char is:"+str.charAt(index));
      //  getChar(str);
    }
}
