package kz.bee.example.ejb;

import javax.ejb.Stateless;

@Stateless
public class EjbService {

    public String sayHello(String name) {
        if (null == name) {
            return "Hello, Anonymous";
        } else {
            return "Hello, " + name;
        }
    }
}
