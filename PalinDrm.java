

public class PalinDrm {
     static boolean getM(char[] ch, int len) {
       // int j = len - 1;
         System.out.println(len);
        for (int i = 0; i < len / 2; i++)
            if (ch[i] != ch[len-i-1])
                return false;

      return true;

    }


    public static void main(String args[]){
       // System.out.println(";ll");
        String st="abccbas";
        char ch[]=st.toCharArray();
        int len=ch.length;
        boolean x=getM(ch,len);
        System.out.println(x);


    }


}
