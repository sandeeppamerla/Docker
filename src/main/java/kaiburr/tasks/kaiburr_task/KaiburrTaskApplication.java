package kaiburr.tasks.kaiburr_task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableSwagger2
public class KaiburrTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(KaiburrTaskApplication.class, args);
	}

	public Docket apis() {
		return new Docket (DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("kaiburr.tasks.kaiburr_task")).build();
	}
}

