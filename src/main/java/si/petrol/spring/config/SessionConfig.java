package si.petrol.spring.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.spring.session.config.EnableRedissonHttpSession;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableRedissonHttpSession
@ComponentScan({"si.petrol.spring.beans"})
public class SessionConfig {

    @Bean
    public RedissonClient redisson() {
        return Redisson.create();
    }

}
