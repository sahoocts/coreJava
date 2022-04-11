package NewTry;

public class Count_of_rotations_required_generate_sorted_array {

    //{4, 5, 1, 2, 3}
    //Aniticlockwise
    //1.{5,1,2,3,4}
    //2.{1,2,3,4,5}
    public static int countRotation(int arr[]){
        int n=arr.length;
        int min=arr[0];//4
        int min_index=0;
        for(int i=0;i<n;i++){
            if(min>arr[i]){
                min=arr[i];
                min_index=i;
            }
        }
        return min_index;
    }

    public static void main(String args[]){
        int arr[]={2,3,4,5,1};
        int x=countRotation(arr);
        System.out.println("x is"+x);
    }
}
