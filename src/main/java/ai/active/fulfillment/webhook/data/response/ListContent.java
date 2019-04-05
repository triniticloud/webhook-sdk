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

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"list", "buttons"})
public class ListContent implements Serializable {
  private static final long serialVersionUID = -1759045313387280359L;
  @JsonProperty("list")
  private java.util.List<Content> list = null;
  @JsonProperty("buttons")
  private java.util.List<Object> buttons = null;

  @JsonProperty("list")
  public java.util.List<Content> getList() {
    return list;
  }

  @JsonProperty("list")
  public void setList(java.util.List<Content> list) {
    this.list = list;
  }

  @JsonProperty("buttons")
  public java.util.List<Object> getButtons() {
    return buttons;
  }

  @JsonProperty("buttons")
  public void setButtons(java.util.List<Object> buttons) {
    this.buttons = buttons;
  }
}
