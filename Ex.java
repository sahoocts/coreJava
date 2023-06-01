package LogicImplemented;

import java.util.HashMap;
import java.util.Map;

public class Ex {
    static void frequencyNumber(int arr[], int size)
    {
        // Creating a HashMap containing integer
        // as a key and occurrences as a value
        HashMap<Integer, Integer> freqMap
                = new HashMap<Integer, Integer>();

        for (int i=0;i<size;i++) {
            if (freqMap.containsKey(arr[i])) {

                freqMap.put(arr[i], freqMap.get(arr[i]) + 1);
            }
            else {

                freqMap.put(arr[i], 1);
            }
        }

        // Printing the freqMap
        for (Map.Entry entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};
        int size = arr.length;
        frequencyNumber(arr,size);
    }
}
