package Test.Insurance;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2
//   http://localhost:9090/insurance-api/swagger-ui/

public class InsuranceApp {

	public static void main(String[] args) {
		SpringApplication.run(InsuranceApp.class, args);

	}

}
