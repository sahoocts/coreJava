import java.util.ArrayList;

public class firstAndLastPositions2 {
    public static void main(String args[]){
        long arr[] = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int x = 5;
        ArrayList<Long> l=getAccurance(arr,x);
        System.out.println(l);
    }

    private static ArrayList<Long> getAccurance(long[] arr, int x) {
        int n=arr.length;
        long temp1=Long.MIN_VALUE,temp2=Long.MIN_VALUE;
        //long temp1=-1;temp2=-1;

        ArrayList<Long> list= new ArrayList<>();

        for(int i=0;i<n;i++){
            if(arr[i]==x){
                temp1=i;

                break;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                temp2=i;

                // code here
            }

        }
        if(temp1!=Long.MIN_VALUE&&temp2!=Long.MIN_VALUE){
            list.add(temp1);
            list.add(temp2);
        }
        else
        {
            list.add((long)-1);
            list.add((long)-1);

        }
        return list;
    }
    }

