/*
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
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * Modify at your own risk.
 */

package com.google.api.services.consumersurveys.model;

/**
 * Message defining the Survey collections for the REST API.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Consumer Surveys API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Survey extends com.google.api.client.json.GenericJson {

  /**
   * Optional ideal number of days that the survey should complete in. Fractional values are
   * supported. Note that the survey may complete in a shorter or longer period of time than
   * requested, but it will not complete in a significantly shorter period than requested.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float approximateDaysToComplete;

  /**
   * Targeting criteria message containing demographic information
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SurveyAudience audience;

  /**
   * Cost to run the survey and collect the necessary number of responses.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SurveyCost cost;

  /**
   * Additional information to store on behalf of the API consumer and associate with this question.
   * This binary blob is treated as opaque. This field is limited to 64K bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customerData;

  /**
   * Text description of the survey.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * JSON string defining the survey specification and definitions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String jsonSpec;

  /**
   * List of email addresses for survey owners. Must contain at least the address of the user making
   * the API call.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> owners;

  /**
   * List of questions defining the survey.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SurveyQuestion> questions;

  /**
   * Survey frequency for recurring surveys that are run on a repeated basis.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String recurringFrequency;

  /**
   * State that the survey is in. Can be modified to start, stop, or pause survey.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Unique survey ID, that is viewable in the URL of the Survey Creator UI
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String surveyUrlId;

  /**
   * Optional name that will be given to the survey.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Number of responses desired for the survey.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer wantedResponseCount;

  /**
   * Optional ideal number of days that the survey should complete in. Fractional values are
   * supported. Note that the survey may complete in a shorter or longer period of time than
   * requested, but it will not complete in a significantly shorter period than requested.
   * @return value or {@code null} for none
   */
  public java.lang.Float getApproximateDaysToComplete() {
    return approximateDaysToComplete;
  }

  /**
   * Optional ideal number of days that the survey should complete in. Fractional values are
   * supported. Note that the survey may complete in a shorter or longer period of time than
   * requested, but it will not complete in a significantly shorter period than requested.
   * @param approximateDaysToComplete approximateDaysToComplete or {@code null} for none
   */
  public Survey setApproximateDaysToComplete(java.lang.Float approximateDaysToComplete) {
    this.approximateDaysToComplete = approximateDaysToComplete;
    return this;
  }

  /**
   * Targeting criteria message containing demographic information
   * @return value or {@code null} for none
   */
  public SurveyAudience getAudience() {
    return audience;
  }

  /**
   * Targeting criteria message containing demographic information
   * @param audience audience or {@code null} for none
   */
  public Survey setAudience(SurveyAudience audience) {
    this.audience = audience;
    return this;
  }

  /**
   * Cost to run the survey and collect the necessary number of responses.
   * @return value or {@code null} for none
   */
  public SurveyCost getCost() {
    return cost;
  }

  /**
   * Cost to run the survey and collect the necessary number of responses.
   * @param cost cost or {@code null} for none
   */
  public Survey setCost(SurveyCost cost) {
    this.cost = cost;
    return this;
  }

  /**
   * Additional information to store on behalf of the API consumer and associate with this question.
   * This binary blob is treated as opaque. This field is limited to 64K bytes.
   * @see #decodeCustomerData()
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomerData() {
    return customerData;
  }

  /**
   * Additional information to store on behalf of the API consumer and associate with this question.
   * This binary blob is treated as opaque. This field is limited to 64K bytes.
   * @see #getCustomerData()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeCustomerData() {
    return com.google.api.client.util.Base64.decodeBase64(customerData);
  }

  /**
   * Additional information to store on behalf of the API consumer and associate with this question.
   * This binary blob is treated as opaque. This field is limited to 64K bytes.
   * @see #encodeCustomerData()
   * @param customerData customerData or {@code null} for none
   */
  public Survey setCustomerData(java.lang.String customerData) {
    this.customerData = customerData;
    return this;
  }

  /**
   * Additional information to store on behalf of the API consumer and associate with this question.
   * This binary blob is treated as opaque. This field is limited to 64K bytes.
   * @see #setCustomerData()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public Survey encodeCustomerData(byte[] customerData) {
    this.customerData = com.google.api.client.util.Base64.encodeBase64URLSafeString(customerData);
    return this;
  }

  /**
   * Text description of the survey.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Text description of the survey.
   * @param description description or {@code null} for none
   */
  public Survey setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * JSON string defining the survey specification and definitions.
   * @return value or {@code null} for none
   */
  public java.lang.String getJsonSpec() {
    return jsonSpec;
  }

  /**
   * JSON string defining the survey specification and definitions.
   * @param jsonSpec jsonSpec or {@code null} for none
   */
  public Survey setJsonSpec(java.lang.String jsonSpec) {
    this.jsonSpec = jsonSpec;
    return this;
  }

  /**
   * List of email addresses for survey owners. Must contain at least the address of the user making
   * the API call.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getOwners() {
    return owners;
  }

  /**
   * List of email addresses for survey owners. Must contain at least the address of the user making
   * the API call.
   * @param owners owners or {@code null} for none
   */
  public Survey setOwners(java.util.List<java.lang.String> owners) {
    this.owners = owners;
    return this;
  }

  /**
   * List of questions defining the survey.
   * @return value or {@code null} for none
   */
  public java.util.List<SurveyQuestion> getQuestions() {
    return questions;
  }

  /**
   * List of questions defining the survey.
   * @param questions questions or {@code null} for none
   */
  public Survey setQuestions(java.util.List<SurveyQuestion> questions) {
    this.questions = questions;
    return this;
  }

  /**
   * Survey frequency for recurring surveys that are run on a repeated basis.
   * @return value or {@code null} for none
   */
  public java.lang.String getRecurringFrequency() {
    return recurringFrequency;
  }

  /**
   * Survey frequency for recurring surveys that are run on a repeated basis.
   * @param recurringFrequency recurringFrequency or {@code null} for none
   */
  public Survey setRecurringFrequency(java.lang.String recurringFrequency) {
    this.recurringFrequency = recurringFrequency;
    return this;
  }

  /**
   * State that the survey is in. Can be modified to start, stop, or pause survey.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * State that the survey is in. Can be modified to start, stop, or pause survey.
   * @param state state or {@code null} for none
   */
  public Survey setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Unique survey ID, that is viewable in the URL of the Survey Creator UI
   * @return value or {@code null} for none
   */
  public java.lang.String getSurveyUrlId() {
    return surveyUrlId;
  }

  /**
   * Unique survey ID, that is viewable in the URL of the Survey Creator UI
   * @param surveyUrlId surveyUrlId or {@code null} for none
   */
  public Survey setSurveyUrlId(java.lang.String surveyUrlId) {
    this.surveyUrlId = surveyUrlId;
    return this;
  }

  /**
   * Optional name that will be given to the survey.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Optional name that will be given to the survey.
   * @param title title or {@code null} for none
   */
  public Survey setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * Number of responses desired for the survey.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getWantedResponseCount() {
    return wantedResponseCount;
  }

  /**
   * Number of responses desired for the survey.
   * @param wantedResponseCount wantedResponseCount or {@code null} for none
   */
  public Survey setWantedResponseCount(java.lang.Integer wantedResponseCount) {
    this.wantedResponseCount = wantedResponseCount;
    return this;
  }

  @Override
  public Survey set(String fieldName, Object value) {
    return (Survey) super.set(fieldName, value);
  }

  @Override
  public Survey clone() {
    return (Survey) super.clone();
  }

}
