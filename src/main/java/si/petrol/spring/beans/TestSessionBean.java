package si.petrol.spring.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Service
public class TestSessionBean implements Serializable {
    private String value = "";

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
