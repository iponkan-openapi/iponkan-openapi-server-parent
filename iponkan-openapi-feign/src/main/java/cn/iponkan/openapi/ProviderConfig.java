package cn.iponkan.openapi;

import cn.iponkan.openapi.feign.OpenApiClient;
import feign.Feign;
import feign.Logger;
import feign.Target;
import feign.codec.Decoder;
import feign.codec.Encoder;
import org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author dongtangqiang
 */
@Configuration
@Import({
        FeignClientsConfiguration.class, HttpMessageConvertersAutoConfiguration.class})
public class ProviderConfig {

    @Bean
    public OpenApiClient openApiClient(Decoder decoder, Encoder encoder) {
        return Feign.builder() //
                .encoder(encoder) //
                .decoder(decoder) //
                .logLevel(Logger.Level.FULL) //
                .target(Target.EmptyTarget.create(OpenApiClient.class));
    }
}
