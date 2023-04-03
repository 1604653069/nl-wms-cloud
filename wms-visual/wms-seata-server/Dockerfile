FROM anapsix/alpine-java:8_server-jre_unlimited

MAINTAINER newland

RUN mkdir -p /wms/seata-server/logs \
    /wms/skywalking/agent

WORKDIR /wms/seata-server

ENV TZ=PRC
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

EXPOSE 7091
EXPOSE 8091

ADD ./target/wms-seata-server.jar ./app.jar

ENTRYPOINT ["java", \
            "-Djava.security.egd=file:/dev/./urandom", \
#            "-Dskywalking.agent.service_name=wms-seata-server", \
#            "-Dskywalking.plugin.seata.server=true", \
#            "-javaagent:/ruoyi/skywalking/agent/skywalking-agent.jar", \
            "-jar", "app.jar"]
