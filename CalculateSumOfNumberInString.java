package PrevPractice;

public class CalculateSumOfNumberInString {
    static int findSum(String str)
    {
        // A temporary string
        String temp = "0";

        // holds sum of all numbers present in the string
        int sum = 0;

        // read each character in input string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // if current character is a digit
            if (Character.isDigit(ch))
                temp =temp+ ch;

                // if current character is an alphabet
            else {
                // increment sum by number found earlier
                // (if any)
                sum =sum+ Integer.parseInt(temp);

                // reset temporary string to empty
                temp = "0";
            }
        }

        // atoi(temp.c_str()) takes care of trailing
        // numbers
        return sum + Integer.parseInt(temp);
    }

    // Driver code
    public static void main(String[] args)
    {

        // input alphanumeric string
        String str = "12abc20yz68";

        // Function call
        System.out.println(findSum(str));
    }
}
