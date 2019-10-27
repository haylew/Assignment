package gpc.model;

public class Turnover {

	private String recordType;
	private String assignedAccountNumber;
	private String accountNumber;
	private String documentNumber;
	private String amountInPennies;
	private String billingCode;
	private String variableSymbol;
	private String constantSymbol;
	private String specificSymbol;
	private String dueDate;
	private String clientName;
	private String zeroValue;
	private String currencyCode;
	private String date;
	public Turnover(String recordType, String assignedAccountNumber, String accountNumber, String documentNumber,
			String amountInPennies, String billingCode, String variableSymbol, String constantSymbol,
			String specificSymbol, String dueDate, String clientName, String zeroValue, String currencyCode,
			String date) {
		super();
		this.recordType = recordType;
		this.assignedAccountNumber = assignedAccountNumber;
		this.accountNumber = accountNumber;
		this.documentNumber = documentNumber;
		this.amountInPennies = amountInPennies;
		this.billingCode = billingCode;
		this.variableSymbol = variableSymbol;
		this.constantSymbol = constantSymbol;
		this.specificSymbol = specificSymbol;
		this.dueDate = dueDate;
		this.clientName = clientName;
		this.zeroValue = zeroValue;
		this.currencyCode = currencyCode;
		this.date = date;
	}
	public String getRecordType() {
		return recordType;
	}
	public String getAssignedAccountNumber() {
		return assignedAccountNumber;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public String getDocumentNumber() {
		return documentNumber;
	}
	public String getAmountInPennies() {
		return amountInPennies;
	}
	public String getBillingCode() {
		return billingCode;
	}
	public String getVariableSymbol() {
		return variableSymbol;
	}
	public String getConstantSymbol() {
		return constantSymbol;
	}
	public String getSpecificSymbol() {
		return specificSymbol;
	}
	public String getDueDate() {
		return dueDate;
	}
	public String getClientName() {
		return clientName;
	}
	public String getZeroValue() {
		return zeroValue;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public String getDate() {
		return date;
	}
	
	
}
