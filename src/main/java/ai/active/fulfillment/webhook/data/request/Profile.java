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

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({

})
public class Profile implements Serializable {

  private static final long serialVersionUID = -4832129033249388404L;
  
  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;
  
  @JsonProperty("middleName")
  private String middleName;

  @JsonProperty("email")
  private String email;

  @JsonProperty("phoneNumber")
  private String phoneNumber;

  @JsonProperty("gender")
  private String gender;

  @JsonProperty("dob")
  private String dob;

  @JsonProperty("locale")
  private String locale;

  @JsonProperty("relationshipStatus")
  private String relationshipStatus;

  @JsonProperty("religion")
  private String religion;

  @JsonProperty("city")
  private String city;

  @JsonProperty("state")
  private String state;

  @JsonProperty("country")
  private String country;

  @JsonProperty("age")
  private String age;

  @JsonProperty("spouseId")
  private String spouseId;

  @JsonProperty("workExpMatch")
  private String workExpMatch;

  @JsonProperty("coverPhotoUrl")
  private String coverPhotoUrl;
  
  @JsonProperty("profileLastupdateDate")
  private String profileLastupdateDate;
  
  @JsonProperty("timeZone")
  private String timeZone;

  @JsonProperty("title")
  private String title;

  @JsonProperty("address")
  private String address;

  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  @JsonProperty("firstName")
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  @JsonProperty("lastName")
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @JsonProperty("middleName")
  public String getMiddleName() {
    return middleName;
  }

  @JsonProperty("middleName")
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  @JsonProperty("email")
  public void setEmail(String email) {
    this.email = email;
  }

  @JsonProperty("phoneNumber")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  @JsonProperty("phoneNumber")
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  @JsonProperty("gender")
  public String getGender() {
    return gender;
  }

  @JsonProperty("gender")
  public void setGender(String gender) {
    this.gender = gender;
  }

  @JsonProperty("dob")
  public String getDob() {
    return dob;
  }

  public void setDob(String dob) {
    this.dob = dob;
  }

  @JsonProperty("locale")
  public String getLocale() {
    return locale;
  }

  @JsonProperty("locale")
  public void setLocale(String locale) {
    this.locale = locale;
  }

  @JsonProperty("relationshipStatus")
  public String getRelationshipStatus() {
    return relationshipStatus;
  }

  @JsonProperty("relationshipStatus")
  public void setRelationshipStatus(String relationshipStatus) {
    this.relationshipStatus = relationshipStatus;
  }

  @JsonProperty("religion")
  public String getReligion() {
    return religion;
  }

  @JsonProperty("religion")
  public void setReligion(String religion) {
    this.religion = religion;
  }

  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  @JsonProperty("city")
  public void setCity(String city) {
    this.city = city;
  }

  @JsonProperty("state")
  public String getState() {
    return state;
  }

  @JsonProperty("state")
  public void setState(String state) {
    this.state = state;
  }

  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  @JsonProperty("country")
  public void setCountry(String country) {
    this.country = country;
  }

  @JsonProperty("age")
  public String getAge() {
    return age;
  }

  @JsonProperty("age")
  public void setAge(String age) {
    this.age = age;
  }

  @JsonProperty("spouseId")
  public String getSpouseId() {
    return spouseId;
  }

  @JsonProperty("spouseId")
  public void setSpouseId(String spouseId) {
    this.spouseId = spouseId;
  }

  @JsonProperty("workExpMatch")
  public String getWorkExpMatch() {
    return workExpMatch;
  }

  @JsonProperty("workExpMatch")
  public void setWorkExpMatch(String workExpMatch) {
    this.workExpMatch = workExpMatch;
  }

  @JsonProperty("coverPhotoUrl")
  public String getCoverPhotoUrl() {
    return coverPhotoUrl;
  }

  @JsonProperty("coverPhotoUrl")
  public void setCoverPhotoUrl(String coverPhotoUrl) {
    this.coverPhotoUrl = coverPhotoUrl;
  }

  @JsonProperty("profileLastupdateDate")
  public String getProfileLastupdateDate() {
    return profileLastupdateDate;
  }

  @JsonProperty("profileLastupdateDate")
  public void setProfileLastupdateDate(String profileLastupdateDate) {
    this.profileLastupdateDate = profileLastupdateDate;
  }

  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }

  @JsonProperty("timeZone")
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this).toString();
  }

}
