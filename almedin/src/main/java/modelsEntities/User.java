package modelsEntities;

import java.time.LocalDateTime;

public class User {
	
	private String userName;
	private LocalDateTime date;
	
	//Contructores
	
	public User() {
		super();
	}
	
	public User(String userName, LocalDateTime date) {
		super();
		this.userName = userName;
		this.date = date;
	}
	
	
}
