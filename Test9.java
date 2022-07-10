package Java8.MCQS;

public class Test9 {
    public static void main(String[] args){

        StringBuilder s1 = new StringBuilder("Java");
        String s2 = "Love";
        s1.append(s2);//no error
        System.out.println(s1);
       // s1.substring(4);
        int foundAt = s1.indexOf(s2);
        System.out.println(foundAt);
    }


}
