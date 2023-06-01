package HackersRankk;

public class MinJump {

    static int minJumps(int[] arr){
        // your code here
        int c,jump=0;
        for(int i=0;i<arr.length;i=i+c){
            c = arr[i];
            jump++;
        }
        return jump;
    }
    public static void main( String args[]){
        int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int v=minJumps(arr);
        System.out.println(v);

    }
}
