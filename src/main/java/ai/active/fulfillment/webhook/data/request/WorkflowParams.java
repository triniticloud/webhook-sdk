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
import java.util.Map;

import ai.active.fulfillment.webhook.data.request.enums.WorkflowProperty;

/**
 * @author Pranay Kh.
 *
 * This class will contain all properties that are specific to workflow and
 * are needed to access workflow state data from api implementation.
 *
 */
public class WorkflowParams implements Serializable {

  private static final long serialVersionUID = 2499593678372277829L;

  /*
  * this will contain key value pair for pojos defined in workflow module
  * that need inclusion in webhook request from workflow
  * e.g. Node, Workflow
  *
  * */
  private Map<WorkflowProperty, Object> additionalParams;

  private Map<String, String> workflowVariables;

  private Map<String, String> globalVariables;

  private Map<String, String> requestVariables;

  private String nodeId;

  private String workflowId;

  private String status;

  private Integer dataVersion;

  private Boolean enableJumpNode;

  public Map<WorkflowProperty, Object> getAdditionalParams() {
    return additionalParams;
  }

  public void setAdditionalParams(Map<WorkflowProperty, Object> additionalParams) {
    this.additionalParams = additionalParams;
  }

  public Map<String, String> getWorkflowVariables() {
    return workflowVariables;
  }

  public void setWorkflowVariables(Map<String, String> workflowVariables) {
    this.workflowVariables = workflowVariables;
  }

  public Map<String, String> getGlobalVariables() {
    return globalVariables;
  }

  public void setGlobalVariables(Map<String, String> globalVariables) {
    this.globalVariables = globalVariables;
  }

  public Map<String, String> getRequestVariables() {
    return requestVariables;
  }

  public void setRequestVariables(Map<String, String> requestVariables) {
    this.requestVariables = requestVariables;
  }

  public String getNodeId() {
    return nodeId;
  }

  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }

  public String getWorkflowId() {
    return workflowId;
  }

  public void setWorkflowId(String workflowId) {
    this.workflowId = workflowId;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Integer getDataVersion() {
    return dataVersion;
  }

  public void setDataVersion(Integer dataVersion) {
    this.dataVersion = dataVersion;
  }

  public Boolean getEnableJumpNode() {
    return enableJumpNode;
  }

  public void setEnableJumpNode(Boolean enableJumpNode) {
    this.enableJumpNode = enableJumpNode;
  }
}
