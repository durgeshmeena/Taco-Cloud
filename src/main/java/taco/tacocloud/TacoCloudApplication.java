package taco.tacocloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// @SpringBootApplication
// public class TacoCloudApplication {

// 	public static void main(String[] args) {
// 		SpringApplication.run(TacoCloudApplication.class, args);
// 	}

// }

/* 
new WebConfig configuration class to house the view controller declaration. 
But any configuration class can implement WebMvcConfigurer
and override the addViewController method. For instance, you could have added
the same view controller declaration to the bootstrap TacoCloudApplication class
like this:
*/

@SpringBootApplication
public class TacoCloudApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(TacoCloudApplication.class, args);
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("home");
	}
}
