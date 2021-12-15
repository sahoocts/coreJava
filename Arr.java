package LogicImplemented;

import java.util.ArrayList;

public class Arr {

    public static void main(String args[]){

        int arr[]={3,5,6,7,8,10,12};
        ArrayList<Integer> as=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            as.add(arr[i]);
        }
        int a=3;
        boolean exit=as.contains(a);
        System.out.println(exit);
    }
}
