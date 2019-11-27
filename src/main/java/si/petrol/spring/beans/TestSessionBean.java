package si.petrol.spring.beans;

import java.io.Serializable;

public class TestSessionBean implements Serializable {

    private String value = "";

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
