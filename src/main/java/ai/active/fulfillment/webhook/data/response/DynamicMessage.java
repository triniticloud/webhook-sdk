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

/**
 * @author Shashank Sh.
 *
 */
public class DynamicMessage extends AbstractMessage {

  private static final long serialVersionUID = -5184670312445561846L;
  
  protected static final String TYPE = "dynamic";

  private String id;
  private String base;
  private AbstractMessage content;

  /*
   * (non-Javadoc)
   * 
   * @see ai.active.fulfillment.webhook.data.response.AbstractMessage#getContent()
   */
  @Override
  public AbstractMessage getContent() {
    return content;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setContent(AbstractMessage content) {
    this.content = content;
  }

  public String getBase() {
    return base;
  }

  public void setBase(String base) {
    this.base = base;
  }

}
