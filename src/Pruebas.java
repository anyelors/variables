import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pruebas {

    public static void main(String[] args) {
        Map<Integer, List<String>> byLength = List.of("java", "code", "stream", "tip", "web")
                .stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println("byLength = " + byLength);

        String s1 = "Java";
        String s2 = "Java";
        System.out.println(s1 == s2);

        List<String> names = List.of("Alice", "Bob", "Charlie", "Ane");

        names.stream()
                .filter(name -> name.startsWith("A"))
                .peek(name -> System.out.println("Filtered name: " + name))
                .map(String::toUpperCase)
                .forEach(System.out::println);

        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(11);
        list.add(34);
        list.add(17);
        list.add(20);

        // 1.foreach(); method
        Stream<Integer> myStream = list.stream();
        myStream.forEach(x -> {
            System.out.println(x);
        });
        System.out.println("********************************");

        // 2. Stream Interface of(); Method - Creating Stream
        Stream<String> myList = Stream.of("V", "D", "G", "R", "M");
        myList.forEach(x -> {
            System.out.println(x);
        });
        System.out.println("********************************");

        // 2.filter(); Method - find odd number
        list.stream().filter(x -> x % 2 != 0).forEach(System.out::println);

    }

}
