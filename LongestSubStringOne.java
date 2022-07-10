public class LongestSubStringOne {

    public static void main(String args[]) {
        String st = "111011110";
        int x = getSub(st);
        System.out.println("x is " + x);
    }

    private static int getSub(String st) {
       /* int n = st.length();
        int count=0;
        int ans=0;
        for (int i = 0; i < n; i++) {
            if(st.charAt(i)=='1'){
                count=1;
                for(int j=i+1;j<n && st.charAt(j)=='1';j++){
                        count++;
                }
                ans=Math.max(ans,count);
            }
        }
        return ans;
    }*/
        int c = 0;
        int ans = 0;
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == '1') {
                c++;
                ans = Math.max(ans, c);
            } else {
                c = 0;
            }
        }
        return ans;
    }

}