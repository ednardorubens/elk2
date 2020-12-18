FROM openjdk:14-jdk-alpine
COPY target/elk2-jar-with-dependencies.jar elk2.jar
ENTRYPOINT ["sh", "-c", "sleep 10 && java ${JAVA_OPTS} -jar elk2.jar ${0} ${@}"]