package modelsDTO;
import config.JsonParser;

public class ResponseSpecialistDTO {

	//Attributes
	private String name;
	private String speciality;
	private String ubication;
	private JsonParser schedule;

	//Constructors
	public ResponseSpecialistDTO() {}
	public ResponseSpecialistDTO(String name, String speciality, String ubication, JsonParser schedule) {}

	//Getters and Setters

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
