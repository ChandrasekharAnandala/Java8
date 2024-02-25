package functionalInterfce;

public interface FindSquare {
    int square(int a);
}
class Main{
    public static void main(String[] args) {
        FindSquare f = a -> a*a;
        System.out.println(f.square(4));
    }
}
