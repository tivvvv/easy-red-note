package com.tiv.common.config;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Swagger配置类
 */
@Component
@Data
@EnableOpenApi
@EnableWebMvc
@Slf4j
public class SwaggerConfig {

    @Bean
    public Docket ApiDoc() {
        return new Docket(DocumentationType.OAS_30)
                .groupName("用户端服务接口文档")
                .pathMapping("/")
                .enable(true)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.tiv"))
                .paths(PathSelectors.ant("/api/**"))
                .build();

    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("easy-red-note")
                .description("接口文档")
                .contact(new Contact("tiv", "https://github.com/tivvvv", "tiv@tiv.com"))
                .version("V1.0")
                .build();
    }

}
