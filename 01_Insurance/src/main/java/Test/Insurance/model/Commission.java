package Test.Insurance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COMMISSION_TBL")
public class Commission {
	 
	@Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private  int comissionId;
	  @Column(name="TARGET_AMOUNT")
	  private  double targetAmount;
	  @Column(name="TARGET_rate")
	  private double commissionrate;
	  @Column(name="TARGET_commamount")
	  private  double commissionAmount;
	  
	  
	  public Commission(int comissionId, double targetAmount, double commissionrate, double commissionAmount) {
			super();
			this.comissionId = comissionId;
			this.targetAmount = targetAmount;
			this.commissionrate = commissionrate;
			this.commissionAmount = commissionAmount;
		}
	  
	  
	public int getComissionId() {
		return comissionId;
	}
	public void setComissionId(int comissionId) {
		this.comissionId = comissionId;
	}
	public double getTargetAmount() {
		return targetAmount;
	}
	public void setTargetAmount(double targetAmount) {
		this.targetAmount = targetAmount;
	}
	public double getCommissionrate() {
		return commissionrate;
	}
	public void setCommissionrate(double commissionrate) {
		this.commissionrate = commissionrate;
	}
	public double getCommissionAmount() {
		return commissionAmount;
	}
	public void setCommissionAmount(double commissionAmount) {
		this.commissionAmount = commissionAmount;
	}


	@Override
	public String toString() {
		return "Commission [comissionId=" + comissionId + ", targetAmount=" + targetAmount + ", commissionrate="
				+ commissionrate + ", commissionAmount=" + commissionAmount + "]";
	}
	  
	  
	  
	  

}
