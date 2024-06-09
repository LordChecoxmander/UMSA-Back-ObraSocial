package modelsEntities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Recipes")
public class Recipe {

	//Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "shipment_date")
	@Temporal(TemporalType.DATE)
	private LocalDate shipmentDate;

	@Column(name = "description")
	private String description;

	@Column(name = "active")
	private boolean active;
	
	@OneToOne
    @JoinColumn(name = "id_shift", referencedColumnName = "id")
    private Shift shift;
	
	//Constructors
	
	public Recipe() {
	}

	public Recipe(LocalDate shipmentDate, String description, boolean active) {
		this.shipmentDate = shipmentDate;
		this.description = description;
		this.active = active;
	}

	//Getters and Setter

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getShipmentDate() {
		return shipmentDate;
	}

	public void setShipmentDate(LocalDate shipmentDate) {
		this.shipmentDate = shipmentDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}


	public Shift getShift() {
		return shift;
	}
}
