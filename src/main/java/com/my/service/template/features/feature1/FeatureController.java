package com.my.service.template.features.feature1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feature")
//No access modifier to Controller classes to make them package-private for the feature. 
class FeatureController {

    @Autowired
    FeatureService featureService;

    @GetMapping("/greeting")
    @ResponseBody
    public String getGreeting(){
        return featureService.getGreeting();
    }

}
