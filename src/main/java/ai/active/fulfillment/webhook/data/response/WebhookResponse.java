package ai.active.fulfillment.webhook.data.response;

import com.fasterxml.jackson.annotation.JsonProperty;

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

  @Override
  public String toString() {
    return "WebhookResponse{" + "templateCode='" + templateCode + '\'' + ", payload='" + payload + '\'' + ", messageCode='" + messageCode
        + '\'' + ", messageParams='" + messageParams + '\'' + '}';
  }
}
