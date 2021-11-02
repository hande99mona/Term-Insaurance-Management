package Test.Insurance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="ADDRESS_TBL")
public class Address {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ADDRESS_ID")
    private int address_Id;
	@Column(name="ADDRESS_CITY")
	private String city;
	@Column(name="ADDRESS_STATE")
	private String state;
	@Column(name="ADDRESS_ZIPCODE")
	private int zipcode;
	
	/*@OneToOne(mappedBy="address")
	private User user;*/
	
	
public int getAddress_Id() {
		return address_Id;
	}

	public void setAddress_Id(int address_Id) {
		this.address_Id = address_Id;
	}
/*
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}*/

	//Constructor	
	public Address(String city, String state, int zipcode) {
		super();
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	
	public Address() {
		super();
		
	}
//getter and setter.......	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

//toString
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", zipcode=" + zipcode + "]";
	}

}
