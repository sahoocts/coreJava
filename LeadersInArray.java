public class LeadersInArray {

  //  public static void main(String args[]){
       /* LeadersInArray lead = new LeadersInArray();
        int arr[] = new int[]{16, 17, 4, 3, 5, 2};
        int n = arr.length;
        lead.printLeaders(arr, n);
    }

    private void printLeaders(int[] arr, int n) {
        int right_num=arr[n-1];
        System.out.print(right_num);
        for(int i=n-2;i>=0;i--){
            if(right_num<arr[i]){
                right_num=arr[i];
                System.out.print(right_num);
            }
        }
*/

        void printLeaders(int arr[], int size)
        {
            for (int i = 0; i < size; i++)
            {
                int j;
                for (j = i + 1; j < size; j++)
                {
                    if (arr[i] <=arr[j])
                        break;
                }
                if (j == size) // the loop didn't break
                    System.out.print(arr[i] + " ");
            }
        }

        /* Driver program to test above functions */
        public static void main(String[] args)
        {
            LeadersInArray lead = new LeadersInArray();
            int arr[] = new int[]{16, 17, 4, 3, 5, 2};
            int n = arr.length;
            lead.printLeaders(arr, n);
        }
    }

