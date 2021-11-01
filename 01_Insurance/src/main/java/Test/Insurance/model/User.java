package Test.Insurance.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="USER_TBL")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int userId;
	
	@Column(name="USER_FULLNAME")
	 private String fullname;
	@Column(name="USER_MOBILE")
	 private int mobile;
	@Column(name="USER_GENDER")
	 private Gender gender;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name=" address_Id")
	 Address address;
	@Column(name="USER_EMAIL")
	 private String email;
	@Column(name="USER_AGE")
	private int age;
	@Column(name="USER_DOB")
    private Date dob;
	@Column(name="USER_INCOME")
     private double income;
	@Column(name="USER_OCCUPATION")
     private String occupation;
	@Column(name="USER_EDUCATION")
     private String education;
	@Column(name="USER_USERNAME")
     private String username;
	@Column(name="USER_PASSWORD")
     private String password;
	
	
	public User() {
		super();
	}

	public User(int id, String fullname, int mobile, Gender gender, String email, int age, Date dob,
			double income, String occupation, String education, String username, String password) {
		super();
		this.userId= id;
		this.fullname = fullname;
		this.mobile = mobile;
		this.gender = gender;
		//this.address = address;
		this.email = email;
		this.age = age;
		this.dob = dob;
		this.income = income;
		this.occupation = occupation;
		this.education = education;
		this.username = username;
		this.password = password;
	}

	public int getId() {
		return userId;
	}

	public void setId(int id) {
		this.userId = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	/*public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}*/

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", fullname=" + fullname + ", mobile=" + mobile + ", gender=" + gender
				+ ", email=" + email + ", age=" + age + ", dob=" + dob + ", income=" + income + ", occupation="
				+ occupation + ", education=" + education + ", username=" + username + ", password=" + password + "]";
	}
	
	

	
	
	
     
     
     
	 
	
	
	
	 
			

}
