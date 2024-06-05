package modelsEntities;

import java.time.LocalDateTime;

public class Recipes {
	
	private LocalDateTime shipmentDate;
	
	private String description;
	
	private boolean active;

	
	//Constructores
	
	public Recipes() {
		super();
	}	
	
	public Recipes(LocalDateTime shipmentDate, String description, boolean active) {
		super();
		this.shipmentDate = shipmentDate;
		this.description = description;
		this.active = active;
	}

	
}
