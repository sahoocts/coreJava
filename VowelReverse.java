package Practice;

public class VowelReverse {
    public static void main(String args[]){
        String name="anilkum";
       String d= getVowel(name);
       System.out.print(d);
    }
    private static String getVowel(String name) {
        int n=name.length();
        char c[]=name.toCharArray();
    //    char cc;
        int i=0;
        int j=c.length-1;
     //   boolean v1=false;
     //   boolean v2=false;
        String s="";
        while(i<j){
             if(!getVchar(c[i])){
                 i++;
                 continue;
             }
            if(!getVchar(c[j])){
                j--;
                continue;
            }
            char c2=c[i];
            c[i]=c[j];
            c[j]=c2;
            i++;
            j--;
            s=String.valueOf(c);

        }
        return s;
    }

    private static boolean getVchar(char c) {
        return (c=='a' || c=='e' || c=='i'|| c=='o'||c=='u');
           // return true;

       // return false;
    }

}
