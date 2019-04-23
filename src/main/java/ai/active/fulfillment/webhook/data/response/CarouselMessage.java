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

import java.io.Serializable;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class CarouselMessage extends AbstractMessage implements Serializable {

  private static final long serialVersionUID = 8125746124348212739L;
  
  protected static final String TYPE = "carousel";
  
  @JsonProperty("content")
  private List<Content> content = null;

  @JsonProperty("content")
  public List<Content> getContent() {
    return content;
  }

  @JsonProperty("content")
  public void setContent(List<Content> content) {
    this.content = content;
  }


}
