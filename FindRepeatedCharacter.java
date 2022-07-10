public class FindRepeatedCharacter {

    public static void main(String args[]){
        int c[]=new int[26];
        String s="ssbcd";
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            int index=c1-'a';
           // int c1='a'-s.charAt(i);
            c[index]=c[index]+1;
        }
        for(int i=0;i<c.length;i++){
            if(c[i]>=2){
                System.out.println(c[i]);
            }
        }
    }
}
