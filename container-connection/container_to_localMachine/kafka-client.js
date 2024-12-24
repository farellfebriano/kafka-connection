const kafka = require("kafka-node");
// for Internal entity that locate in the same docker network we can use kafka:9094
// which the name of the container it self so then other container can access it
// and for external connection we can specify out own private ip address
//const client = new kafka.KafkaClient({ kafkaHost: "192.168.254.182:9094" });
// const client = new kafka.KafkaClient({ kafkaHost: "kafka:9094" });
const Producer = kafka.Producer;
const producer = new Producer(client);

// message
const payloads = [
  { topic: "test", messages: "im alive", partition: 0 },
  { topic: "test", messages: "hi, im 192.168.254.182", partition: 0 },
];

producer.on("ready", function () {
  console.log("sending payload");
  producer.send(payloads, function (err, data) {
    console.log(data);
  });
});

producer.on("error", function (err) {
  console.log(err);
});
