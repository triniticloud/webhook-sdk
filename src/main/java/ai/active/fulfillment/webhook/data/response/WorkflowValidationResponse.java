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
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;
import java.util.Map;

/**
 * @author Pranay Kh.
 */
public class WorkflowValidationResponse extends MorfeusWebhookResponse {

  private static final long serialVersionUID = -6636756897538918825L;

  @JsonProperty("workflow_variables")
  private Map<String, String> workflowVariables;

  @JsonProperty("global_variables")
  private Map<String, String> globalVariables;

  @JsonProperty("workflow_variables")
  public Map<String, String> getWorkflowVariables() {
    return workflowVariables;
  }

  @JsonProperty("workflow_variables")
  public void setWorkflowVariables(Map<String, String> workflowVariables) {
    this.workflowVariables = workflowVariables;
  }

  @JsonProperty("global_variables")
  public Map<String, String> getGlobalVariables() {
    return globalVariables;
  }

  @JsonProperty("global_variables")
  public void setGlobalVariables(Map<String, String> globalVariables) {
    this.globalVariables = globalVariables;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this).append("messages", getMessages()).append("render", getRender()).append("keyboardState", getKeyboardState())
        .append("status", getStatus()).append("expectedEntities", getExpectedEntities()).append("workflow_variables", workflowVariables)
        .append("global_variables", globalVariables).toString();
  }

  public static class Builder {

    private List<AbstractMessage> messages;
    private String render;
    private String keyboardState;
    private Status status;
    private List<String> expectedEntities;
    private Map<String, String> workflowVariables;
    private Map<String, String> globalVariables;

    public Builder setMessages(List<AbstractMessage> messages) {
      this.messages = messages;
      return this;
    }

    public Builder setRender(String render) {
      this.render = render;
      return this;
    }

    public Builder setKeyboardState(String keyboardState) {
      this.keyboardState = keyboardState;
      return this;
    }

    public Builder setStatus(Status status) {
      this.status = status;
      return this;
    }

    public Builder setExpectedEntities(List<String> expectedEntities) {
      this.expectedEntities = expectedEntities;
      return this;
    }


    public Builder setWorkflowVariables(Map<String, String> workflowVariables) {
      this.workflowVariables = workflowVariables;
      return this;
    }

    public Builder setGlobalVariables(Map<String, String> globalVariables) {
      this.globalVariables = globalVariables;
      return this;
    }

    public WorkflowValidationResponse build() {
      WorkflowValidationResponse workflowValidationResponse = new WorkflowValidationResponse();
      workflowValidationResponse.setMessages(messages);
      workflowValidationResponse.setRender(render);
      workflowValidationResponse.setKeyboardState(keyboardState);
      workflowValidationResponse.setStatus(status);
      workflowValidationResponse.setExpectedEntities(expectedEntities);
      workflowValidationResponse.setWorkflowVariables(workflowVariables);
      workflowValidationResponse.setGlobalVariables(globalVariables);
      return workflowValidationResponse;
    }

    public Builder(List<AbstractMessage> messages, String render, String keyboardState, Status status, List<String> expectedEntities ,
        Map<String, String> workflowVariables, Map<String, String> globalVariables) {
      this(messages, status, expectedEntities, workflowVariables, globalVariables);
      this.render = render;
      this.keyboardState = keyboardState;
    }

    public Builder(List<AbstractMessage> messages, Status status, List<String> expectedEntities, Map<String, String> workflowVariables, Map<String, String> globalVariables) {
      this(messages, status);
      this.expectedEntities = expectedEntities;
      this.workflowVariables = workflowVariables;
      this.globalVariables = globalVariables;
    }

    public Builder(List<AbstractMessage> messages, Status status, List<String> expectedEntities) {
      this(messages,status);
      this.expectedEntities = expectedEntities;
    }

    public Builder(List<AbstractMessage> messages, Status status) {
      this(status);
      this.messages = messages;
    }

    public Builder(Status status) {
      this.status = status;
    }
  }

  private WorkflowValidationResponse() {
  }
}
