package Others;

public class StringIndex {
    public static void getStringMerge(String s[]){
        for(int i=0;i<s.length;i++){
           char c[]=s[i].toCharArray();
           getCharr(c);
        }
    }
    private static void getCharr(char[] c) {
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
    }

    public static void main(String args[]){
       // String str[]={"CRICKET","SOCCER","HOCKEY","BADMINTON","VOLLEYBALL"};
        String str[]={"CRICKET","SOCCER","HOCKEY"};
        getStringMerge(str);
    }
}
