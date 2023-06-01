package PrevPractice;

public class ReptChar {
    public static char firstRepeat(String st){
        char c[]=st.toCharArray();
        char chhh=' ';
        int b[]=new int[c.length];
        for(int i=0;i<c.length;i++){
            char ch=c[i];
            int digit=(ch-'a');
            b[digit]=b[digit]+1;
        }

        for(int i=0;i<b.length;i++){
            int di=c[i]-'a';
            if(b[di]>1){
                chhh= (char) b[di];
                System.out.print(c[i]);
                break;
            }
          //  char chh=(char)(b[i]+'a');

        }


       // for(int i=0;i<)
        // return 1;
        return chhh;
    }



    public static void main(String[] args) {
        String str="abbcccdd";
        firstRepeat(str);
    }
}
