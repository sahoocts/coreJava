package LogicImplemented;

public class Longest_Span_with_same_Sum_in_two_Binary_arrays {
    static int arr1[] = {0, 1, 0, 0, 0, 0};
    static int arr2[] = {1, 0, 1, 0, 0, 1};
    private static int getMaxSpan(int length) {
        int maxLen=0;
        for(int i=0;i<length;i++){
            int s1=0;
            int s2=0;
            for(int j=i;j<length;j++){
              s1=s1+arr1[j];
              s2=s2+arr2[j];
              if(s1==s2){
                  int len=j-i+1;
                  if(len>maxLen){
                      maxLen=len;
                  }
              }

            }
        }
        return maxLen;
    }

    public static void main(String args[]){

        System.out.print(getMaxSpan(arr1.length));
    }


}
