package modelsEntities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;


@Entity
@Table(name = "Specialists")
public class User {
	//Atributes
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "password")
	private String password;

	@Column(name = "date")
	@Temporal(TemporalType.DATE)
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
