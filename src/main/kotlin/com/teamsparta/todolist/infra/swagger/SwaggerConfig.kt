package com.teamsparta.todolist.infra.swagger

import io.swagger.v3.oas.models.Components
import io.swagger.v3.oas.models.OpenAPI
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.lang.ProcessHandle.Info

@Configuration
class SwaggerConfig {

    @Bean
    fun openAPI(): OpenAPI = OpenAPI()
        .components(Components())
        .info(
            io.swagger.v3.oas.models.info.Info()
                .title("ToDo API")
                .description("ToDo API schema")
                .version("1.0.0")
        )
}