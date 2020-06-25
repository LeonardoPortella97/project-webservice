package br.mackenzie;

import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.*;

public class ClockWorkConfiguration extends Configuration {

	@NotNull
	@JsonProperty("database")
	private DataSourceFactory database = new DataSourceFactory();

	public void setDatabase(DataSourceFactory database) {
		this.database = database;
	}

	public DataSourceFactory getDatabase() {
		return database;
	}
	
	
}
