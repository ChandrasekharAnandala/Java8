package excercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AlphabeticalOrder {
    public static void main(String[] args) {
        List<String > al = Arrays.asList("Chandu","Govind","Anandala");
        List<String > alSorted=al.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(alSorted);
    }
}
