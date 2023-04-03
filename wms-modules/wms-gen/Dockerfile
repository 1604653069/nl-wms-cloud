FROM anapsix/alpine-java:8_server-jre_unlimited

MAINTAINER newland

RUN mkdir -p /wms/gen/logs

WORKDIR /wms/gen

ENV SERVER_PORT=9202

EXPOSE ${SERVER_PORT}

ADD ./target/wms-gen.jar ./app.jar

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-Dserver.port=${SERVER_PORT}", "-jar", "app.jar"]
