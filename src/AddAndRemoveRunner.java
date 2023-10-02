import java.util.ArrayList;

public class AddAndRemoveRunner {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        //AddAndRemove addAndRemove = new AddAndRemove(arrayList);
        Thread t2 = new AddAndRemove(arrayList,false);
        Thread t1 = new AddAndRemove(arrayList,true);
        t1.start();
        t2.start();
    }
}
