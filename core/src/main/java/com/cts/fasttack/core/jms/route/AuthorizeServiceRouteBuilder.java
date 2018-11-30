package com.cts.fasttack.core.jms.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * JMS route builder for authorizeService queue
 *
 * @author a.lipavets
 */
@Component
public class AuthorizeServiceRouteBuilder extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("jms:queue:FASTTACK.MDES.authorizeService").routeId("authorizeService")
                .routeId("authorizeServiceRoute")
                .process("authorizeServiceProcessor");
    }
}
