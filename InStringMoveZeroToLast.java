package Others;

public class InStringMoveZeroToLast {
    public static void main(String args[]){
        String str="10101";
        char ch[]=str.toCharArray();
        char c1[]=new char[ch.length];
        int k=0;
        for(int i=0;i<ch.length;i++){

            if(ch[i]=='1'){
                c1[k]=ch[i];
                k++;
            }
        }
        while(k<ch.length){
            c1[k]='0';
            k++;
        }
        String s=String.valueOf(c1);

          System.out.print(s);
      }
    }

