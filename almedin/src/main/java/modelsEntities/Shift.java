package modelsEntities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Shifts")
public class Shift {
	//Atributes
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "date")
	@Temporal(TemporalType.DATE)
	private LocalDateTime date;

	@Column(name = "motive")
	private String motive;

	@Column(name = "turnoState")
	private boolean turnoState;

	@Column(name = "specialist")
	@OneToOne
	private Specialist specialist;



	//Constructors

	public Shift() {

    }
	
	public Shift(LocalDateTime date, String motive, boolean turnoState, Specialist specialist) {
		super();
		this.date = date;
		this.motive = motive;
		this.turnoState = turnoState;
        this.specialist = specialist;
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
