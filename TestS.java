package Java8;


public class TestS {
    public static void main(String args[]){
        String S1 = "cddgk";
        String S2 =  "gcd";
       int x= remAnagrams(S1,S2);
       // System.out.println(x);
      //  char s='a';
      //  System.out.println(s-'a');
        System.out.println(x);

        String msi="";
        for(int i=0;i<S1.length();i++){
            if(!S2.contains(Character.toString(S1.charAt(i)))){
                msi=msi+S1.charAt(i);
            }
        }
       System.out.println(msi);
    }
    private static int remAnagrams(String s1, String s2) {
        int length1 = s1.length();
        int length2 = s2.length();
        int fre[]=new int[26];
        int c=0;

        char ch[]=s1.toCharArray();
        char ch1[]=s2.toCharArray();
       for(int i=0;i<ch.length;i++){
           fre[ch[i]-'a']=fre[ch[i]-'a']+1;
       }

       for(int i=0;i<ch1.length;i++){
           fre[ch1[i]-'a']-=1;
       }

       for(int f:fre){
           if(f!=0){
               c++;
           }
       }
       // return 0;
        return c;
    }
}
