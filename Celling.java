package New_Leetcode;
////smalest  number >= target
// 16 is the smalest number from the array which is greater than 15
// return index 5 which value is 16
public class Celling {
    public static void main(String args[]){
        int a[]={2,3,5,9,14,16,18};
        int x=celling(a);
        System.out.print(x);
    }

    private static int celling(int[] a) {
        int start=0;
        int end=a.length-1;
        int target=15;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<a[mid]){
                end=mid-1;
            }
            else if(target>a[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return start;
    }
}
