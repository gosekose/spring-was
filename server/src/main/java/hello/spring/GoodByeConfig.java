package hello.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GoodByeConfig {

    @Bean
    public GoodByeController goodByeController() {
        return new GoodByeController();
    }

}
