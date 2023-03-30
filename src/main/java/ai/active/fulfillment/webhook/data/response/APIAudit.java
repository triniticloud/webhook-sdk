package ai.active.fulfillment.webhook.data.response;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class APIAudit {

  private Long responseTime;

  private int responseCode;

  private String apiRequest;

  private String apiResponse;

  private String errorDescription;

  private String serviceName;

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

  public String getErrorDescription() {
    return errorDescription;
  }

  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }

  public Long getResponseTime() {
    return responseTime;
  }

  public void setResponseTime(Long responseTime) {
    this.responseTime = responseTime;
  }

  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  @Override public String toString() {
    return new ToStringBuilder(this).append("responseTime", responseTime).append("responseCode", responseCode)
        .append("apiRequest", apiRequest).append("apiResponse", apiResponse).append("errorDescription", errorDescription)
        .append("serviceName", serviceName).toString();
  }
}
