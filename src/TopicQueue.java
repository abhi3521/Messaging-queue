import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class TopicQueue {
    private Queue<Object> queue;

    public TopicQueue() {
        queue = new ConcurrentLinkedQueue<>();
    }

    public void addData(Object data) {
        queue.add(data);
    }

    public Object getData() {
        return queue.poll();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}