package PrevPractice;

import java.util.ArrayList;
import java.util.Locale;

public class FIvSeries {
    public static void main(String args[]) {

      String str="saroj kumar sahoo";
      String st[]=str.split(" ");
      int n=st.length;
      for(int i=st.length-1;i>=0;i--){
          System.out.println(st[i].substring(0,1));
      }
    }
}
