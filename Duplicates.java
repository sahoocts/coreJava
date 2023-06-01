package HackersRank_06062022;

import java.util.Arrays;

public class Duplicates {

    public static void main(String args[]){
        String str="efeacdab";
        char ch[]=str.toCharArray();
        char tmp[]=new char[ch.length];
        Arrays.sort(ch);
        int k=0;
        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<=i;j++){
                if(ch[i]!=ch[j]){
                    tmp[k]=ch[i];
                    k++;
                }
            }

        }
       /* int i=0;
        int j=1;
        while(i<ch.length && j<ch.length){
            if(ch[i]!=ch[j]){
                ch[k]=ch[i];
                k++;
            }
            i++;
            j++;

        }*/
        System.out.print("hello");
        for(char c:tmp){
            System.out.print(c);
        }

    }
}
