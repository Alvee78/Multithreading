import java.util.ArrayList;
import java.util.List;

public class SharedArrayList {
    private final List<Integer> list;

    public SharedArrayList() {
        list = new ArrayList<>();
    }

    public List<Integer> getList() {
        return list;
    }

    public synchronized void add(int value) {
        list.add(value);
    }

    public synchronized void removeFirst() {
        if (!list.isEmpty()) {
            list.remove(0);
        }
    }
}
