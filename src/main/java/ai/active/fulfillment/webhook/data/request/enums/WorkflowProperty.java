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
package ai.active.fulfillment.webhook.data.request.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Pranay Kh.
 */
public enum  WorkflowProperty {

  NODE("node"),
  WORKFLOW("workflow");

  private static final Map<String, WorkflowProperty> CONSTANTS = new HashMap<>();

  private String value;

  static {
    for (WorkflowProperty c : values()) {
      CONSTANTS.put(c.value, c);
    }
  }

  WorkflowProperty(String value) {
    this.value = value;
  }

  @JsonCreator
  public static WorkflowProperty fromValue(String value) {
    WorkflowProperty constant = CONSTANTS.get(value);
    if (constant == null) {
      throw new IllegalArgumentException(value);
    }
    else {
      return constant;
    }
  }

  @Override
  public String toString() {
    return this.value;
  }

  @JsonValue
  public String value() {
    return this.value;
  }
}
