import java.util.ArrayList;
import java.util.Date;

public class AddAndRemove extends Thread{
    private ArrayList<Integer> arrayList;
    private int REPETITIONS;
    private boolean ifAdd;
    private int DELAY;
        public AddAndRemove(ArrayList<Integer> arrayList,boolean ifAdd){
            REPETITIONS = 8;
            this.ifAdd = ifAdd;
            this.arrayList = arrayList;
        }

    public void setIfAdd(boolean ifAdd) {
        this.ifAdd = ifAdd;
    }

    @Override
    public void run() {
        try{
            for(int i = 1; i <= REPETITIONS; i++){
                Date now = new Date();
                if(ifAdd) {
                    System.out.println(now + " adding " + Thread.currentThread().getName());
                    arrayList.add(5);
                }else {
                    Thread.sleep(20);
                    System.out.println(now + " " + "removing " + Thread.currentThread().getName());
                    arrayList.remove(arrayList.size()-1);
                }
                Thread.sleep(DELAY);
            }
        }catch(InterruptedException e){
        }catch(Exception e){
        }
    }
}
