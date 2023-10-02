import java.util.Date;

public class GreetingRunnable extends Thread{
    private static final int REPETITIONS = 10;

    public GreetingRunnable(String greeting, int delay) {
        this.greeting = greeting;
        this.DELAY = delay;
    }

    private int DELAY;
    private String greeting;

    @Override
    public void run() {
        try{
            for(int i = 1; i <= REPETITIONS; i++){
                Date now = new Date();
                System.out.println(now + " " + greeting + Thread.currentThread().getPriority());
                Thread.sleep(DELAY);
            }
        }catch(InterruptedException e){
        }catch(Exception e){
        }
    }
}
