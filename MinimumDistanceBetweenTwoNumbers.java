public class MinimumDistanceBetweenTwoNumbers {
    public static void main(String args[]){
        int A[] = {1,2,3,2};
       int x = 1, y = 2;
       int g=getMinimumDistanceBetweenTwoNumbers(A,x,y);
       System.out.println(g);
    }

    private static int getMinimumDistanceBetweenTwoNumbers(int[] a, int x, int y) {
        int n=a.length;
        int x1=-1;
       int mind=Integer.MAX_VALUE;
        int m=-1;
        for(int i=0;i<n;i++) {
            if (x == a[i]) {
                x1 = i;
            }
            else if(y == a[i]){
                m = i;
               // break;
            }
            if(x1!=-1 && m!=-1){
                mind=Math.min(mind,Math.abs(x1-m));
                //mind=Math.min(mind,x1-m);
            }
        }
        if(x1==-1 && m==-1){
            return -1;
        }

       else{
           return mind;
        }
    }
}
