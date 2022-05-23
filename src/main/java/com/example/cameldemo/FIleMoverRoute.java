package com.example.cameldemo;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FIleMoverRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:///Users/deepshivam/IdeaProjects/camel-demo/src/main/resources/camelRoute")
                .log("${headers}")
                .log("${body}")
                .to("file:///Users/deepshivam/IdeaProjects/camel-demo/src/main/resources/camelRoute/processed");
    }
}
