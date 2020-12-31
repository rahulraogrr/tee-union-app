package org.tee.union.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfiguration {

    @Bean
    public OpenAPI teeUnionOpenAPI(){
        return new OpenAPI()
                .info(new Info().title("TEE 1104 Union API")
                        .description("Telangana Electricity Employees 1104 Union Application")
                        .version("v0.0.1")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")))
                        .externalDocs(new ExternalDocumentation()
                        .description("TEE 1104 Union Documentation")
                        .url("https://github.com/rahulraogrr"));
    }

}