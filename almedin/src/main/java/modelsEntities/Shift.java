package modelsEntities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Shifts")
public class Shift {
	//Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "date")
	@Temporal(TemporalType.DATE)
	private LocalDateTime date;

	@Column(name = "motive")
	private String motive;

	@Column(name = "turno_state")
	private boolean turnoState;
	
	@ManyToOne
    @JoinColumn(name = "id_user", referencedColumnName = "id")
    private User user;

	@ManyToOne
	@JoinColumn(name = "id_specialist", referencedColumnName = "id")
	private Specialist specialist;
	
	//Constructors

	public Shift() {

    }

	//constructor que setea por defecto la fecha y el estado
	public Shift(String motive, User user, Specialist specialist) {
		this.motive = motive;
		this.user = user;
		this.specialist = specialist;
		this.date = LocalDateTime.now();
		this.turnoState = true;
	}

	public Shift(Long id, Specialist specialist, User user, String motive, boolean turnoState, LocalDateTime date) {
		this.id = id;
		this.specialist = specialist;
		this.user = user;
		this.motive = motive;
		this.turnoState = turnoState;
		this.date = date;
	}

//Getters and Setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public String getMotive() {
		return motive;
	}

	public void setMotive(String motive) {
		this.motive = motive;
	}

	public boolean isTurnoState() {
		return turnoState;
	}

	public void setTurnoState(boolean turnoState) {
		this.turnoState = turnoState;
	}

	public Specialist getSpecialist() {
		return specialist;
	}

	public void setSpecialist(Specialist specialist) {
		this.specialist = specialist;
	}
}
