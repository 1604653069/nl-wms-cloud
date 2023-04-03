FROM anapsix/alpine-java:8_server-jre_unlimited

MAINTAINER newland

RUN mkdir -p /wms/job/logs \
    /wms/job/temp \
    /wms/skywalking/agent

WORKDIR /wms/job

ENV SERVER_PORT=9203

EXPOSE ${SERVER_PORT}

ADD ./target/wms-job.jar ./app.jar

ENTRYPOINT ["java", \
            "-Djava.security.egd=file:/dev/./urandom", \
            "-Dserver.port=${SERVER_PORT}", \
#            "-Dskywalking.agent.service_name=wms-job", \
#            "-javaagent:/ruoyi/skywalking/agent/skywalking-agent.jar", \
            "-jar", "app.jar"]
