package novli.nacos.consumer.feign.fallback;

import novli.nacos.consumer.feign.service.ConsumerService;
import org.springframework.stereotype.Component;

/**
 * @author novLi
 * @date 2019年07月30日 11:19
 */
@Component
public class ConsumerServiceFallBack implements ConsumerService {

    @Override
    public String echo(String message) {
        return "provider fallback";
    }

    @Override
    public String sayHi() {
        return "hi fallback";
    }
}
