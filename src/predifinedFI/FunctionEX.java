package predifinedFI;

import java.util.function.Function;

public class FunctionEX {
    public static void main(String[] args) {
       // Function<String,Integer> f = a -> a.length();
        Function<String,Integer> f = String::length;
        System.out.println(f.apply("Chandu Anandala"));
        System.out.println(f.apply("Govind"));
        System.out.println(f.apply("Chill dude..."));
    }
}
