# ELK2
Pipeline de coleta, transformação e análise de logs usando Elasticsearch, Logstash, Kibana e Kafka. 

## Requisitos
 - [JDK 8](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html)
 - [Maven](https://maven.apache.org/download.cgi)
 - [Docker](https://www.docker.com/get-started)

## Construir e rodar o projeto
```
$ mvn clean package
$ docker-compose up
```
## Parar o projeto
```
$ docker-compose down
```

## Recursos
 - [Elasticsearch](https://www.elastic.co/pt/what-is/elasticsearch)
 - [Logstash](https://www.elastic.co/pt/logstash)
 - [Kibana](https://www.elastic.co/pt/what-is/kibana)
 - [Kafka](https://www.confluent.io/what-is-apache-kafka)