package HackersRankk;

public class ElementAppearsOnceSortedArray {

   private static int findOnce(int arr[], int n)
    {
       // Complete this function
        if( n > 1 )
        {
            int i=0;
            // && i!=(n-1)
            while(i<n)
            {
                if(arr[i] != arr[i+1])
                {
                    return arr[i];
                }
                i = i+2;
                //i++;
            }
        }
        return arr[n-1];
        /*for(int i=0;i<n;i++)
        {
            if(arr[i]!=arr[i-1]&&arr[i]!=arr[i+1])
            {
                return arr[i];
            }
        }
        return -1;*/
    }
    public static void main(String args[]){
        int N = 11;
        int arr[] = {1, 1,1, 2, 2, 3, 3, 4, 50, 50, 65, 65};
        int c=findOnce(arr,N);
        System.out.print(c);
    }
}
