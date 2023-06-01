package NewPrepare;

public class SpaceCnt {
    public static void main(String args[]) {
        String str = "he l we  come   c";//4
        char ch[] = str.toCharArray();
       /* for(char c:ch){
            System.out.print(c);
        }*/
        int c = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ') {
                c++;
            }
        }
        //System.out.println(c);
    }
}
