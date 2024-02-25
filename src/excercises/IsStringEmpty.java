package excercises;

import java.util.function.Predicate;

public class IsStringEmpty {
    public static void main(String[] args) {
        Predicate<String> pt = String::isEmpty;
        //Predicate<String> pt = a ->a.isEmpty();
        System.out.println(pt.test(""));
        System.out.println(pt.test("Java Lambda Expression"));
    }
}
