package modelsDTO;

public class UserDTO {

	//Attributes
	private Long id;
	private String userName;
	private String userRole;

	//Constructors
	public UserDTO(Long id, String userName,String userRole){
		this.id = id;
		this.userName = userName;
		this.userRole = userRole;
	}

	public UserDTO(){}

	//Getters and Setters
	public Long getId(){
		return id;
	}
	public void setId(Long id){
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
}
