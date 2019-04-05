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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"title", "type", "webview_type", "auth_required", "life", "payload", "postback", "intent", "extra_payload", "message"})
public class Button implements Serializable {

  private static final long serialVersionUID = 2639997584698897729L;
  @JsonProperty("title")
  private String title;
  @JsonProperty("type")
  private String type;
  @JsonProperty("webview_type")
  private String webviewType;
  @JsonProperty("auth_required")
  private String authRequired;
  @JsonProperty("life")
  private String life;
  @JsonProperty("payload")
  private String payload;
  @JsonProperty("postback")
  private String postback;
  @JsonProperty("intent")
  private String intent;
  @JsonProperty("extra_payload")
  private String extraPayload;
  @JsonProperty("message")
  private String message;

  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  @JsonProperty("title")
  public void setTitle(String title) {
    this.title = title;
  }

  @JsonProperty("type")
  public String getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(String type) {
    this.type = type;
  }

  @JsonProperty("webview_type")
  public String getWebviewType() {
    return webviewType;
  }

  @JsonProperty("webview_type")
  public void setWebviewType(String webviewType) {
    this.webviewType = webviewType;
  }

  @JsonProperty("auth_required")
  public String getAuthRequired() {
    return authRequired;
  }

  @JsonProperty("auth_required")
  public void setAuthRequired(String authRequired) {
    this.authRequired = authRequired;
  }

  @JsonProperty("life")
  public String getLife() {
    return life;
  }

  @JsonProperty("life")
  public void setLife(String life) {
    this.life = life;
  }

  @JsonProperty("payload")
  public String getPayload() {
    return payload;
  }

  @JsonProperty("payload")
  public void setPayload(String payload) {
    this.payload = payload;
  }

  @JsonProperty("postback")
  public String getPostback() {
    return postback;
  }

  @JsonProperty("postback")
  public void setPostback(String postback) {
    this.postback = postback;
  }

  @JsonProperty("intent")
  public String getIntent() {
    return intent;
  }

  @JsonProperty("intent")
  public void setIntent(String intent) {
    this.intent = intent;
  }

  @JsonProperty("extra_payload")
  public String getExtraPayload() {
    return extraPayload;
  }

  @JsonProperty("extra_payload")
  public void setExtraPayload(String extraPayload) {
    this.extraPayload = extraPayload;
  }

  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  @JsonProperty("message")
  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this).append("title", title).append("type", type).append("webviewType", webviewType)
        .append("authRequired", authRequired).append("life", life).append("payload", payload).append("postback", postback)
        .append("intent", intent).append("extraPayload", extraPayload).append("message", message).toString();
  }

}
