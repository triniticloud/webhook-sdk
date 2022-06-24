package ai.active.fulfillment.webhook.data.request;

import java.util.Date;

public class ServiceRequest implements java.io.Serializable {

  private static final long serialVersionUID = 1L;

  private Integer srvcereqIntId;
  private Bot bot;
  private Integer botIntId;
  private Integer userIntId;
  private Date srvcereqDate = new Date();
  private String srvcereqId;
  private String srvcereqType;
  private String srvcereqCateg;
  private String srvcereqStatus;
  private String srvcereqRefNum;
  private String accountId;
  private String comments;
  private String statusCode;
  private Date contactDate = new Date();
  private String auditField1;
  private String auditField2;
  private String auditField3;
  private String auditField4;
  private String custId;
  private Date fromDate = new Date();
  private Date endDate = new Date();
  private Integer botDomainIntId;
  private String channelType;
  private String userType;
  private String userFirstName;
  private String userEmailId;
  private String userPhoneNum;
  private String userCustId;
  private String userId;

  public ServiceRequest() {}

  public ServiceRequest(Bot bot, Integer userIntId, Date srvcereqDate, String srvcereqId, String srvcereqType, String srvcereqCateg,
      String srvcereqStatus, String srvcereqRefNum, String accountId, String comments, String statusCode, Date contactDate,
      String auditField1, String auditField2, String auditField3, String auditField4) {
    this.bot = bot;
    this.userIntId = userIntId;
    this.srvcereqDate = srvcereqDate;
    this.srvcereqId = srvcereqId;
    this.srvcereqType = srvcereqType;
    this.srvcereqCateg = srvcereqCateg;
    this.srvcereqStatus = srvcereqStatus;
    this.srvcereqRefNum = srvcereqRefNum;
    this.accountId = accountId;
    this.comments = comments;
    this.statusCode = statusCode;
    this.contactDate = contactDate;
    this.auditField1 = auditField1;
    this.auditField2 = auditField2;
    this.auditField3 = auditField3;
    this.auditField4 = auditField4;
  }

  public Integer getSrvcereqIntId() {
    return this.srvcereqIntId;
  }

  public void setSrvcereqIntId(Integer srvcereqIntId) {
    this.srvcereqIntId = srvcereqIntId;
  }

  public String getSrvcereqId() {
    return this.srvcereqId;
  }

  public void setSrvcereqId(String srvcereqId) {
    this.srvcereqId = srvcereqId;
  }

  public String getSrvcereqType() {
    return this.srvcereqType;
  }

  public void setSrvcereqType(String srvcereqType) {
    this.srvcereqType = srvcereqType;
  }

  public String getSrvcereqCateg() {
    return this.srvcereqCateg;
  }

  public void setSrvcereqCateg(String srvcereqCateg) {
    this.srvcereqCateg = srvcereqCateg;
  }

  public String getSrvcereqStatus() {
    return this.srvcereqStatus;
  }

  public void setSrvcereqStatus(String srvcereqStatus) {
    this.srvcereqStatus = srvcereqStatus;
  }

  public String getSrvcereqRefNum() {
    return this.srvcereqRefNum;
  }

  public void setSrvcereqRefNum(String srvcereqRefNum) {
    this.srvcereqRefNum = srvcereqRefNum;
  }

  public String getAccountId() {
    return this.accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public String getComments() {
    return this.comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public String getStatusCode() {
    return this.statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
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

  public Bot getBot() {
    return bot;
  }

  public void setBot(Bot bot) {
    this.bot = bot;
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

  public String getChannelType() {
    return channelType;
  }

  public void setChannelType(String channelType) {
    this.channelType = channelType;
  }

  public String getUserType() {
    return userType;
  }

  public void setUserType(String userType) {
    this.userType = userType;
  }

  public Integer getUserIntId() {
    return userIntId;
  }

  public void setUserIntId(Integer userIntId) {
    this.userIntId = userIntId;
  }

  public String getUserFirstName() {
    return userFirstName;
  }

  public void setUserFirstName(String userFirstName) {
    this.userFirstName = userFirstName;
  }

  public String getUserEmailId() {
    return userEmailId;
  }

  public void setUserEmailId(String userEmailId) {
    this.userEmailId = userEmailId;
  }

  public String getUserPhoneNum() {
    return userPhoneNum;
  }

  public void setUserPhoneNum(String userPhoneNum) {
    this.userPhoneNum = userPhoneNum;
  }

  public String getUserCustId() {
    return userCustId;
  }

  public void setUserCustId(String userCustId) {
    this.userCustId = userCustId;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public Date getSrvcereqDate() {
    return srvcereqDate;
  }

  public void setSrvcereqDate(Date srvcereqDate) {
    this.srvcereqDate = srvcereqDate;
  }

  public Date getContactDate() {
    return contactDate;
  }

  public void setContactDate(Date contactDate) {
    this.contactDate = contactDate;
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
