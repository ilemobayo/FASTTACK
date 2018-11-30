package com.cts.fasttack.core.jms.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * @author Dmitry Koval
 */
@Component
public class UpdateTokenRouteBuilder extends RouteBuilder {


    @Override
    public void configure() throws Exception {
        from("jms:queue:FASTTACK.CORE.updateToken")
                .routeId("updateToken")
                .process("updateTokenProcessor");
    }
}
