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


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"id", "channel_type", "channel_id", "developer_mode", "language_code", "sync"})
public class Bot
    implements Serializable {

  private static final long serialVersionUID = -4564770086015273798L;
  @JsonProperty("id")
  private String id;
  @JsonProperty("channel_type")
  private String channelType;
  @JsonProperty("channel_id")
  private String channelId;
  @JsonProperty("developer_mode")
  private Boolean developerMode;
  @JsonProperty("language_code")
  private String languageCode;
  @JsonProperty("sync")
  private Boolean sync;

  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  @JsonProperty("channel_type")
  public String getChannelType() {
    return channelType;
  }

  @JsonProperty("channel_type")
  public void setChannelType(String channelType) {
    this.channelType = channelType;
  }

  @JsonProperty("channel_id")
  public String getChannelId() {
    return channelId;
  }

  @JsonProperty("channel_id")
  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  @JsonProperty("developer_mode")
  public Boolean getDeveloperMode() {
    return developerMode;
  }

  @JsonProperty("developer_mode")
  public void setDeveloperMode(Boolean developerMode) {
    this.developerMode = developerMode;
  }

  @JsonProperty("language_code")
  public String getLanguageCode() {
    return languageCode;
  }

  @JsonProperty("language_code")
  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }

  @JsonProperty("sync")
  public Boolean getSync() {
    return sync;
  }

  @JsonProperty("sync")
  public void setSync(Boolean sync) {
    this.sync = sync;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this).append("id", id).append("channelType", channelType).append("channelId", channelId)
        .append("developerMode", developerMode).append("languageCode", languageCode).append("sync", sync).toString();
  }

}
