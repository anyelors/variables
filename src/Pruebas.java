import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Pruebas {

    public static void main(String[] args) {
        Map<Integer, List<String>> byLength =
                List.of("java", "code", "stream", "tip", "web")
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


    }
}
