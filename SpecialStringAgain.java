package HackersRank_06062022;
//Input
//4
//aaaa

//output
//10
//The special palindromic substrings s of aaaa are
//a,a,a,a,aa,aa,aa,aaa,aaa,aaaa


//Input
//5
//asasd

//output
//7
//The special palindromic substrings s of aaaa are
//a,s,a,s,d,asa,sas


public class SpecialStringAgain {

    public static void main(String args[]){
      //  String str1="aaaa";
        String str2="asasd";
        long x=subStrCount(str2);
        System.out.print(x);
    }

    private static long  subStrCount(String str1) {
        long ans=str1.length();
        for(int i=0;i<str1.length();i++){
         //int repeat=0;
        /* while(i+1< str1.length() && str1.charAt(i)==str1.charAt(i+1)){
             repeat++;
             i++;
         }*/
         //ans=ans+(repeat*(repeat+1))/2;
// && str1.charAt(i-pointer)==str1.charAt(i-1)
            int pointer=1;
            while(i-pointer>=0 && i+pointer<str1.length() && str1.charAt(i+pointer)==str1.charAt(i-1)){
                ans++;
                pointer++;
            }
        }

       return ans;
    }
}
