package sejong.hakathon.noti.api.common.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    private static final String SWAGGER_DESCRIPTION = """

            """;

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(apiInfo());
    }

    private Info apiInfo() {
        return new Info()
                .title("Offroad API Swagger") // API의 제목
                .description(SWAGGER_DESCRIPTION) // API에 대한 설명
                .version("v1"); // API의 버전
    }
}
