package br.com.erudio.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiCOnfig {

    public OpenAPI customOpenAPI() {
        return new OpenAPI().info(new Info()
                .title("RESTful API with Java 18 and Spring Boot")
                .version("v1")
                .description("Some description about your API")
                .termsOfService("https://pub.erudio.com.br")
                .license(new License()
                        .name("Apache 2.0")
                        .url("https://pub.erudio.com.br")
                )
        );
    }
}
