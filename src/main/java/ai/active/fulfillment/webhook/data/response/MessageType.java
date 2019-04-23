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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.HashMap;
import java.util.Map;

public enum MessageType {
  TEXT(TextMessage.TYPE), LIST(ListMessage.TYPE), BUTTON(ButtonMessage.TYPE), CAROUSEL(CarouselMessage.TYPE), IMAGE(
      ImageMessage.TYPE), VIDEO(VideoMessage.TYPE), CUSTOM(CustomMessage.TYPE), MARKUP(MarkupMessage.TYPE), DYNAMIC(DynamicMessage.TYPE);

  private static final Map<String, MessageType> CONSTANTS = new HashMap<>();

  static {
    for (MessageType c : values()) {
      CONSTANTS.put(c.value, c);
    }
  }

  private String value;

  MessageType(String value) {
    this.value = value;
  }

  @JsonCreator
  public static MessageType fromValue(String value) {
    MessageType constant = CONSTANTS.get(value);
    if (constant == null) {
      throw new IllegalArgumentException(value);
    } else {
      return constant;
    }
  }

  @Override
  public String toString() {
    return this.value;
  }

  @JsonValue
  public final String value() {
    return this.value;
  }
}
