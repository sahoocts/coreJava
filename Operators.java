package Kushal;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println('a');
        System.out.println('a'+'a');
        System.out.println("a"+"a");
        System.out.println("a" + 1);
        System.out.println((char)('a' + 3));

        System.out.println("Kunal" + new ArrayList<>());
        System.out.println("Kunal" + new Integer(56));
        String ans = new Integer(56) + "" + new ArrayList<>();
        System.out.println(ans);
        System.out.println("a" + 'b');


    }
}
