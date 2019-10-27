package gpc.model;

public class Statement {

	private String recordType;
	private String assignedAccountNumber;
	private String accountName;
	private String dateOfOldBalance;
	private String oldPennies;
	private String oldBalanceSign;
	private String newPennies;
	private String newBalanceSign;
	private String debitTurnover;
	private String debitTurnSign;
	private String creditTurnover;
	private String creditTurnSign;
	private String serialNumber;
	private String datePosting;
	private String termination;
	private String zeroValue;
	
	public Statement(String recordType, String assignedAccountNumber, String accountName, String dateOfOldBalance,
			String oldPennies, String oldBalanceSign, String newPennies, String newBalanceSign, String debitTurnover,
			String debitTurnSign, String creditTurnover, String creditTurnSign, String serialNumber, String datePosting,
			String termination, String zeroValue) {
		super();
		this.recordType = recordType;
		this.assignedAccountNumber = assignedAccountNumber;
		this.accountName = accountName;
		this.dateOfOldBalance = dateOfOldBalance;
		this.oldPennies = oldPennies;
		this.oldBalanceSign = oldBalanceSign;
		this.newPennies = newPennies;
		this.newBalanceSign = newBalanceSign;
		this.debitTurnover = debitTurnover;
		this.debitTurnSign = debitTurnSign;
		this.creditTurnover = creditTurnover;
		this.creditTurnSign = creditTurnSign;
		this.serialNumber = serialNumber;
		this.datePosting = datePosting;
		this.termination = termination;
		this.zeroValue = zeroValue;
	}

	public String getRecordType() {
		return recordType;
	}

	public String getAssignedAccountNumber() {
		return assignedAccountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public String getDateOfOldBalance() {
		return dateOfOldBalance;
	}

	public String getOldPennies() {
		return oldPennies;
	}

	public String getOldBalanceSign() {
		return oldBalanceSign;
	}

	public String getNewPennies() {
		return newPennies;
	}

	public String getNewBalanceSign() {
		return newBalanceSign;
	}

	public String getDebitTurnover() {
		return debitTurnover;
	}

	public String getDebitTurnSign() {
		return debitTurnSign;
	}

	public String getCreditTurnover() {
		return creditTurnover;
	}

	public String getCreditTurnSign() {
		return creditTurnSign;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public String getDatePosting() {
		return datePosting;
	}

	public String getTermination() {
		return termination;
	}

	public String getZeroValue() {
		return zeroValue;
	}
	
	
	
	
}
