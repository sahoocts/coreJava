package NewHackersRank;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SplitString {

    public static void main(String args[]) {
        /*String str = "This is an example string right  Yes ?";
        String s = str.replaceAll("[!,?._'@\\s]+", " ");
        StringTokenizer st = new StringTokenizer(s);
        int count = st.countTokens();
      //  System.out.println(count);
        for (int i = 0; i < count; i++) {
            System.out.println(st.nextToken());
        }
        *//*Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().replaceAll("[!,?._'@\\s]+", " ");
        StringTokenizer st = new StringTokenizer(s);
        int count = st.countTokens();
        System.out.println(count);
        for (int i = 0; i < count; i++) {
            System.out.println(st.nextToken());
        }
        scan.close();*//*


    }
}*/

        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\\Z");
        String s = scan.next().trim();
        if (s.length() > 0) {
            String[] tokens = s.split("[!,?._'@\\s]+");
            System.out.println(tokens.length);
            for (String token : tokens) {
                System.out.println(token);
            }
        } else {
            System.out.println(0);
        }
        scan.close();
    }
}