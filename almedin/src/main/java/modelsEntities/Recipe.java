package modelsEntities;

import io.swagger.annotations.ApiModelProperty;
import jakarta.persistence.*;
import java.time.LocalDate;
import io.swagger.annotations.ApiModel;



@ApiModel(value= "recipe", description = "representacion de las recetas brindadas por los medicos")
@Entity
@Table(name = "Recipes")
public class Recipe {

	//Attributes
	@ApiModelProperty(notes="id numerico autoincremental y unico de cada receta")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ApiModelProperty(notes="fecha limite de la receta", example = "3/08/2024", required = true)
	@Column(name = "shipment_date")
	private LocalDate shipmentDate;

	@ApiModelProperty(notes="descripcion de la receta", example = "100mg de ibuprofeno cada 6 hs",
			required = true)
	@Column(name = "description")
	private String description;

	@ApiModelProperty(notes="indica si la receta es valida", example = "3/08/2024", required = true)
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
