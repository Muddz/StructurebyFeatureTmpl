package com.my.service.template.features.feature1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//Read more about testing with Spring Boot here: https://docs.spring.io/spring-framework/docs/6.0.4/reference/html/testing.html#testing-introduction
//and here: https://www.baeldung.com/spring-boot-testing

@SpringBootTest
public class FeatureServiceTest {

    @Autowired
    FeatureService featureService;

    @Test
    public void getGreetingTest(){
        Assertions.assertNotNull(featureService.getGreeting());
    }

}
