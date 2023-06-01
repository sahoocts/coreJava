package HackersRankk;
//Hackerrank Java Generics
public class JavaGenerics {
    public static void main(String args[]){
        Integer a[]={1,2,3};
        String str[]={"Hello","world"};
        printArray(a);
        printArray(str);
    }

    private static void printArray(Object[] a) {
        for(Object obj:a){
            System.out.println(obj);
        }
    }
}
