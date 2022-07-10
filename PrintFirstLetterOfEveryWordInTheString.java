public class PrintFirstLetterOfEveryWordInTheString {

  //  public static void main(String args[]){
        static String firstLetterWord(String str)
        {
            String result = "";
            // Traverse the string.
            boolean v = true;
            for (int i = 0; i < str.length(); i++)
            {
                // If it is space, set v as true.
                if (str.charAt(i) == ' ')
                {
                    v = true;
                }
                else if (str.charAt(i) != ' ' && v == true)
                {
                    result =result+(str.charAt(i));
                    v = false;
                }
            }

            return result;
        }

        // Driver code
        public static void main(String[] args)
        {
            String str = "geeks for geeks";
            System.out.println(firstLetterWord(str));
        }
    }

