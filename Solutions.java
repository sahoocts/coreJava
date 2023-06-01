package HackersRankTest;

import HackersRank.Solution;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solutions {
    public static void main(String args[]) throws Exception{

        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int num=Integer.parseInt(br.readLine().trim());
            Object o;//Must be used to hold the reference of the instance of the class Solution.Inner.Private

            o=new Inner().new Private();
            System.out.println(num+"is "+((Solutions.Inner.Private)o).powerof2(num));

        }

        catch(Exception e){
           System.out.println(e);
        }
    }

   static class Inner{
        private class Private{
            private String powerof2(int num){
                return ((num&num-1)==0)?"power of 2":"not a power of 2";
            }
       }
    }
}
