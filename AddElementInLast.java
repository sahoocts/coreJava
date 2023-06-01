package LogicImplemented;

public class AddElementInLast {

    public static void main(String args[]){
        int x[]={1,2,3,4};
      //  System.out.println(x[4]);
        int y=5;
        addingElementInLast(x,y);
    }

    private static void addingElementInLast(int[] x, int y) {
        int z[]=new int[x.length+1];
        int j=0;
        for(int i=0;i<x.length;i++){
            z[j]=x[i];
            j++;
        }
        z[j++]=y;
        for(int a:z){
            System.out.println("the array is"+a);
        }
    }
}
