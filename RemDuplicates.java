package NewClassAdded;

import java.util.Arrays;

public class RemDuplicates {
    public static void main(String args[]){
        String s="gfg";//fgg
        char ch[]=s.toCharArray();
        String rs="";
       // Arrays.sort(ch);
        for(int i=0;i<ch.length-1;i++){
            if(ch[i]!=ch[i+1]){
                rs=rs+ch[i];
            }
        }
       rs=rs+ch[ch.length-1];
        System.out.print("s---- is"+rs);

    }
}
