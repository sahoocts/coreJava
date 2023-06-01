package Small_Program;

public class ReDpu {
    static int[] gteDup(int arr[]) {

            int n = arr.length;
            int s = 0;
            int temp[] = new int[4];
            int c = arr[0];
            for (int i = n - 1; i > 0; i--) {
                if (arr[i] != arr[i - 1]) {
                    temp[s] = arr[i];
                    s++;
                }
            }
            temp[s] = c;
            return temp;
        }
   // }
        public static void main (String args[]){
            int a[] = {1, 1, 2, 2, 3, 3, 4};
            int b[] = gteDup(a);
            for (int ss : b) {
                System.out.print(ss);
            }
        }
    }
