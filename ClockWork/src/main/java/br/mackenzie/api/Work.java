package br.mackenzie.api;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Work {
	@JsonProperty
	private int id;
	@JsonProperty
	private String name;
	@JsonProperty
	private LocalDateTime date;
	@JsonProperty
	private double timeWorked;

	public Work(int id, String name, LocalDateTime  date, double timeWorked) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.timeWorked = timeWorked;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public double getTimeWorked() {
		return timeWorked;
	}

}
