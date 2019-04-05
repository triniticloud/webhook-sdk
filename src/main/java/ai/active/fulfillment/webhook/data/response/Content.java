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
public class Content implements Serializable {

  private static final long serialVersionUID = 1237183270312594134L;
  @JsonProperty("list")
  private java.util.List<Content> list = null;
  @JsonProperty("buttons")
  private java.util.List<Object> buttons = null;
  @JsonProperty("image")
  private String image = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("subtitle")
  private String subtitle = null;

  @JsonProperty("video")
  private String video = null;

  @JsonProperty("markup")
  private String markup = null;

  @JsonProperty("image")
  public String getImage() {
    return this.image;
  }

  @JsonProperty("image")
  public void setImage(String image) {
    this.image = image;
  }

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

  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  @JsonProperty("title")
  public void setTitle(String title) {
    this.title = title;
  }

  @JsonProperty("subtitle")
  public String getSubtitle() {
    return subtitle;
  }

  @JsonProperty("subtitle")
  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }

  @JsonProperty("video")
  public String getVideo() {
    return video;
  }
  
  @JsonProperty("video")
  public void setVideo(String video) {
    this.video = video;
  }

  @JsonProperty("markup")
  public String getMarkup() {
    return markup;
  }

  @JsonProperty("markup")
  public void setMarkup(String markup) {
    this.markup = markup;
  }
}
