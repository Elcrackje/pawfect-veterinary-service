package pe.upc.pawfectcaremicroservices.veterinaryservice.infrastructure.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Veterinary Service API")
                        .version("1.0")
                        .description("API for Veterinary Service"))
                .servers(List.of(
                        new Server()
                                .url("https://pawfect-gateway-service.azurewebsites.net/veterinary-service")
                                .description("Gateway Server")/*,
                        new Server()
                                .url("http://localhost:8092")
                                .description("Direct Service (Development)")*/
                ));
    }
}
