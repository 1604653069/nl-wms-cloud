FROM anapsix/alpine-java:8_server-jre_unlimited

MAINTAINER newland

RUN mkdir -p /wms/resource/logs \
    /wms/resource/temp \
    /wms/skywalking/agent

WORKDIR /wms/resource

ENV SERVER_PORT=9204

EXPOSE ${SERVER_PORT}

ADD ./target/wms-resource.jar ./app.jar

ENTRYPOINT ["java", \
            "-Djava.security.egd=file:/dev/./urandom", \
            "-Dserver.port=${SERVER_PORT}", \
#            "-Dskywalking.agent.service_name=wms-resource", \
#            "-javaagent:/ruoyi/skywalking/agent/skywalking-agent.jar", \
            "-jar", "app.jar"]
