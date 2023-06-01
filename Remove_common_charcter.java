package Geeksforgeeks;

import java.util.Arrays;

public class Remove_common_charcter {
    static int getCharRemove(char ch[]){
        char temp[]=new char[ch.length];
        int j=0;
        for(int i=0;i<ch.length-1;i++){
            if(ch[i]!=ch[i+1]){
                temp[j++]=ch[i];
            }
        }
        temp[j++]=ch[ch.length-1];
        for(int i=0;i<j;i++){
            ch[i]=temp[i];
        }
        return j;
    }

    public static void main(String args[]){
        String str="aabccd";
        char ch[]=str.toCharArray();
         Arrays.sort(ch);
        int k=getCharRemove(ch);
        for(int i=0;i<k;i++){
            System.out.print(ch[i]);
        }

    }
}
