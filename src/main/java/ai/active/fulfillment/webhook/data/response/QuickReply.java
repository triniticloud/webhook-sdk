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
@JsonPropertyOrder({"type", "title", "payload", "image_url"})
public class QuickReply
    implements Serializable {

  private static final long serialVersionUID = 5270925252792966501L;
  @JsonProperty("type")
  private String type;
  @JsonProperty("title")
  private String title;
  @JsonProperty("payload")
  private String payload;
  @JsonProperty("image_url")
  private String imageUrl;

  @JsonProperty("type")
  public String getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(String type) {
    this.type = type;
  }

  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  @JsonProperty("title")
  public void setTitle(String title) {
    this.title = title;
  }

  @JsonProperty("payload")
  public String getPayload() {
    return payload;
  }

  @JsonProperty("payload")
  public void setPayload(String payload) {
    this.payload = payload;
  }

  @JsonProperty("image_url")
  public String getImageUrl() {
    return imageUrl;
  }

  @JsonProperty("image_url")
  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this).append("type", type).append("title", title).append("payload", payload).append("imageUrl", imageUrl)
        .toString();
  }

}
