package si.petrol.spring.config;

import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;

public class Initializer extends AbstractHttpSessionApplicationInitializer {
    public Initializer() {
        super(SessionConfig.class);
    }
}
