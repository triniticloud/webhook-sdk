package ai.active.fulfillment.webhook.data.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import ai.active.fulfillment.webhook.data.request.ServiceRequest;
import ai.active.fulfillment.webhook.data.request.Transaction;
import java.util.Arrays;

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

  @Override
  public String toString() {
    return "WebhookResponse{" + "templateCode='" + templateCode + '\'' + ", payload='" + payload + '\'' + ", messageCode='" + messageCode
        + '\'' + ", messageParams=" + Arrays.toString(messageParams) + ", transaction=" + transaction + ", serviceRequest=" + serviceRequest
        + '}';
  }
  
}
