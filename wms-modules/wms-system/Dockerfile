FROM anapsix/alpine-java:8_server-jre_unlimited

MAINTAINER newland

RUN mkdir -p /wms/system/logs \
    /wms/system/temp \
    /wms/skywalking/agent

WORKDIR /wms/system

ENV SERVER_PORT=9201

EXPOSE ${SERVER_PORT}

ADD ./target/wms-system.jar ./app.jar

ENTRYPOINT ["java", \
            "-Djava.security.egd=file:/dev/./urandom", \
            "-Dserver.port=${SERVER_PORT}", \
#            "-Dskywalking.agent.service_name=wms-system", \
#            "-javaagent:/ruoyi/skywalking/agent/skywalking-agent.jar", \
            "-jar", "app.jar"]
