package modelsEntities;

import java.time.LocalDateTime;

public class Shifts {
	
	private int id;
	
	private LocalDateTime date;
	
	private String motive;
	
	private boolean turnoState;	

	public Shifts() {
	}
	
	public Shifts(int id, LocalDateTime date, String motive, boolean turnoState) {
		super();
		this.id = id;
		this.date = date;
		this.motive = motive;
		this.turnoState = turnoState;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

}
