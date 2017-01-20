package ro.mve.trackfit;

import java.security.Principal;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableOAuth2Client
public class StartApplication extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(StartApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
	}

	@RequestMapping("/user")
	public Principal user(Principal principal) {
		return principal;
	}

	@RequestMapping("/echo")
	public String user() {
		return "echo " + new Date().toString();
	}

}
