package com.mt.microservice.microservice_architecture;

import com.mt.microservice.microservice_architecture.liceneses.MicroserviceArchitectureApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MicroserviceArchitectureApplication.class);
    }

}
