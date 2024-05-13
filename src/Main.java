import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Create QueueService instance
        QueueService queueService = new QueueService();

        // Add topics to the service
        queueService.addTopic("t1");
        queueService.addTopic("t2");

        // Create Producer and Consumer instances
        Producer producer = new Producer(queueService);
        Consumer consumer = new Consumer(queueService);

        // Add data to topics using Producer API

        producer.addData("t1", List.of(1,2,3,4));
        producer.addData("t2", "ABCD");

        // List available topics
        TopicListing topicListing = new TopicListing(queueService);
        Set<String> topics = topicListing.listTopics();
        System.out.println("Available topics: " + topics);

        // Get data from topics using Consumer API
        Object data1 = consumer.getData("t1");
        System.out.println("Data from t1: " + data1);

        Object data2 = consumer.getData("t2");
        System.out.println("Data from t2: " + data2);

        // Try to get data from non-existing topic
        Object data3 = consumer.getData("t3");
        System.out.println("Data from topic3: " + data3); // Should print "No data available for the topic"
    }
}
