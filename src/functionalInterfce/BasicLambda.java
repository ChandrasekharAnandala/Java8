package functionalInterfce;

public interface BasicLambda {
    void m1();
}
class Test{
    public static void main(String[] args) {
        BasicLambda b = () -> System.out.println("Hi..Welcome to Lambda's");
        b.m1();
    }
}
