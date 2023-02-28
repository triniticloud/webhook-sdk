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
  
  @JsonProperty("errorCode")
  private int errorCode;

  @JsonProperty("apiRequest")
  private String apiRequest;

  @JsonProperty("apiResponse")
  private String apiResponse;

  @JsonProperty("errorDescription")
  private String errorDescription;
  
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

  public int getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(int errorCode) {
    this.errorCode = errorCode;
  }

  public String getApiRequest() {
    return apiRequest;
  }

  public void setApiRequest(String apiRequest) {
    this.apiRequest = apiRequest;
  }

  public String getApiResponse() {
    return apiResponse;
  }

  public void setApiResponse(String apiResponse) {
    this.apiResponse = apiResponse;
  }

  public String getErrorDescription() {
    return errorDescription;
  }

  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }

  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  @Override public String toString() {
    return "WebhookResponse{" + "templateCode='" + templateCode + '\'' + ", payload='" + payload + '\'' + ", messageCode='" + messageCode
        + '\'' + ", messageParams=" + Arrays.toString(messageParams) + ", transaction=" + transaction + ", serviceRequest=" + serviceRequest
        + ", errorCode=" + errorCode + ", apiRequest='" + apiRequest + '\'' + ", apiResponse='" + apiResponse + '\''
        + ", errorDescription='" + errorDescription + '\'' + '}';
  }
  
}
