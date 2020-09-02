package cn.iponkan.openapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author dongtangqiang
 */
@Configuration
@ComponentScan("cn.iponkan.openapi")
public class SwaggerConfig {
    @Bean
    public Docket swaggerSpringMvcPlugin() {
        return new Docket(DocumentationType.SWAGGER_2) //
                .apiInfo(swaggerDemoApiInfo()) //
                .select() //
                .build();
    }

    private ApiInfo swaggerDemoApiInfo() {
        // 构建联系实体，在UI界面会显示
        Contact contact = new Contact("", "", "");
        return new ApiInfoBuilder().contact(contact)
                // 文档标题
                .title("OpenApi RESTful API文档")
                // 文档描述
                .description("OpenApi RESTful API文档")
                // 文档版本
                .version("1.0.0") //
                .build();
    }
}
