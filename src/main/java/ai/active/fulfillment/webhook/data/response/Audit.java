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
@JsonPropertyOrder({"sub_intent", "step", "transaction_id", "transaction_type"})
public class Audit implements Serializable {

  private static final long serialVersionUID = -7397974993814211024L;
  @JsonProperty("sub_intent")
  private String subIntent;
  @JsonProperty("step")
  private String step;
  @JsonProperty("transaction_id")
  private String transactionId;
  @JsonProperty("transaction_type")
  private String transactionType;

  @JsonProperty("sub_intent")
  public String getSubIntent() {
    return subIntent;
  }

  @JsonProperty("sub_intent")
  public void setSubIntent(String subIntent) {
    this.subIntent = subIntent;
  }

  @JsonProperty("step")
  public String getStep() {
    return step;
  }

  @JsonProperty("step")
  public void setStep(String step) {
    this.step = step;
  }

  @JsonProperty("transaction_id")
  public String getTransactionId() {
    return transactionId;
  }

  @JsonProperty("transaction_id")
  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  @JsonProperty("transaction_type")
  public String getTransactionType() {
    return transactionType;
  }

  @JsonProperty("transaction_type")
  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this).append("subIntent", subIntent).append("step", step).append("transactionId", transactionId)
        .append("transactionType", transactionType).toString();
  }

}
