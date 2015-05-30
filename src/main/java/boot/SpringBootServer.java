package boot;


import config.WebConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;


@EnableAutoConfiguration
@ComponentScan("controllers")
@Import({WebConfig.class})
public class SpringBootServer extends SpringBootServletInitializer{

    public static void main(String[] args) {
        System.out.println("SpringBootServer.main");
        SpringApplication.run(SpringBootServer.class);
    }
}

