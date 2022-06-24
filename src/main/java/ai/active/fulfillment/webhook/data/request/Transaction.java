package ai.active.fulfillment.webhook.data.request;

import java.util.Date;

public class Transaction implements java.io.Serializable {

  private static final long serialVersionUID = 1L;

  private Integer trxnIntId;

  private Bot bot;

  private Integer botIntId;

  private Integer userIntId;

  private Integer botDomainIntId;

  private User user;

  private Date txnDate = new Date();

  private String trxnId;

  private String instTrxnId;

  private Double trxnAmt;

  private String trxnCurr;

  private String trxnType;

  private String trxnCateg;

  private String trxnStatus;

  private String trxnCode;

  private String trxnFailureText;

  private String trxnSrcAccountNum;

  private String payeeAccountNum;

  private String payeeName;

  private Date trxnExecDate = new Date();

  private String channelType;

  private String appToken;

  private String telco;

  private String mobileNumber;

  private String billerReference;

  private String billerName;

  private String paymentRefNo;

  private String auditField1;

  private String auditField2;

  private String auditField3;

  private String auditField4;

  private String custId;

  private Date fromDate = new Date();

  private Date endDate = new Date();

  private String sourceAccountNumber;

  private String targetAccountNumber;

  private Double sourceAccountAmount;

  private String sourceAccountCurrency;

  private Double userInputAmount;

  private String userInputCurrency;

  public Transaction() {}

  public Integer getTrxnIntId() {
    return this.trxnIntId;
  }

  public void setTrxnIntId(Integer trxnIntId) {
    this.trxnIntId = trxnIntId;
  }

  public Bot getBot() {
    return this.bot;
  }

  public void setBot(Bot bot) {
    this.bot = bot;
  }

  public User getUser() {
    return this.user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public String getTrxnId() {
    return this.trxnId;
  }

  public void setTrxnId(String trxnId) {
    this.trxnId = trxnId;
  }

  public String getInstTrxnId() {
    return this.instTrxnId;
  }

  public void setInstTrxnId(String instTrxnId) {
    this.instTrxnId = instTrxnId;
  }

  public Double getTrxnAmt() {
    return this.trxnAmt;
  }

  public void setTrxnAmt(Double trxnAmt) {
    this.trxnAmt = trxnAmt;
  }

  public String getTrxnCurr() {
    return this.trxnCurr;
  }

  public void setTrxnCurr(String trxnCurr) {
    this.trxnCurr = trxnCurr;
  }

  public String getTrxnType() {
    return this.trxnType;
  }

  public void setTrxnType(String trxnType) {
    this.trxnType = trxnType;
  }

  public String getTrxnCateg() {
    return this.trxnCateg;
  }

  public void setTrxnCateg(String trxnCateg) {
    this.trxnCateg = trxnCateg;
  }

  public String getTrxnStatus() {
    return this.trxnStatus;
  }

  public void setTrxnStatus(String trxnStatus) {
    this.trxnStatus = trxnStatus;
  }

  public String getTrxnCode() {
    return this.trxnCode;
  }

  public void setTrxnCode(String trxnCode) {
    this.trxnCode = trxnCode;
  }

  public String getTrxnFailureText() {
    return this.trxnFailureText;
  }

  public void setTrxnFailureText(String trxnFailureText) {
    this.trxnFailureText = trxnFailureText;
  }

  public String getTrxnSrcAccountNum() {
    return this.trxnSrcAccountNum;
  }

  public void setTrxnSrcAccountNum(String trxnSrcAccountNum) {
    this.trxnSrcAccountNum = trxnSrcAccountNum;
  }

  public String getPayeeAccountNum() {
    return this.payeeAccountNum;
  }

  public void setPayeeAccountNum(String payeeAccountNum) {
    this.payeeAccountNum = payeeAccountNum;
  }

  public String getPayeeName() {
    return this.payeeName;
  }

  public void setPayeeName(String payeeName) {
    this.payeeName = payeeName;
  }

  public String getChannelType() {
    return this.channelType;
  }

  public void setChannelType(String channelType) {
    this.channelType = channelType;
  }

  public String getAppToken() {
    return this.appToken;
  }

  public void setAppToken(String appToken) {
    this.appToken = appToken;
  }

  public String getAuditField1() {
    return this.auditField1;
  }

  public void setAuditField1(String auditField1) {
    this.auditField1 = auditField1;
  }

  public String getAuditField2() {
    return this.auditField2;
  }

  public void setAuditField2(String auditField2) {
    this.auditField2 = auditField2;
  }

  public String getAuditField3() {
    return this.auditField3;
  }

  public void setAuditField3(String auditField3) {
    this.auditField3 = auditField3;
  }

  public String getAuditField4() {
    return this.auditField4;
  }

  public void setAuditField4(String auditField4) {
    this.auditField4 = auditField4;
  }

  public String getTelco() {
    return telco;
  }

  public void setTelco(String telco) {
    this.telco = telco;
  }

  public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public String getBillerReference() {
    return billerReference;
  }

  public void setBillerReference(String billerReference) {
    this.billerReference = billerReference;
  }

  public String getCustId() {
    return custId;
  }

  public void setCustId(String custId) {
    this.custId = custId;
  }

  public Integer getBotIntId() {
    return botIntId;
  }

  public void setBotIntId(Integer botIntId) {
    this.botIntId = botIntId;
  }

  public Integer getBotDomainIntId() {
    return botDomainIntId;
  }

  public void setBotDomainIntId(Integer botDomainIntId) {
    this.botDomainIntId = botDomainIntId;
  }

  public void setUserIntId(Integer userIntId) {
    this.userIntId = userIntId;
  }

  public Integer getUserIntId() {
    return userIntId;
  }

  public String getBillerName() {
    return billerName;
  }

  public void setBillerName(String billerName) {
    this.billerName = billerName;
  }

  public String getPaymentRefNo() {
    return paymentRefNo;
  }

  public void setPaymentRefNo(String paymentRefNo) {
    this.paymentRefNo = paymentRefNo;
  }

  public String getSourceAccountNumber() {
    return sourceAccountNumber;
  }

  public void setSourceAccountNumber(String sourceAccountNumber) {
    this.sourceAccountNumber = sourceAccountNumber;
  }

  public String getTargetAccountNumber() {
    return targetAccountNumber;
  }

  public void setTargetAccountNumber(String targetAccountNumber) {
    this.targetAccountNumber = targetAccountNumber;
  }

  public Double getSourceAccountAmount() {
    return sourceAccountAmount;
  }

  public void setSourceAccountAmount(Double sourceAccountAmount) {
    this.sourceAccountAmount = sourceAccountAmount;
  }

  public String getSourceAccountCurrency() {
    return sourceAccountCurrency;
  }

  public void setSourceAccountCurrency(String sourceAccountCurrency) {
    this.sourceAccountCurrency = sourceAccountCurrency;
  }

  public Double getUserInputAmount() {
    return userInputAmount;
  }

  public void setUserInputAmount(Double userInputAmount) {
    this.userInputAmount = userInputAmount;
  }

  public String getUserInputCurrency() {
    return userInputCurrency;
  }

  public void setUserInputCurrency(String userInputCurrency) {
    this.userInputCurrency = userInputCurrency;
  }

  public Date getTxnDate() {
    return txnDate;
  }

  public void setTxnDate(Date txnDate) {
    this.txnDate = txnDate;
  }

  public Date getTrxnExecDate() {
    return trxnExecDate;
  }

  public void setTrxnExecDate(Date trxnExecDate) {
    this.trxnExecDate = trxnExecDate;
  }

  public Date getFromDate() {
    return fromDate;
  }

  public void setFromDate(Date fromDate) {
    this.fromDate = fromDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }
}
