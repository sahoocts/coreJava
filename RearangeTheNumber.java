package PrevPractice;

public class RearangeTheNumber {
    private static int[] getNumber(int a[]){
        int b[]=new int[a.length];
        int i=0;
        int k=0;
        int j=a.length-1;
        while(i<j){
            b[k]=a[j];
            k++;
            b[k]=a[i];
            k++;
            j--;
            i++;
        }
        return b;
    }
    public static void main(String args[]){

        int a[]={1,2,3,4,5,6};
          int c[]=getNumber(a);
          for(int d:c){
              System.out.print(d+",");
          }
    }
}
