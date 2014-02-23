package com.robertcboll.dropwizard.daemon.example;

import com.robertcboll.dropwizard.daemon.DaemonApplication;
import com.robertcboll.dropwizard.daemon.example.resource.EmptyResource;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * A sample daemonized application.
 */
public class DaemonizedApplication extends DaemonApplication<Configuration> {

    public static void main(String[] args) throws Exception {
        new DaemonizedApplication().daemonize().run(args);
    }

    @Override
    public void initialize(Bootstrap<Configuration> bootstrap) {

    }

    @Override
    public void run(Configuration configuration, Environment environment) throws Exception {
        environment.jersey().register(new EmptyResource());
    }
}
