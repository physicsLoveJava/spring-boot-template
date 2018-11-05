package com.dummy.app.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan({
        "com.dummy.app.biz",
        "com.dummy.app.entity.dummy"
})
@EntityScan({
        "com.dummy.app.entity"
})
@Configuration
public class ComponentConfig {
}
