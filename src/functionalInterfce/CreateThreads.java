package functionalInterfce;

public class CreateThreads {
    public static void main(String[] args) {
        // Using Anonymous inner class
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i  = 0; i< 5; i++){
                    System.out.println("Child Thread");
                }
            }
        });
        t.start();
        /*Using Lambda Expression*/
      /*  new Thread(()->{for(int i  = 0; i< 5; i++){
            System.out.println("Child Thread");
        }
        }).start();*/
    }
}
