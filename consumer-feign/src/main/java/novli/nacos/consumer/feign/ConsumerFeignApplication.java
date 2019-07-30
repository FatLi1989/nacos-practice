package novli.nacos.consumer.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Liyanpeng
 * @date 2019/7/30 10:29
 **/

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignApplication.class, args);
    }

}