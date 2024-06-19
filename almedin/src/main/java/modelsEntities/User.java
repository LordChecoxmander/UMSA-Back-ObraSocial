package modelsEntities;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@ApiModel(value= "user", description = "representacion de los clientes de la obra social")
@Entity
@Table(name = "Specialists")
public class User {
	//Atributes
	@ApiModelProperty(notes="id numerico autoincremental y unico de cada turno")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ApiModelProperty(notes="nombre y apellido del cliente", example = "juan perez", required = true)
	@Column(name = "user_name")
	private String userName;

	@ApiModelProperty(notes="contrasela del cliente", example = "unaContraDificil01", required = true)
	@Column(name = "password")
	private String password;

	@ApiModelProperty(notes="fecha nacimiento del cliente", example = "05/02/1956", required = true)
	@Column(name = "date")
	private LocalDate date;

	// nose si estara bien poder el enumeraten y el onetoone juntos
	@Column(name = "user_role")
	@Enumerated(value = EnumType.STRING)
	//@OneToOne
	private UserRole userRole;

	@Column(name = "shifts")
	@OneToMany
	private List<Shift> shifts;

	@Column(name = "recipes")
	@OneToMany
	private List<Recipe> recipes;


	//Contructors
	
	public User() {
		super();
	}

	public User(Long id, String userName, String password, LocalDate date, UserRole userRole, List<Shift> shifts, List<Recipe> recipes) {
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.date = date;
		this.userRole = userRole;
		this.shifts = shifts;
		this.recipes = recipes;
	}

//Getters and Setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public UserRole getUserRole() {
		return userRole;
	}

	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}

	public List<Shift> getShifts() {
		return shifts;
	}

	public void setShifts(List<Shift> shifts) {
		this.shifts = shifts;
	}

	public List<Recipe> getRecipes() {
		return recipes;
	}

	public void setRecipes(List<Recipe> recipes) {
		this.recipes = recipes;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
