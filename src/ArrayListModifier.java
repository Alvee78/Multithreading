import java.util.Random;

public class ArrayListModifier implements Runnable {
    private final SharedArrayList sharedList;

    public ArrayListModifier(SharedArrayList sharedList) {
        this.sharedList = sharedList;
    }

    @Override
    public void run() {
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            sharedList.add(i);
            if (sharedList.getList().size() > 100) {
                sharedList.removeFirst();
            }
            try {
                Thread.sleep(random.nextInt(5));
            } catch (InterruptedException e) {
            }
        }
    }
}
