package cn.iponkan.openapi.controller;

import cn.iponkan.openapi.feign.OpenApiClient;
import cn.iponkan.openapi.feign.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

/**
 * @author dongtangqiang
 */
@RestController
@RequestMapping("feign/order")
public class OrderController {

    @Autowired
    private OpenApiClient openApiClient;

    @RequestMapping("get")
    public Order get() throws Exception {
        return openApiClient.get(new URI("http://localhost:9999/openapi-web/service/order"), "123");
    }

}
