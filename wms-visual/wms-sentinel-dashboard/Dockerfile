FROM anapsix/alpine-java:8_server-jre_unlimited

MAINTAINER newland

RUN mkdir -p /wms/sentinel-dashboard/logs \
    /wms/skywalking/agent

WORKDIR /wms/sentinel-dashboard

EXPOSE 8718

ADD ./target/wms-sentinel-dashboard.jar ./app.jar

ENTRYPOINT ["java", \
            "-Djava.security.egd=file:/dev/./urandom", \
#            "-Dskywalking.agent.service_name=wms-sentinel-dashboard", \
#            "-javaagent:/ruoyi/skywalking/agent/skywalking-agent.jar", \
            "-jar", "app.jar"]
