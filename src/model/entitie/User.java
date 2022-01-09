package model.entitie;

import java.util.Date;
import java.util.Objects;

public class User {
	
	private String name;
	private Date date;
	
	public User() {
		
	}
	
	public User(String name, Date date) {
		this.name = name;
		this.date = date;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(name, other.name);
	}
	
	@Override
	public String toString() {
		return getName() + " " + getDate();
	}
	

}
