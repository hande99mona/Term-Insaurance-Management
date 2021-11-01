package Test.Insurance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="POLICY_PLAN")
public class Policyplan {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int planId;
	
	@Column(name="PLAN_DESCRIPTION")
	 private String planDescription;
	
	@Column(name="PLANNAME")
	 private String planName;
	
	@Column(name="PLAN_PREMINUM")
	 private double planPremium;
	
	@Column(name="PLAN_COVER")
	 private double lifeCover;
	
	@Column(name="PAYMENT_MODE")
	 private PaymentMode paymetMode;
	
	@Column(name="PLAN_COVERAGE")
	 private long age_coverage;
	
	@Column(name="PLAN_PERIOD")
	 private int timePeriod;
	
	
	

	public Policyplan() {
		super();
	}

	public Policyplan(int planId, String planDescription, String planName, double planPremium, double lifeCover,
			PaymentMode paymetMode, long age_coverage, int timePeriod) {
		super();
		this.planId = planId;
		this.planDescription = planDescription;
		this.planName = planName;
		this.planPremium = planPremium;
		this.lifeCover = lifeCover;
		this.paymetMode = paymetMode;
		this.age_coverage = age_coverage;
		this.timePeriod = timePeriod;
	}

	public int getPlanId() {
		return planId;
	}

	public void setPlanId(int planId) {
		this.planId = planId;
	}

	public String getPlanDescription() {
		return planDescription;
	}

	public void setPlanDescription(String planDescription) {
		this.planDescription = planDescription;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public double getPlanPremium() {
		return planPremium;
	}

	public void setPlanPremium(double planPremium) {
		this.planPremium = planPremium;
	}

	public double getLifeCover() {
		return lifeCover;
	}

	public void setLifeCover(double lifeCover) {
		this.lifeCover = lifeCover;
	}

	public PaymentMode getPaymetMode() {
		return paymetMode;
	}

	public void setPaymetMode(PaymentMode paymetMode) {
		this.paymetMode = paymetMode;
	}

	public long getAge_coverage() {
		return age_coverage;
	}

	public void setAge_coverage(long age_coverage) {
		this.age_coverage = age_coverage;
	}

	public int getTimePeriod() {
		return timePeriod;
	}

	public void setTimePeriod(int timePeriod) {
		this.timePeriod = timePeriod;
	}
	

	@Override
	public String toString() {
		return "Policyplan [planId=" + planId + ", planDescription=" + planDescription + ", planName=" + planName
				+ ", planPremium=" + planPremium + ", lifeCover=" + lifeCover + ", paymetMode=" + paymetMode
				+ ", age_coverage=" + age_coverage + ", timePeriod=" + timePeriod + "]";
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	  

}
