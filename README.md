# SpringBootKafkaConsumerApplication

# 1. Install kafka

Start the server

Start ZooKeeper server: bin/zookeeper-server-start.sh config/zookeeper.properties

Start the Kafka server: bin/kafka-server-start.sh config/server.properties

# 2. Create a topic

bin/kafka-topics.sh --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic mytopic

View topics bin/kafka-topics.sh --list --bootstrap-server localhost:9092

# 3. Use the kafka producer from kafka itself to send our test data to your topic

Jsonl file zcat stream.jsonl.gz | kafka-console-producer --broker-list localhost:9092 --topic mytopic
