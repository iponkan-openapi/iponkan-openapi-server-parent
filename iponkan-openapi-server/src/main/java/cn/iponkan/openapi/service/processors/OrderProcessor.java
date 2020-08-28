package cn.iponkan.openapi.service.processors;

import cn.iponkan.openapi.annotation.Tx;
import cn.iponkan.openapi.entity.OrderDto;
import org.springframework.stereotype.Component;

/**
 * @author dongtangqiang
 */
@Component
public class OrderProcessor implements Processor<OrderDto, String> {

    @Tx
    public String process(OrderDto source) throws Exception {
        // do process
        return "success";
    }
}
