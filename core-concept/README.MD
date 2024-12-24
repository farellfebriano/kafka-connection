# INTRODUCTION
<br/>
in this project we will foccus on understanding the core configuration of kafka in kraft-mode. 

## CORE ENVIRONMENT

`KAFKA_CFG_NODE_ID=0` <br/>
In kraft mode, each node mush have a unique id. In this example this node will have id of 0.


```
`node`
Refers to a single physical or virtual machine (or instance) running in a Kafka cluster.
A node may run a Kafka broker process (the main Kafka service), but technically, it can also host other components (like ZooKeeper in older setups or additional services).
```
