package TwentyFive;

public class NextGreaterElement {

    public static void getNextGreaterValue(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    System.out.println(a[j]);
                    break;
                }

            }
        }
    }
    public static void main(String args[]){
        int a[]={2,5,9,3,1,12,6,8,7};
        getNextGreaterValue(a);
    }
}
