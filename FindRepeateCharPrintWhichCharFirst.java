public class FindRepeateCharPrintWhichCharFirst {
    public static void main(String args[]){
        String s="geeksforgeeks";
        getChar1(s);

    }

    private static void getChar1(String S) {
        char ch[]=S.toCharArray();
        int fre[]=new int[26];
        for(int i=0;i<ch.length;i++){
           // char c=ch[i];
            //int index=c-'a';
           // fre[index]=fre[index]+1;
            fre[ch[i]-'a']=fre[ch[i]-'a']+1;
        }
        for(int i=0;i<ch.length;i++){
           if(fre[ch[i]-'a']>1){
               System.out.println(ch[i]);
               break;
           }
        }
    }
}
