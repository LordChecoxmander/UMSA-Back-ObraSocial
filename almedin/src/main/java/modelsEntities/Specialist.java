package modelsEntities;

import config.JsonParser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.persistence.*;

@ApiModel(value= "specialist", description = "representacion de los medicos especialistas")
@Entity
@Table(name = "Specialists")
public class Specialist {

	//Atributes
	@ApiModelProperty(notes="id numerico autoincremental y unico de cada turno")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ApiModelProperty(notes="contrasela del especialista", example = "unaContraDificil01", required = true)
	@Column(name = "password")
	private String password;

	@ApiModelProperty(notes="nombre y apellido del especialista", example = "pedro sanchez", required = true)
	@Column(name = "name")
	private String name;

	@ApiModelProperty(notes="especialidad del medico", example = "oftalmologo", required = true)
	@Column(name = "speciality")
	private String speciality;

	@ApiModelProperty(notes="ubicacion del medico", example = "Buenos Aires, Mar del Plata", required = true)
	@Column(name = "ubication")
	private String ubication;

	@ApiModelProperty(notes="horarios de atencion del medico", required = true)
	@Column(name = "schedule")
	private String schedule;


	//Constructors
	public Specialist() {
	}

	public Specialist(Long id, String password, String name, String speciality, String ubication,
					  String schedule) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.speciality = speciality;
		this.ubication = ubication;
		this.schedule = schedule;
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

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
