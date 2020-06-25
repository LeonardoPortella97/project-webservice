package br.mackenzie;

import org.jdbi.v3.core.Jdbi;

import br.mackenzie.db.WorkDao;
import br.mackenzie.resources.WorkResource;
import io.dropwizard.Application;
import io.dropwizard.jdbi3.JdbiFactory;
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
    	//database
    	final JdbiFactory factory = new JdbiFactory();
        final Jdbi jdbi = factory.build(environment, configuration.getDatabase(), "h2");
        WorkDao workDao = jdbi.onDemand(WorkDao.class);
    	
    	//resources
        WorkResource workResource = new WorkResource(workDao);
        environment.jersey().register(workResource);
    }



}
