package Geeksforgeeks;

class pair
{
    int first, second;
    public pair(int first, int second)
    {
        this.first = first;
        this.second = second;
    }
}

public class Min_Mix_Elements {


    //static int[] getMinMax(int arr[],int N)
    static pair getMinMax(int arr[],int N){
       // int temp[]=new int[2];
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        for(int j=0;j<arr.length;j++){
            if(min>arr[j]){
                min=arr[j];
            }
        }
      //  temp[0]=max;
     //   temp[1]=min;
      //  return temp;
        return new pair(min,max);
    }

    public static void main(String args[]){
       int N = 6;
        int arr[] = {3, 2, 1, 56, 10000, 167};
     //   int[] p= getMinMax(arr,N);

        pair p=getMinMax(arr,N);
        System.out.println(p.first+":::"+p.second);
       /* for(int a:p){
            System.out.println(a);
        }*/
    }
}
