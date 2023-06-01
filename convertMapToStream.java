package JAVA8.NewProgram;
import java.util.*;
import java.util.stream.Stream;

public class convertMapToStream {

    public static void main(String args[]){
        Map<Integer, String> map = new HashMap<>();
        // Add entries to the Map
        map.put(1, "Geeks");
        map.put(2, "forGeeks");
        map.put(3, "A computer Portal");
      //  System.out.print(map);
        Stream<Map.Entry<Integer,String>> stream=convertMapToStreamEx(map);
        //System.out.print(stream);
        stream.forEach(System.out::println);

    }

    private static Stream<Map.Entry<Integer,String>> convertMapToStreamEx(Map<Integer, String> map) {
        return map.entrySet().stream();
    }
}
