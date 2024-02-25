package methodReference;


public class NonStaticMethodReference {
    public void m1(){
        for (int i =0; i<5;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
/*Method and Constructor references by using ::(double colon)operator

functionalInterface method can be mapped to our specified method by using :: (double
colon)operator. This is called method reference.

Our specified method can be either static method or instance method.

FunctionalInterface method and our specified method should have same argument types ,except this
the remaining things like
returntype,methodname,modifiersetc are not required to match.*/
    public static void main(String[] args) {
        Runnable r = new NonStaticMethodReference()::m1;
        new Thread(r).start();
        System.out.println(Thread.currentThread().getName());
    }
}
