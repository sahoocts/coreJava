package JAVA8.NewProgram;

import java.util.stream.Stream;

public class FindFirst {

    public static void main(String args[]){
        String s[]={"sarpj","kumar","sahoo"};
        Stream st=Stream.of(s);
        st.findFirst().ifPresent(System.out::println);
    }
}
