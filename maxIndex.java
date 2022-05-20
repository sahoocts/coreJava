package nighteen_four;

public class maxIndex {

    static  int maxIndexDiff(int a[],int n){
        int maxL=-1;
        for(int i=0;i<n;i++){
            int j=i+1;
            while(j<n){
                if(a[i]<=a[j]){
                    int diff=j-i;
                    maxL=Math.max(diff,maxL);
                }
                j++;
            }
        }
        return maxL;
    }
    public static void main(String args[]){
        int N = 9;
        int A[] = {34, 8, 10, 3, 2, 80, 30, 90, 1};
        int x=maxIndexDiff(A,N);
        System.out.print("x is::::"+x);
    }
}
