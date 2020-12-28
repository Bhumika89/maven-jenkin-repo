FROM openjdk:latest
ADD target/SampleProject-0.0.1-SNAPSHOT.jar demo.java
ENTRYPOINT ["java","-jar","demo.java"]
EXPOSE 9998
