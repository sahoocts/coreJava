import java.util.ArrayList;
//N = 5, S = 12
//A[] = {1,2,3,7,5}
//Output: 2 4
//Explanation: The sum of elements
//from 2nd position to 4th position
//is 12
public class SubarrayWithGivenSum {
    public static void main(String args[]){
       int N = 5, S = 12;
       int A[] = {1,2,3,7,5};
        ArrayList<Integer> all=  getSubarrayWithGivenSum(A,N,S);
        for(int i=0;i<all.size();i++){
            System.out.print(all.get(i));
        }
    }

    private static ArrayList<Integer> getSubarrayWithGivenSum(int[] a, int n, int s) {

        ArrayList<Integer> al=new ArrayList();
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=i;j<a.length;j++){

                sum=sum+a[j];
                if(sum==s){
                    int x1=i+1;
                    int x2=j+1;
                    al.add(x1);
                    al.add(x2);
                    return al;
                  //  System.out.print(x1+"::"+x2);

                }
            }
           // break;
        }
al.add(-1);
        return al;

    }
}
