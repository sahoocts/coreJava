package Geeksforgeeks;

import java.util.Arrays;
//N = 6
//arr[] = 7 10 4 3 20 15
//K = 3
//Output : 7
//Explanation :
//3rd smallest element in the given
//array is 7.
public class Kth_smallest_element_in_the_given_array {

    public static void main(String args[]){
        int arr[] = {7 ,10 ,4 ,3 ,20 ,15};
        int K = 3;
        Arrays.sort(arr);
        int a=arr[K-1];
        System.out.println(a);
    }
}
