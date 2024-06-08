package modelsDTO;

import java.io.Serializable;

public class RecipeDTO implements Serializable {

	// Attributes
	private Long id;
	private Long idShift;
	private String description;

	// Constructors
	public RecipeDTO(Long id, Long idShift, String description) {

		this.id = id;
		this.idShift = idShift;
		this.description = description;
	}

	public RecipeDTO() {
	}


	
	// Getters and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdShift() {
		return idShift;
	}

	public void setIdShift(Long idShift) {
		this.idShift = idShift;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
}
