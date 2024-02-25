package excercises;

import java.util.function.BiFunction;
public class SumOfIntegers {
    public static void main(String[] args) {
       // BiFunction<Integer,Integer,Integer> fun = (a,b) -> a+b;
        BiFunction<Integer,Integer,Integer> fun = Integer::sum;
        System.out.println(fun.apply(20,12));
    }
}
