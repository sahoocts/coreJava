package New_Leetcode;

public class CountTheEvenFromArray {
    public static void main(String args[]){
        int a[]={234,1234,232123,3,};
        int c=0;

     int cd=findNumbers(a);
     System.out.print(cd);

    }

    private static int findNumbers(int[] a) {
        int c=0;
        for(int nums:a){
            if(even(nums)){
                c++;
            }
        }
        return c;
    }

    private static boolean even(int nums) {
        int digit=isDigit(nums);
        /*if(digit%2==0){
            return true;
        }
        return false;*/

        return digit%2==0;
    }

   private static int isDigit(int nums){
        int count=0;
        while(nums>0){
            nums=nums/10;
            count++;
        }
        return count;
   }
}
