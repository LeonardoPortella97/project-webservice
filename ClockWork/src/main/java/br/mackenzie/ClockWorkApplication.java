package br.mackenzie;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class ClockWorkApplication extends Application<ClockWorkConfiguration> {

    public static void main(final String[] args) throws Exception {
        new ClockWorkApplication().run(args);
    }

    @Override
    public String getName() {
        return "ClockWork";
    }

    @Override
    public void initialize(final Bootstrap<ClockWorkConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final ClockWorkConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
