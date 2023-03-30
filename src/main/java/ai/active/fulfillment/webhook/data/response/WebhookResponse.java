package ai.active.fulfillment.webhook.data.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import ai.active.fulfillment.webhook.data.request.ServiceRequest;
import ai.active.fulfillment.webhook.data.request.Transaction;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Arrays;
import java.util.List;

/**
 * @author rupamdebnath
 */
public class WebhookResponse extends MorfeusWebhookResponse {

  @JsonProperty("templateCode")
  private String templateCode;

  @JsonProperty("payload")
  private String payload;

  @JsonProperty("messageCode")
  private String messageCode;

  @JsonProperty("messageParams")
  private String[] messageParams;
  
  @JsonProperty("transaction")
  private Transaction transaction;

  @JsonProperty("serviceRequest")
  private ServiceRequest serviceRequest;
  
  @JsonProperty("apiAudits")
  private List<APIAudit> apiAuditList;
  
  @JsonProperty("serviceName")
  private String serviceName;

  public String getTemplateCode() {
    return templateCode;
  }

  public void setTemplateCode(String templateCode) {
    this.templateCode = templateCode;
  }

  public String getPayload() {
    return payload;
  }

  public void setPayload(String payload) {
    this.payload = payload;
  }

  public String getMessageCode() {
    return messageCode;
  }

  public void setMessageCode(String messageCode) {
    this.messageCode = messageCode;
  }

  public String[] getMessageParams() {
    return messageParams;
  }

  public void setMessageParams(String[] messageParams) {
    this.messageParams = messageParams;
  }
  
  public Transaction getTransaction() {
    return transaction;
  }

  public void setTransaction(Transaction transaction) {
    this.transaction = transaction;
  }

  public ServiceRequest getServiceRequest() {
    return serviceRequest;
  }

  public void setServiceRequest(ServiceRequest serviceRequest) {
    this.serviceRequest = serviceRequest;
  }


  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public List<APIAudit> getApiAuditList() {
    return apiAuditList;
  }

  public void setApiAuditList(List<APIAudit> apiAuditList) {
    this.apiAuditList = apiAuditList;
  }

  @Override public String toString() {
    return new ToStringBuilder(this).append("templateCode", templateCode).append("payload", payload).append("messageCode", messageCode)
        .append("messageParams", messageParams).append("transaction", transaction).append("serviceRequest", serviceRequest)
        .append("apiAuditList", apiAuditList).append("serviceName", serviceName).toString();
  }
}
