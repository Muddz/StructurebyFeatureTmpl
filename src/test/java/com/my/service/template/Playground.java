package com.my.service.template;

import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;


/*
The 'Playground' class is used for quick and plain java code testing and experimenting without loading up
the entire Spring Boot context/framework.
 */

public class Playground {

    @Test
    public void Play() {

        var msg = "Hello World!";
        var display = StringUtils.capitalize(msg);
        System.out.println(display);

    }

}
