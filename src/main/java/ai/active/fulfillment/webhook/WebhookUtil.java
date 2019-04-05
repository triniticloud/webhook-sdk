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

package ai.active.fulfillment.webhook;

import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.security.crypto.codec.Hex;

/**
 * @author Shashank Sh.
 *
 */
public class WebhookUtil {

  private static final String SHA1 = "sha1=";

  private static final String HMAC_SHA1_ALGORITHM = "HmacSHA1";

  public static String generateSignature(String request, String secret) throws NoSuchAlgorithmException, InvalidKeyException {
    Mac mac = Mac.getInstance(HMAC_SHA1_ALGORITHM);
    SecretKeySpec signingKey = new SecretKeySpec(secret.getBytes(StandardCharsets.UTF_8), HMAC_SHA1_ALGORITHM);
    mac.init(signingKey);
    byte[] rawHmac = mac.doFinal(request.getBytes(StandardCharsets.UTF_8));
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(SHA1);
    stringBuilder.append(Hex.encode(rawHmac));
    return stringBuilder.toString();
  }

}
