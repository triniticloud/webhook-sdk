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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"messages", "render", "keyboard_state", "status", "expected_entities", "extra_data", "audit", "headers"})
public class MorfeusWebhookResponse implements Serializable {

  private static final long serialVersionUID = -5495533712195902428L;
  @JsonProperty("messages")
  private List<AbstractMessage> messages = null;
  @JsonProperty("render")
  private String render;
  @JsonProperty("keyboard_state")
  private String keyboardState;
  @JsonProperty("status")
  private Status status;
  @JsonProperty("expected_entities")
  private List<String> expectedEntities = null;
  @JsonProperty("extra_data")
  private Map<String, Object> extraData = null;
  @JsonProperty("audit")
  private Audit audit;
  @JsonProperty("headers")
  private Map<String, String> headers;

  @JsonProperty("messages")
  public List<AbstractMessage> getMessages() {
    return messages;
  }

  @JsonProperty("messages")
  public void setMessages(List<AbstractMessage> messages) {
    this.messages = messages;
  }

  @JsonProperty("render")
  public String getRender() {
    return render;
  }

  @JsonProperty("render")
  public void setRender(String render) {
    this.render = render;
  }

  @JsonProperty("keyboard_state")
  public String getKeyboardState() {
    return keyboardState;
  }

  @JsonProperty("keyboard_state")
  public void setKeyboardState(String keyboardState) {
    this.keyboardState = keyboardState;
  }

  @JsonProperty("status")
  public Status getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(Status status) {
    this.status = status;
  }

  @JsonProperty("expected_entities")
  public List<String> getExpectedEntities() {
    return expectedEntities;
  }

  @JsonProperty("expected_entities")
  public void setExpectedEntities(List<String> expectedEntities) {
    this.expectedEntities = expectedEntities;
  }

  @JsonProperty("extra_data")
  public Map<String, Object> getExtraData() {
    return extraData;
  }

  @JsonProperty("extra_data")
  public void setExtraData(Map<String, Object> extraData) {
    this.extraData = extraData;
  }

  @JsonProperty("audit")
  public Audit getAudit() {
    return audit;
  }

  @JsonProperty("audit")
  public void setAudit(Audit audit) {
    this.audit = audit;
  }

  @JsonProperty("headers")
  public Map<String, String> getHeaders() {
    return headers;
  }

  @JsonProperty("headers")
  public void setHeaders(Map<String, String> headers) {
    this.headers = headers;
  }

  public MorfeusWebhookResponse(List<AbstractMessage> messages, String render, String keyboardState, Status status,
      List<String> expectedEntities, Map<String, Object> extraData, Audit audit, Map<String, String> headers) {
    this.messages = messages;
    this.render = render;
    this.keyboardState = keyboardState;
    this.status = status;
    this.expectedEntities = expectedEntities;
    this.extraData = extraData;
    this.audit = audit;
    this.headers = headers;
  }

  public MorfeusWebhookResponse() {
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this).append("messages", messages).append("render", render).append("keyboardState", keyboardState)
        .append("status", status).append("expectedEntities", expectedEntities).append("extraData", extraData).append("audit", audit)
        .toString();
  }

}
