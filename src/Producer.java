public class Producer {
    private QueueService queueService;

    public Producer(QueueService queueService) {
        this.queueService = queueService;
    }

    public void addData(String topic, Object data) {
        TopicQueue topicQueue = queueService.getTopicQueue(topic);
        if (topicQueue != null) {
            topicQueue.addData(data);
        } else {
            System.out.println("Topic doesn't exist");
        }
    }
}