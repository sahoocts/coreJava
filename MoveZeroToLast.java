package TwentyFive;

public class MoveZeroToLast {
 //   static int[] getMoveZeroToLast(int a[]){
 static int[] getMoveZeroToLast(int a[]){
       // int temp[]=new int[a.length];
       /* int i=0;
        for(int j=0;j<a.length;j++){
            if(a[j]>0){
                a[i]=a[j];
                i++;
            }
        }
        while(i<a.length){
            a[i]=0;
             i++;
        }
     return a*/;

    return a;
    }
    public static void main(String args[]){
        int arr[]={3,0,4,0,0,5,6};
       // int b[]=getMoveZeroToLast(arr);
       int b[]= getMoveZeroToLast(arr);
        for(int s:b){
            System.out.print(s);
        }

    }
}
