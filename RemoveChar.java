import javax.xml.stream.events.Characters;
import java.util.HashSet;
import java.util.*;
public class RemoveChar {
    static String s="";
 private static void grtRemove(String str1, String str2) {
     for(int i=0;i<str1.length();i++){
         if(!str2.contains(Character.toString(str1.charAt(i)))){
           s+=str1.charAt(i);
         }
     }

       /* if(str1!=str2 && str1.equals(str1.toLowerCase()) && str2.equals(str2.toLowerCase())){
            Set<Character>set=new HashSet<>();
            for(int i=0;i<str2.length();i++){
                set.add(str2.charAt(i));
            }

            for(int i=0;i<str1.length();i++){
                if(!set.contains(str1.charAt(i))){
                    s+=str1.charAt(i);
                }
            }

        }
        else{
            System.out.println("not");
        }*/
      System.out.println(s);
     //HashMap<Character, Boolean> hs=new HashMap<Character, Boolean>();
    // return s;
    }





    public static void main(String args[]){
       String str1 = "occurrence";
       // String str2 = "car";
        String str2 = "cat";
        //"ouene"
        grtRemove(str1,str2);
    }




}
