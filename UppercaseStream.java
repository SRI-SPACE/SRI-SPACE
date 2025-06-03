
import java.util.stream.Stream;
import java.util.List;
import java.util.stream.Collectors;

public class UppercaseStream {
    public static void main(String[] args) {
        
        Stream<String> names = Stream.of("aBc", "d", "ef");

       
        List<String> uppercaseNames = names.map(String::toUpperCase).collect(Collectors.toList()); 
         System.out.println(uppercaseNames); 
    }
}



 

    

