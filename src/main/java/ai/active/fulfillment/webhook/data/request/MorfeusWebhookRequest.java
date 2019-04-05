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
package ai.active.fulfillment.webhook.data.request;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import ai.active.fulfillment.webhook.data.request.enums.EventType;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"id", "session_id", "time", "event", "user", "bot", "request", "nlp", "workflow"})
public class MorfeusWebhookRequest implements Serializable {

  private static final long serialVersionUID = -1091926364497494093L;
  @JsonProperty("id")
  private String id;
  @JsonProperty("session_id")
  private String sessionId;
  @JsonProperty("time")
  private String time;
  @JsonProperty("event")
  private EventType event;
  @JsonProperty("user")
  private User user;
  @JsonProperty("bot")
  private Bot bot;
  @JsonProperty("request")
  private Request request;
  @JsonProperty("nlp")
  private Nlp nlp;
  @JsonProperty("workflow")
  private WorkflowParams workflowParams;

  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  @JsonProperty("time")
  public String getTime() {
    return time;
  }

  @JsonProperty("time")
  public void setTime(String time) {
    this.time = time;
  }

  @JsonProperty("event")
  public EventType getEvent() {
    return event;
  }

  @JsonProperty("event")
  public void setEvent(EventType event) {
    this.event = event;
  }

  @JsonProperty("user")
  public User getUser() {
    return user;
  }

  @JsonProperty("user")
  public void setUser(User user) {
    this.user = user;
  }

  @JsonProperty("bot")
  public Bot getBot() {
    return bot;
  }

  @JsonProperty("bot")
  public void setBot(Bot bot) {
    this.bot = bot;
  }

  @JsonProperty("request")
  public Request getRequest() {
    return request;
  }

  @JsonProperty("request")
  public void setRequest(Request request) {
    this.request = request;
  }

  @JsonProperty("nlp")
  public Nlp getNlp() {
    return nlp;
  }

  @JsonProperty("nlp")
  public void setNlp(Nlp nlp) {
    this.nlp = nlp;
  }

  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  @JsonProperty("workflow")
  public WorkflowParams getWorkflowParams() {
    return workflowParams;
  }

  @JsonProperty("workflow")
  public void setWorkflowParams(WorkflowParams workflowParams) {
    this.workflowParams = workflowParams;
  }

  @Override
  public String toString() {
    return "MorfeusWebhookRequest [id=" + id + ", sessionId=" + sessionId + ", time=" + time + ", event=" + event + ", user=" + user
        + ", bot=" + bot + ", request=" + request + ", nlp=" + nlp + ", workflow=" + workflowParams + "]";
  }

}
