package nighteen_four;

public class Even_and_Odd {
    //Given an array arr[] of size N containing equal number of odd and even numbers.
    // Arrange the numbers in such a way that all the even numbers get the even index and odd numbers get the odd index

    static int[] getEvenOdd(int arr[],int n){
        int temp[]=new int[arr.length];
        int j=0;
        int k=1;
        for(int i=0;i<arr.length;i++){

            if(arr[i]%2==0){
                temp[j]=arr[i];
                j=j+2;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                temp[k]=arr[i];
                k=k+2;
            }
        }

        return temp;
    }
    public static void main(String args[]){

        int N = 6;
        int arr[] = {3, 6, 12, 1, 5, 8};
        int a[]=getEvenOdd(arr,N);
        for(int s:a){
            System.out.print(s+",");
        }
    }
}
