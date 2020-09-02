package cn.iponkan.openapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author dongtangqiang
 */
@SpringBootApplication(exclude = {
        HibernateJpaAutoConfiguration.class, DataSourceAutoConfiguration.class,
        RabbitAutoConfiguration.class}, scanBasePackages = "cn.iponkan.openapi")
@EnableSwagger2
public class Iponkan {
    public static void main(String[] args) {
        SpringApplication.run(Iponkan.class, args);
    }
}
