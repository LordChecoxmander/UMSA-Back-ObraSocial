package modelsEntities;

import java.time.LocalDateTime;

public class Recipes {
	
	private LocalDateTime shipmentDate;
	
	//Constructores
	
	public Recipes() {
	}	
	
	public Recipes(LocalDateTime shipmentDate, String description, boolean active) {
		super();
		this.shipmentDate = shipmentDate;
		this.description = description;
		this.active = active;
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

	private String description;
	
	private boolean active;

}
