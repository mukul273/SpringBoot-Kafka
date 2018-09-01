Welcome to Apache Kafka and Spring Boot Integration for producer as well as consumer.

Please visit https://kafka.apache.org/quickstart for running the instance of kafka and zookeeper.

In case if you are not able to get to the URl then below are the details:

1. To start the zookeeper
bin/zookeeper-server-start.sh config/zookeeper.properties

2. to start the kafka cluster server
bin/kafka-server-start.sh config/server.properties

3. to manually create a new topic
bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic test (replace test with your topic name)

4. to list the topics
bin/kafka-topics.sh --list --zookeeper localhost:2181 (This will display topics list)

5. to send a msg using producer
bin/kafka-console-producer.sh --broker-list localhost:9092 --topic test(replace test with your topic name)

6. to see the consumer consuming the message
bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic test --from-beginning(replace test with your topic name)

7. Remember to read about the group(s) in kafka, very useful information
https://cwiki.apache.org/confluence/display/KAFKA/Consumer+Group+Example

My code uses lombok to avoid biler plate code.

There is active information in the code for your information.

Enjoy !!!