package ro.mve.trackfit;

import java.security.Principal;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StartApplication 
{


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
