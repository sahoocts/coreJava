package NewHackersRank;

public class AlternateArrange {

    static int[] arrange(int a[]){
        int temp[]=new int[a.length];
        int j=0;
        int k=1;
        for(int i=0;i<a.length;i++){
            if(a[i]>=0){
                temp[j]=a[i];
                j=j+2;
            }
            else{
                temp[k]=a[i];
                k=k+2;
            }
        }
        return temp;
    }

    public static void main(String args[]){
        int  Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2};
        int s[]=arrange(Arr);
        for(int d:s){
            System.out.print(d);
        }
    }
}
