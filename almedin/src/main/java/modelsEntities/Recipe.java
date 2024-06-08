package modelsEntities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Recipes")
public class Recipe {

	//Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "shipmentDate")
	@Temporal(TemporalType.DATE)
	private LocalDateTime shipmentDate;

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

	public Recipe(LocalDateTime shipmentDate, String description, boolean active) {
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

	public LocalDateTime getShipmentDate() {
		return shipmentDate;
	}

	public void setShipmentDate(LocalDateTime shipmentDate) {
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


}
