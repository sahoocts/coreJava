package Practice;

public class ReverseVowelExample {

    public static void main(String args[]){
        String name="anglkum";
        char d[]=getV(name);
        for(char f:d){
            System.out.print(f);
        }
    }
    private static char[] getV(String name) {
        char ch[]=name.toCharArray();
        char c[]={'n'};
        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[j]=='a' || ch[j]=='i'){
                    char v=ch[i];
                    ch[i]=ch[j];
                    ch[j]=v;
                    return ch;

                }

            }
        }

        return c;
    }

}
