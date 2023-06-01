package Kushal;

public class GeneratenNmberTheFrequencyOfEachDigitIsDigitTimesTheFrequencyInGivenNumber {
    static void printNumber(int n)
    {// initializing a hash array
        int count[] = new int[10];
        // counting frequency of the digits
        while (n>0) {
            count[n % 10]++;
            n /= 10;
        }
        // printing the new number
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < count[i] * i; j++)
                System.out.print(i);
        }
    }
// Driver code
    public static void main (String[] args) {
        int n = 3225;
        printNumber(n);
    }
}
