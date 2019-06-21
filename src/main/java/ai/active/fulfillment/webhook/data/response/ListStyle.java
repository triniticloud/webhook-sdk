/*
 * (C) Copyright 2016 Active Intelligence Pte Ltd (http://active.ai/).
 *
 * This software is the confidential and proprietary information of Active Intelligence.
 * ("Confidential Information"). You shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement you entered into with Active
 * Intelligence
 *
 */
package ai.active.fulfillment.webhook.data.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Shashank Sh.
 *
 */
public enum ListStyle {

  @JsonProperty("compact")
  COMPACT("compact"),

  @JsonProperty("large")
  LARGE("large");

  private String style;

  ListStyle(String style) {
    this.style = style;
  }

  public String getStyle() {
    return this.style;
  }

}
