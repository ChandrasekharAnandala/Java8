package predifinedFI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MapEx {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(3, 6, 9, 12, 15);
        List<Integer> multiply =al.stream()
                .map(a -> a*3)
               // .forEach(System.out::println);
                .collect(Collectors.toList()); //[9, 18, 27, 36, 45]
        System.out.println(multiply);
        long b =al.stream().map( a -> a*a)
                .count();
        System.out.println(b); //5 count of elements
        Optional<Integer> at =al.stream().map(a -> a*a)
               // .min((o1, o2) -> o1.compareTo(o2));
               .min(Comparator.naturalOrder());
        System.out.println(at.get());
        List<Integer> sortedList =al.stream().map(a -> a*a)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
