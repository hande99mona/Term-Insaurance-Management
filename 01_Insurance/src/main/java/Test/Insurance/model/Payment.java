package Test.Insurance.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="PAYMENT_TBL")
public class Payment {
	
     @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int paymentId;
    
    @Autowired
    @ManyToOne
    @JoinColumn(name="planId")
   // @Column(name="POLICY_HOLDER")
    private  Policyplan plan;
    
    @Autowired
    @ManyToOne
    @JoinColumn(name="ph_id")
   // @Column(name="POLICY_HOLDER")
    private  PolicyHolder policyHolder;
    
     @Column(name="PAYMENT_DATE")
    private  Date paymentDate;
     @Column(name="AMOUNT")
    private double amount;
     @Column(name="SENDER_ACCOUNT")
    private  long senderAccountNo;
     @Column(name="RECEIVER_ACCOUNT")
    private  long receiverAccountNo;
     
     
	public Payment() {
		super();
	}


	public Payment(int paymentId,  Date paymentDate, double amount, long senderAccountNo,
			long receiverAccountNo) {
		super();
		this.paymentId = paymentId;
		//this.policyHolder = policyHolder;
		this.paymentDate = paymentDate;
		this.amount = amount;
		this.senderAccountNo = senderAccountNo;
		this.receiverAccountNo = receiverAccountNo;
	}
	
	
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	

	public PolicyHolder getPolicyHolder() {
		return policyHolder;
	}


	public void setPolicyHolder(PolicyHolder policyHolder) {
		this.policyHolder = policyHolder;
	}


	public Policyplan getPlan() {
		return plan;
	}

	public void setPlan(Policyplan plan) {
		this.plan = plan;
	}


	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public long getSenderAccountNo() {
		return senderAccountNo;
	}
	public void setSenderAccountNo(long senderAccountNo) {
		this.senderAccountNo = senderAccountNo;
	}
	public long getReceiverAccountNo() {
		return receiverAccountNo;
	}
	public void setReceiverAccountNo(long receiverAccountNo) {
		this.receiverAccountNo = receiverAccountNo;
	}


	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", plan=" + plan + ", policyHolder=" + policyHolder
				+ ", paymentDate=" + paymentDate + ", amount=" + amount + ", senderAccountNo=" + senderAccountNo
				+ ", receiverAccountNo=" + receiverAccountNo + "]";
	}


	


	


	

	
     
     
    
     
     
     

}
