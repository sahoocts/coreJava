package Geeksforgeeks;

import java.util.Arrays;

public class RCh {
    static void rChar(char c[]) {
        char t[] = new char[c.length];
        Arrays.sort(c);//a b b c c
        int n = c.length;
        int j = 0;
        for(int i=0;i<n-1;i++){
            if(c[i]!=c[i+1]){
                t[j]=c[i];
                j++;
            }

        }
        t[j++]=c[n-1];
        for(int i=0;i<=j;i++){

        }

/*
        for (int i = n - 1; i > 0; i--) {
            if (c[i] != c[i - 1]) {
                t[j] = c[i];
                j++;
            }
            t[j]=c[0];*/

        }



        public static void main (String args[]){
            String str = "bbacc";
            char ch[] = str.toCharArray();
             rChar(ch);
            //System.out.print(s);
        }

    }