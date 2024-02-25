package excercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToUpperCase {
    public static void main(String[] args) {
        List<String > al = Arrays.asList("Chandu","Govind","Anandala");
        List<String> alUpper = al.stream()
                //.map(a -> a.toUpperCase())
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(alUpper);
       // al.replaceAll(a -> a.toLowerCase());
        al.replaceAll(String::toLowerCase);
        System.out.println(al);
         al.stream()
                 //.map(a -> a.length())
                .map(String ::length)
                .forEach(System.out::println);
    }
}
