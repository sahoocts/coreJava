package JAVA8.NewProgram;

public class CountOccurrenceofagivencharacter {

    private static long countAccu(String str,char c){
        return str.chars().filter(
                e->e==c
        ).count();
    }
    public static void main(String args[]){
        String s="sarojkumarsahoo";
        char c='s';
        long n=countAccu(s,c);
        System.out.print(n);
    }
}
