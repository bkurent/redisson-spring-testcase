package si.petrol.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class MyBean {

    @Autowired
    private TestSessionBean testSessionBean;

    public void manageSessionBean() {
        if (testSessionBean.getValue() == null || testSessionBean.getValue().equals("")) {
            testSessionBean.setValue("123");
        }
        System.out.println("Value : " + testSessionBean.getValue()); //tukaj se vedno izpisuje prazen string "" !!!!
    }
}
