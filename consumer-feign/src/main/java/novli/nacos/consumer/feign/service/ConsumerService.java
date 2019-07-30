package novli.nacos.consumer.feign.service;

import novli.nacos.consumer.feign.fallback.ConsumerServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author novLi
 * @date 2019年07月30日 10:45
 */
@FeignClient(value = "nacos-provider", fallback = ConsumerServiceFallBack.class)
public interface ConsumerService {

    @GetMapping(value = "/echo/{message}")
    String echo(@PathVariable("message") String message);


    @GetMapping(value = "/hi")
    String sayHi();

}
