package com.newland.stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.metrics.buffering.BufferingApplicationStartup;

/**
 * SpringCloud-Stream-MQ 案例项目
 *
 * @author newland
 */
@SpringBootApplication
public class WmsStreamMqApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(WmsStreamMqApplication.class);
        application.setApplicationStartup(new BufferingApplicationStartup(2048));
        application.run(args);
        System.out.println("(♥◠‿◠)ﾉﾞ  MQ案例模块启动成功   ლ(´ڡ`ლ)ﾞ  ");
    }

}
