package brbrbrbrbr.healthbr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.security.config.annotation.web.configurers.DefaultLoginPageConfigurer;

@EnableJpaRepositories
@Import(RepositoryRestMvcConfiguration.class)
@SpringBootApplication(
        exclude = {
                SecurityAutoConfiguration.class
        },
        scanBasePackages = {"brbrbrbrbr"}
)
public class HealthbrApplication {

    public static final String PROJECT_NAME = "Heathbr";

    public static void main(String[] args) {
        SpringApplication.run(HealthbrApplication.class, args);
    }

}
