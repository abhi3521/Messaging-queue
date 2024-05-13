import java.util.Set;

public class TopicListing {
    private QueueService queueService;

    public TopicListing(QueueService queueService) {
        this.queueService = queueService;
    }

    public Set<String> listTopics() {
        return queueService.getTopicQueues().keySet();
    }
}