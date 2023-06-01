package stack;
//i   arr                         swap (indices)
//0   [7, 1, 3, 2, 4, 5, 6]   swap (0,3)
//1   [2, 1, 3, 7, 4, 5, 6]   swap (0,1)
//2   [1, 2, 3, 7, 4, 5, 6]   swap (3,4)
//3   [1, 2, 3, 4, 7, 5, 6]   swap (4,5)
//4   [1, 2, 3, 4, 5, 7, 6]   swap (5,6)
//5   [1, 2, 3, 4, 5, 6, 7]

//total swap 5
public class MinimumSwapsToSortArray {

    private static int[] getSwap(int[] arr) {
        int index=0,min_swap=0,temp;

        while(index<arr.length){
            if(arr[index]!=index+1){
                temp=arr[index];
                //arr[index]=arr[arr[index]-1];
                arr[index]=arr[temp-1];
                arr[temp-1]=temp;
                min_swap++;
            }
            else{
                index++;
            }
        }
       return arr;
       // return min_swap;
    }

    public static void main(String args[]){
     int arr[]={7 ,1,3,6,4,5,2};
       // int arr[]={4,3,1,2};
        int x[]=getSwap(arr);
       // int x=getSwap(arr);
       // System.out.print(x);
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]+" ");
        }
    }


}
