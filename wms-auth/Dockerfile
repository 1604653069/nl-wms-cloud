FROM anapsix/alpine-java:8_server-jre_unlimited

MAINTAINER newland

RUN mkdir -p /wms/auth/logs  \
    /wms/auth/temp  \
    /wms/skywalking/agent

WORKDIR /wms/auth

ENV SERVER_PORT=9210

EXPOSE ${SERVER_PORT}

ADD ./target/wms-auth.jar ./app.jar

ENTRYPOINT ["java", \
            "-Djava.security.egd=file:/dev/./urandom", \
            "-Dserver.port=${SERVER_PORT}", \
#            "-Dskywalking.agent.service_name=wms-auth", \
#            "-javaagent:/ruoyi/skywalking/agent/skywalking-agent.jar", \
            "-jar", "app.jar"]
