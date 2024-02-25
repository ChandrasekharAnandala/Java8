package predifinedFI;

import java.util.function.Predicate;

public class PredicateEx {
    public static void main(String[] args) {
    Predicate<Integer> p1 = a -> a < 10;
    Predicate<Integer> p2 = a -> a % 2 == 0;
    int[] x = {2,3,4,5,6,7,8,11,12,14,16,19,20};
    System.out.println("Numbers less than 10");
    m1(p1,x);
    System.out.println("Even Numbers");
    m1(p2,x);
    System.out.println("Numbers greater than 10");
    m1(p1.negate(),x);
    System.out.println("Numbers less than 10 and even Numbers");
    m1(p1.and(p2),x);
    System.out.println("Numbers greater than 10 and even Numbers");
    m1(p1.negate().and(p2),x);
    }
    public static void m1(Predicate<Integer> p,int[] x){
        for(int a : x){
            if(p.test(a)){
                System.out.print(a+" ");
            }
        }
        System.out.println();
    }
}
