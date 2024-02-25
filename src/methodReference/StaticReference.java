package methodReference;

public class StaticReference {
    public static void m1(){
        for(int i =0; i <5; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Runnable r = StaticReference::m1;
        new Thread(r).start();
        System.out.println(Thread.currentThread().getName());
    }
}
