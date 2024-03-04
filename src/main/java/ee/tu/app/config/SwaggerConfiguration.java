package ee.tu.app.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Primary
@Configuration
@RequiredArgsConstructor
public class SwaggerConfiguration {

    @Bean
    public OpenAPI tuServerOpenAPI() {
        return new OpenAPI()
                .info(info())
                .components(components());
    }

    private Components components() {
        return new Components();
    }

    private Info info() {
        return new Info().title("TU Server API").version("v1");
    }
}
