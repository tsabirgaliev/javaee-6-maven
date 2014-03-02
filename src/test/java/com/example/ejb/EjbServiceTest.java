package com.example.ejb;

import org.junit.Test;

public class EjbServiceTest extends EjbService {
    @Test
    public void testSayHello() {
        assert "Hello, Anonymous".equals(sayHello(null));
    }
}
