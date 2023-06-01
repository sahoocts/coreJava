package NewPrepare;

public class SpaceCount {

    public static void main(String args[]){
        /*String str="he l we  come   c";//4
        char ch[]=str.toCharArray();
        int c=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]==' '){
                c++;
            }
        }
        System.out.println(c);*/

        String str="10101";//11100
        char ch[]=str.toCharArray();
        int n=ch.length;
        char a[]=new char[ch.length];
        int k=0;

        for(int i=0;i<str.length();i++) {
            //  System.out.print();

            if (str.charAt(i) == '1') {
                //System.out.println("ok");
                a[k] = str.charAt(i);
                k++;
            }
        }
        while(k<n){
            a[k]='0';
            k++;
        }

        for(char f:a){
            System.out.print(f);
        }

            /*if(str.charAt(i)!='1'){
                //System.out.println("ok");
                a[k]=str.charAt(i);
                k++;
            }*/



    }
}
