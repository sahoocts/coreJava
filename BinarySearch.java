package New_Leetcode;
// 1.find middle of the element
//2.if target elemnet is greater than mid then search right side ,if target element is less than mid then search left side
//3.if middle element is equal to target then found the result
public class BinarySearch {
    public static void main(String args[]){
            int a[]={-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
            int x=getBinarySearch(a);
            System.out.print(x);
    }

    private static int getBinarySearch(int[] a) {
        int start=0;
        int end=a.length-1;
       // int target=20;
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
        return -1;
    }
}
