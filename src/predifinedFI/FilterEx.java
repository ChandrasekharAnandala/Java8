package predifinedFI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEx {
    public static void main(String[] args) {
        /*Filter will accept Predicate as an argument*/
        List<Integer> list = Arrays.asList(3, 6, 9, 12, 15);
        List<Integer> evenNumbers =list.stream()
                .filter(a -> a%2 ==0)
                //.forEach(System.out::println);
                .collect(Collectors.toList());
        System.out.println(evenNumbers);

    }
}
