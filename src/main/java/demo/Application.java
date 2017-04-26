package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by bipin on 4/25/2017.
 */
@SpringBootApplication
public class Application {

    final static String queueName = "spring-boot";

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(Application.class, args);
    }

}
