package com.my.service.template.features.feature1;


import org.springframework.stereotype.Service;

@Service
// 'public' access modifier since a Service class may be invoked by other Features too.
public class FeatureService {

    public String getGreeting(){
        return "Hello World!";
    }

}
