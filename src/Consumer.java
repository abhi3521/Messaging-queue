public class Consumer {
    private QueueService queueService;

    public Consumer(QueueService queueService) {
        this.queueService = queueService;
    }

    public Object getData(String topic) {
        TopicQueue topicQueue = queueService.getTopicQueue(topic);
        if (topicQueue != null && !topicQueue.isEmpty()) {
            return topicQueue.getData();
        } else {
            System.out.println("No data available for the topic");
            return null;
        }
    }
}