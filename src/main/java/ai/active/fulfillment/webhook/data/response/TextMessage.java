package ai.active.fulfillment.webhook.data.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TextMessage extends AbstractMessage {

  private static final long serialVersionUID = -319802185150685079L;

  protected static final String TYPE = "text";

  @JsonProperty("content")
  private String content;

  @JsonProperty("content")
  public String getContent() {
    return content;
  }

  @JsonProperty("content")
  public void setContent(String content) {
    this.content = content;
  }

}
