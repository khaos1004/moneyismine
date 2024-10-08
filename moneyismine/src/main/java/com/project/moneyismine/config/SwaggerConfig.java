package com.project.moneyismine.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(apiinfo());
    }

    private Info apiinfo() {
        return new  Info()
                .title("Swagger")
                .description("Swagger 확인")
                .version("1.0");
    }
}
