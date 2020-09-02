package cn.iponkan.openapi.service;

import cn.iponkan.openapi.entity.OrderDto;
import cn.iponkan.openapi.entity.OrderService;
import cn.iponkan.openapi.service.processors.OrderProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.UUID;

/**
 * @author dongtangqiang
 */
@RestController(OrderService.DEFAULT_CONTEXT_ID)
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderProcessor processor;

    public String post(@Valid OrderDto order) throws Exception {
        return processor.process(order);
    }

    @Override
    public OrderDto get(String number) throws Exception {
        OrderDto dto = new OrderDto();
        dto.setId(UUID.randomUUID().toString());
        dto.setNumber("20200902000001");
        dto.setSource("IPONKAN");
        return dto;
    }
}
