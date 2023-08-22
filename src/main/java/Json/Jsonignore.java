package Json;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Jsonignore {
public String UserName;
public int UserId;
@JsonIgnore
public String password;
public Jsonignore() {
	
}

public Jsonignore(String userName, int userId, String password) {
	super();
	UserName = userName;
	UserId = userId;
	this.password = password;
}

}
