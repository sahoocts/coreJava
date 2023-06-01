package Eighteen_four;

public class MoveNegetiveToEnd {
    static int[] moveNegetive(int arr[]){
        int temp[]=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                temp[j]=arr[i];
                j++;
            }
        }
        for(int k=0;k<arr.length;k++){
            if(arr[k]<0){
                temp[j]=arr[k];
                j++;
            }
        }
        return temp;
    }
    public static void main(String args[]){

        int a[]={2,-1,3,-5,6,-2};
        int n=a.length;
       int p[]= moveNegetive(a);

       for(int i=0;i<p.length;i++){
           a[i]=p[i];
       }

     for(int ss:a){
         System.out.print(ss+",");
     }
    }
}
