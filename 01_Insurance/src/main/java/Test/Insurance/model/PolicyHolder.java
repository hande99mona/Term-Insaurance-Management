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
@Table(name="POLICY_HOLDER")
public class PolicyHolder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ph_id;
	
	@Column(name="PH_FULLNAME")
	private String ph_FullName;
	
	@Column(name="PH_INCOME")
	private long ph_Income;
	
	@Column(name="PH_OCCUPATION")
	private String ph_Occupation;
	
	@Column(name="PH_EMAIL")
	private String ph_Email;
	
	@Column(name="PH_NOMINEE")
	private String ph_Nominee;
	
	@OneToOne(cascade=CascadeType.ALL)
	 @JoinColumn(name="planId")
	private Policyplan policy;
	
	@OneToOne(cascade=CascadeType.ALL)
	 @JoinColumn(name="agentId")
	private Agent agent;

    private  ApplicationStatus applicationStatus=ApplicationStatus.PENDING;
	
	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	public Policyplan getPolicy() {
		return policy;
	}

	public void setPolicy(Policyplan policy) {
		this.policy = policy;
	}

	public PolicyHolder(int ph_id, String ph_FullName, long ph_Income, String ph_Occupation, String ph_Email,
			String ph_Nominee) {
		super();
		this.ph_id = ph_id;
		this.ph_FullName = ph_FullName;
		this.ph_Income = ph_Income;
		this.ph_Occupation = ph_Occupation;
		this.ph_Email = ph_Email;
		this.ph_Nominee = ph_Nominee;
	}

	public int getPh_id() {
		return ph_id;
	}

	public void setPh_id(int ph_id) {
		this.ph_id = ph_id;
	}

	public String getPh_FullName() {
		return ph_FullName;
	}

	public void setPh_FullName(String ph_FullName) {
		this.ph_FullName = ph_FullName;
	}

	public long getPh_Income() {
		return ph_Income;
	}

	public void setPh_Income(long ph_Income) {
		this.ph_Income = ph_Income;
	}

	public String getPh_Occupation() {
		return ph_Occupation;
	}

	public void setPh_Occupation(String ph_Occupation) {
		this.ph_Occupation = ph_Occupation;
	}

	public String getPh_Email() {
		return ph_Email;
	}

	public void setPh_Email(String ph_Email) {
		this.ph_Email = ph_Email;
	}

	public String getPh_Nominee() {
		return ph_Nominee;
	}

	public void setPh_Nominee(String ph_Nominee) {
		this.ph_Nominee = ph_Nominee;
	}

	@Override
	public String toString() {
		return "PolicyHolder [ph_id=" + ph_id + ", ph_FullName=" + ph_FullName + ", ph_Income=" + ph_Income
				+ ", ph_Occupation=" + ph_Occupation + ", ph_Email=" + ph_Email + ", ph_Nominee=" + ph_Nominee
				+ ", policy=" + policy + ", agent=" + agent + "]";
	}

	
	
	


}
