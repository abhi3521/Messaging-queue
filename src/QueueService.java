import lombok.Getter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class QueueService {
    private Map<String, TopicQueue> topicQueues;

    public QueueService() {
        topicQueues = new ConcurrentHashMap<>();
    }

    public void addTopic(String topic) {
        topicQueues.put(topic, new TopicQueue());
    }

    public TopicQueue getTopicQueue(String topic) {
        return topicQueues.get(topic);
    }

    public Map<String, TopicQueue> getTopicQueues() {
        return topicQueues;
    }
}