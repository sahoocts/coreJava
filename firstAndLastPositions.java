import java.util.ArrayList;

public class firstAndLastPositions {

    public static  ArrayList<Long>  getAccurance(long arr[],int x){
        ArrayList<Long> al=new ArrayList<>();
        long first=-1;
        long last=0;
        for(int i=0;i<arr.length;i++){
            if(x!=arr[i]){
                continue;
            }
            if(first==-1){
                first=i;
            }
            else{
                last=i;
            }
        }
        if(first!=-1){
            al.add(first);
            al.add(last);
          //  System.out.println("first accurance is"+first);
           // System.out.println("last accurance is"+last);
        }
        /*else{
           // System.out.println("not found");
            al.add("not found");
        }*/
        return al;
    }
    public static void main(String args[]){
        long arr[] = {1, 3, 5, 5, 5, 5, 67, 123, 125};
         int x = 5;
       ArrayList<Long> l=getAccurance(arr,x);

       System.out.println(l);

    }
}
