package Test.Insurance.model;

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
@Table(name="AGENT_TBL")
public class Agent {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int agentId;
	@Column(name="AGENT_NAME")
	 private String agentName;
	@Column(name="AGENT_MOBILE")
	 private int agentMobile;
	@Column(name="AGENT_INCOME")
	 private double agentIncome;
	@Column(name="AGENT_OCCUPATION")
	 private String occupation;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name=" address_Id")
	 Address address;
	@Column(name="AGENT_COMMISSION")
	private double agentCommission=0;
	@Column(name="AGENT_USERNAME")
	 private String username;
	@Column(name="AGENT_PASSWORD")
	 private String password;
	 
	
	
	
	public Agent() {
		super();
	}


	public Agent(int agentId, String agentName, int agentMobile, double agentIncome, String occupation,
			 String username, String password) {
		super();
		this.agentId = agentId;
		this.agentName = agentName;
		this.agentMobile = agentMobile;
		this.agentIncome = agentIncome;
		this.occupation = occupation;
		//this.agentAddress = agentAddress;
		this.username = username;
		this.password = password;
	}


	public int getAgentId() {
		return agentId;
	}


	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}


	public String getAgentName() {
		return agentName;
	}


	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}


	public int getAgentMobile() {
		return agentMobile;
	}


	public void setAgentMobile(int agentMobile) {
		this.agentMobile = agentMobile;
	}


	public double getAgentIncome() {
		return agentIncome;
	}


	public void setAgentIncome(double agentIncome) {
		this.agentIncome = agentIncome;
	}


	public String getOccupation() {
		return occupation;
	}


	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}


	


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public double getAgentCommission() {
		return agentCommission;
	}


	public void setAgentCommission(double agentCommission) {
		this.agentCommission = agentCommission;
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
		return "Agent [agentId=" + agentId + ", agentName=" + agentName + ", agentMobile=" + agentMobile
				+ ", agentIncome=" + agentIncome + ", occupation=" + occupation + ", address=" + address
				+ ", agentCommission=" + agentCommission + ", username=" + username + ", password=" + password + "]";
	}



	
	
	
	
	
}
