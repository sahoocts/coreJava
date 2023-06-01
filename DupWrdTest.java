package NewHackersRank;

public class DupWrdTest {

    public static void main(String args[]){
        int count;
    String str="Big black bug bit a big black dog on his big black nose";
   // String dup=" ";
        str=str.toLowerCase();
        String word[]=str.split(" ");
        /*for(String s:word){
            System.out.println(s);
        }*/

        for(int i=0;i<word.length;i++){
              count=1;
            for(int j=i+1;j<word.length;j++){
                if(word[i].equals(word[j])){
                   // dup=word[i];
                    count++;
                    System.out.println((word[j]));
                }

            }
        }


    }
}
