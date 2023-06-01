package PrevPractice;

public class FirstRepeat {
    public static void main(String args[]){
        String str="abccd";
        int fre[]=new int[26];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int digit=ch-'a';
            fre[digit]=fre[digit]+1;
          //  System.out.print(digit);
        }

        for(int i=0;i<str.length();i++){
           // char c=' ';
            char c1=str.charAt(i);
            int di=c1-'a';
           // if(fre[di]==1){//first non repeating char
            if(fre[di]>1){//first repeating char
                System.out.print(str.charAt(i));
                break;
            }

        }

    }
}
