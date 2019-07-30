package novli.nacos.consumer.feign.controller;

import novli.nacos.consumer.feign.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author novLi
 * @date 2019年07月30日 10:44
 */
@RestController
public class NacosConsumerFeignController {

    @Autowired
    private ConsumerService consumerService;

    @PostMapping(value = "/echo/hi")
    public String echo() {
        return consumerService.echo("Hi Feign");
    }

    @PostMapping(value = "/hi")
    public String hi() {
        return consumerService.sayHi();
    }
}
