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
@JsonPropertyOrder({"id", "profile"})
public class User implements Serializable {

  private static final long serialVersionUID = 6613268779717286316L;
  @JsonProperty("id")
  private String id;
  @JsonProperty("channel_id")
  private String channelId;
  @JsonProperty("logged_id")
  private boolean loggedIn;
  @JsonProperty("customer_id")
  private String customerId;
  @JsonProperty("access_token")
  private String accessToken;
  @JsonProperty("profile")
  private Profile profile;
  @JsonProperty("custSeg")
  private String custSeg;

  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  @JsonProperty("profile")
  public Profile getProfile() {
    return profile;
  }

  @JsonProperty("profile")
  public void setProfile(Profile profile) {
    this.profile = profile;
  }

  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public boolean isLoggedIn() {
    return loggedIn;
  }

  public void setLoggedIn(boolean loggedIn) {
    this.loggedIn = loggedIn;
  }

  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this).append("id", id).append("profile", profile).toString();
  }

  public String getCustSeg() {
    return custSeg;
  }

  public void setCustSeg(String custSeg) {
    this.custSeg = custSeg;
  }

}
