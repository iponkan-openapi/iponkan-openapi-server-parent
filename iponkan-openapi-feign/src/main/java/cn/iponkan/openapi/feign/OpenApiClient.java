package cn.iponkan.openapi.feign;

import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;

import java.net.URI;

/**
 * OpenApi 调用客户端
 *
 * @author dongtangqiang
 */
@FeignClient
public interface OpenApiClient {

    @RequestLine("GET get?number={number}")
    Order get(URI baseUri, @Param("number") String number);
}
