package New_Leetcode;
//greast number <=target
// 14 is the greast number which is less than 15
//return index 4 means a[4] value is 14
public class Floor {
    public static void main(String args[]){
        int a[]={2,3,5,9,14,16,18};
        int x=floor(a);
        System.out.print(x);
    }

    private static int floor(int[] a) {
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
        return end;
    }
}
