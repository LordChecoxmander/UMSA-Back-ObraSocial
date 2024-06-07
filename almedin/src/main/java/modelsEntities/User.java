package modelsEntities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;


@Entity
@Table(name = "Specialists")
public class User {
	//Atributes
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "userName")
	private String userName;

	@Column(name = "date")
	@Temporal(TemporalType.DATE)
	private LocalDateTime date;

	// nose si estara bien poder el enumeraten y el onetoone juntos
	@Column(name = "userRole")
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

	public User(String userName, LocalDateTime date, UserRole userRole, List<Shift> shifts, List<Recipe> recipes) {
		this.userName = userName;
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

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
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

}
