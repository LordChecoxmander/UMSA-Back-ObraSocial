package modelsEntities;

import config.JsonParser;
import jakarta.persistence.*;


@Entity
@Table(name = "Specialists")
public class Specialist {

	//Atributes
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "speciality")
	private String speciality;

	@Column(name = "ubication")
	private String ubication;

	//nose xq esta mierda no se reconoce....
	@Column(name = "schedule")
	private JsonParser schedule;


	//Constructors

	public Specialist( String name, String speciality, String ubication, JsonParser schedule) {
		super();
		this.name = name;
		this.speciality = speciality;
		this.ubication = ubication;
		this.schedule = schedule;
	}

	public Specialist() {
	}

	//Getters and Setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
