package com.iesb.apibiblioteca.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiDescription;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration

public class SwaggerConfig{

    @Bean
    public Docket java() {
        return new Docket(DocumentationType.SWAGGER_2).
        select().
        apis(RequestHandlerSelectors.basePackage("com.iesb.apibiblioteca")).
        paths(PathSelectors.any()).
        build().
        apiInfo(apiInfo());

    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().
        title("Api Biblioteca").
        description("Aplicação de Biblioteca").
        version("1.0.0").
        contact(new Contact("POO iesb", "https://github.com/gabrielarraes/biblioteca-api.git","patrick.silva@iesb.edu.br" )).
        build();
    }


}
