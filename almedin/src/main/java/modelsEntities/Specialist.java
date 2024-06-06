package modelsEntities;

import config.JsonParser;

public class Specialist {
	
	private int id;
	
	private String name;
	
	private String speciality;
	
	private String ubication;
	
	private JsonParser schedule;
	
	public Specialist(int id, String name, String speciality, String ubication, JsonParser schedule) {
		super();
		this.id = id;
		this.name = name;
		this.speciality = speciality;
		this.ubication = ubication;
		this.schedule = schedule;
	}

	public Specialist() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getUbication() {
		return ubication;
	}

	public void setUbication(String ubication) {
		this.ubication = ubication;
	}

	public JsonParser getSchedule() {
		return schedule;
	}

	public void setSchedule(JsonParser schedule) {
		this.schedule = schedule;
	}
}
