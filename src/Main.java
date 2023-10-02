public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Before " + Thread.currentThread().getName());
        Thread t1  = new GreetingRunnable("Hello", 1000);
        Thread t2 = new GreetingRunnable("Goodbye", 500);
        t2.start();

        Thread.sleep(1000);
        t1.start();
        System.out.println("After " + Thread.currentThread().getName());
    }
}