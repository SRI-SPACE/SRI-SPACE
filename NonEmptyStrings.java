
    import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NonEmptyStrings {
    public static void main(String[] args) {
        List<String> listStrings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        List<String> nonEmptyStrings = listStrings.stream()
                .filter(str -> !str.isEmpty())
                .collect(Collectors.toList());

        System.out.println("List with non-empty strings: " + nonEmptyStrings);
    }
}
    

