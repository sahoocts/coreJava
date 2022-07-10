public class MaximumChar {
    //find the first repeated char
    private static char hetChar(String str) {
        char ch[]=str.toCharArray();
        int fre[]=new int[26];
        for(int i=0;i<ch.length;i++){
            char c=ch[i];
            int index=c-'a';
           // fre[index]=fre[index]+1;
            fre[index]++;
        }
        int max=-1;
        int ans=0;
        for(int i=0;i<26;i++){
            if(max<fre[i]){
                max=fre[i];
                ans=i;
            }
        }
      //  int i = 97 + ans;
       // retrun ans+'a';
        char c1=(char)(97 + ans);
        return c1;
    }

    public static void main(String args[]) {
        String str = "testsample";

       char c11= hetChar(str);
       System.out.println(c11);


    }
}
