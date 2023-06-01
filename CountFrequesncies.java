package TwentyFive;

public class CountFrequesncies {

    public static void getCountFrequesncies(String str){
        char ch[]=str.toCharArray();
        int n[]=new int[ch.length];
        for(int i=0;i<ch.length;i++){
            int digit=(ch[i]-'0');
            n[digit]=n[digit]+1;
        }
         int max=0;
        int k=0;
        for(int i=0;i<n.length;i++){

            if(max<n[i]){
                max=n[i];
                k=i;
               //
            }
          /*if(k==i){
              System.out.println(k+"::"+n[i]);
          }*/


        }
        System.out.println(k+":::"+max);
    }

    public static void main(String args[]){
        String n1="4323444445553436";
        getCountFrequesncies(n1);
    }
}
