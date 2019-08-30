/*
 * (C) Copyright 2019 Active Intelligence Pte Ltd (http://active.ai/).
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package ai.active.fulfillment.webhook.data.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.io.Serializable;
import java.util.List;

// @formatter:off
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "type",
    visible = true,
    defaultImpl = HookMessage.class
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = TextMessage.class, name = TextMessage.TYPE),
    @JsonSubTypes.Type(value = ListMessage.class, name = ListMessage.TYPE),
    @JsonSubTypes.Type(value = ButtonMessage.class, name = ButtonMessage.TYPE),
    @JsonSubTypes.Type(value = CarouselMessage.class, name = CarouselMessage.TYPE),
    @JsonSubTypes.Type(value = ImageMessage.class, name = ImageMessage.TYPE),
    @JsonSubTypes.Type(value = VideoMessage.class, name = VideoMessage.TYPE),
    @JsonSubTypes.Type(value = CustomMessage.class, name = CustomMessage.TYPE),
    @JsonSubTypes.Type(value = MarkupMessage.class, name = MarkupMessage.TYPE),
    @JsonSubTypes.Type(value = DynamicMessage.class, name = DynamicMessage.TYPE)
})
// @formatter:on
public abstract class AbstractMessage implements Serializable {

  private static final long serialVersionUID = 3371211295620897143L;

  @JsonProperty("type")
  private String type;

  @JsonProperty("quick_replies")
  private List<QuickReply> quickReplies = null;

  @JsonProperty("speechResponse")
  private String speechResponse;

  @JsonProperty("type")
  public String getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(String type) {
    this.type = type;
  }

  @JsonProperty("quick_replies")
  public List<QuickReply> getQuickReplies() {
    return quickReplies;
  }

  @JsonProperty("quick_replies")
  public void setQuickReplies(List<QuickReply> quickReplies) {
    this.quickReplies = quickReplies;
  }

  @JsonProperty("speechResponse")
  public String getSpeechResponse() {
    return speechResponse;
  }

  @JsonProperty("speechResponse")
  public void setSpeechResponse(String speechResponse) {
    this.speechResponse = speechResponse;
  }

  public abstract Object getContent();
}
