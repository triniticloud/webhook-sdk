package ai.active.fulfillment.webhook.data.response;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class APIAudit {

  private Long responseTime;

  private int responseCode;

  private String apiRequest;

  private String apiResponse;

  private String status;

  private String apiName;
  
  private String responseCategory;

  public int getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(int responseCode) {
    this.responseCode = responseCode;
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

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Long getResponseTime() {
    return responseTime;
  }

  public void setResponseTime(Long responseTime) {
    this.responseTime = responseTime;
  }
  
  public String getApiName() {
    return apiName;
  }

  public void setApiName(String apiName) {
    this.apiName = apiName;
  }

  public String getResponseCategory() {
    return responseCategory;
  }

  public void setResponseCategory(String responseCategory) {
    this.responseCategory = responseCategory;
  }

  @Override public String toString() {
    return new ToStringBuilder(this).append("responseTime", responseTime).append("responseCode", responseCode)
        .append("apiRequest", apiRequest).append("apiResponse", apiResponse).append("status", status).append("apiName", apiName)
        .append("responseCategory", responseCategory).toString();
  }
}
