# INTRODUCTION
<br/>
in this project we will foccus on understanding the core configuration of kafka in kraft-mode. 

## CORE ENVIRONMENT

`KAFKA_CFG_NODE_ID=0` <br/>
In kraft mode, each node mush have a unique id. In this example this node will have id of 0.
<br/>
<br/>
```
NODE:
Refers to a single physical or virtual machine (or instance) running in a Kafka cluster.
A node may run a Kafka broker process (the main Kafka service), but technically, it can 
also host other components (like ZooKeeper in older setups or additional services).
```
<br/>

`KAFKA_CFG_PROCESS_ROLES=controller,broker` <br/>
Specifies the roles this Kafka node will perform. Controller --> Manages metadata, oversees partition assignments, and performs administrative tasks in KRaft mode. broker --> Handles client requests (from producers and consumers) and stores partition data.
<br/>

`- KAFKA_CFG_LISTENERS=INTERNAL://:9092,CONTROLLER://:9093` <br/>
kafka specifies that internal communication withing the container will use locahost:9092 AND the communication between brokers 
in one cluster will use "kafka:9093" (which will be specified in `KAFKA_CFG_CONTROLLER_QUORUM_VOTERS`
<br/>

