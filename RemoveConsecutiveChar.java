import java.util.Arrays;

public class RemoveConsecutiveChar {
  //  public static void main(String args[]){
       /* String str="abcabcd";
        char ch[]=str.toCharArray();
        Arrays.sort(ch);//a a b b c c d
        char b[]=new char[4];
        int k=0;
        for(int i=0;i<ch.length-1;i++){

            for(int j=i+1;j<=i+1;j++){
               if(ch[i]!=ch[j]){
                   b[k]=ch[i];
                   k++;
               }
            }
        }
        b[k++]=ch[ch.length-1];

        for(int i=0;i<b.length;i++){
            System.out.print(b[i]);
        }*/

        static void removeDuplicates(char[] s)
        {
            int n=s.length;
           // char ch= ' ';
            String str="";
            for(int i=0;i<n;i++){
                if(i<n-1 && s[i]==s[i+1]){
                    continue;
                }
                else{
                    str=str+s[i];
                }
            }
            System.out.println(str);

           /* int n = S.length;

            // We don't need to do anything for
            // empty or single character string.
            if (n < 2)
            {
                return;
            }

            // j is used to store index is result
            // string (or index of current distinct
            // character)
            int j = 0;

            // Traversing string
            for (int i = 1; i < n; i++)
            {
                // If current character S[i]
                // is different from S[j]
                if (S[j] != S[i])
                {
                    j++;
                    S[j] = S[i];
                }
            }
            System.out.println(Arrays.copyOfRange(S, 0, j + 1));*/
        }

        // Driver code
        public static void main(String[] args)
        {
           // char S1[] = "geeksforgeeks".toCharArray();
         //   removeDuplicates(S1);

            char S2[] = "aabcca".toCharArray();
            removeDuplicates(S2);
        }
    }

