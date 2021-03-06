package org.ipap.rest.service;

import io.quarkus.test.Mock;

import javax.enterprise.context.ApplicationScoped;

@Mock
@ApplicationScoped
public class MockGreetingService extends GreetingService {

    @Override
    public String sayHello(String name) {
        return String.format("Hello %s, your id is %s",
                name,
                "1234"
        );

    }
}
