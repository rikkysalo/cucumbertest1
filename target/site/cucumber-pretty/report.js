$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FeatureTokopediaContactUs.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 19,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 21,
  "name": "Test Feature Contact Us in Tokopedia",
  "description": "I want to give a scam report on tokopedia",
  "id": "test-feature-contact-us-in-tokopedia",
  "keyword": "Feature",
  "tags": [
    {
      "line": 20,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 25,
  "name": "Reports the scam succeeded in Tokopedia",
  "description": "",
  "id": "test-feature-contact-us-in-tokopedia;reports-the-scam-succeeded-in-tokopedia",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "I am on Tokopedia contact us",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "I click akun",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "System tokopedia display list of problems encountered",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "I click laporan scam",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "System tokopedia display laporan scam",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "I click Yes, i need another help",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "System tokopedia display form",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "I input data in form",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "System tokopedia display title thank you",
  "keyword": "Then "
});
formatter.match({
  "location": "TestScript.i_am_on_Tokopedia_contact_us()"
});
formatter.result({
  "duration": 136735187180,
  "status": "passed"
});
formatter.match({
  "location": "TestScript.i_click_akun()"
});
formatter.result({
  "duration": 103885396,
  "status": "passed"
});
formatter.match({
  "location": "TestScript.system_tokopedia_display_list_of_problems_encountered()"
});
formatter.result({
  "duration": 8941363,
  "status": "passed"
});
formatter.match({
  "location": "TestScript.i_click_laporan_scam()"
});
formatter.result({
  "duration": 5099667885,
  "status": "passed"
});
formatter.match({
  "location": "TestScript.system_tokopedia_display_laporan_scam()"
});
formatter.result({
  "duration": 4768755,
  "status": "passed"
});
formatter.match({
  "location": "TestScript.i_click_Yes_i_need_another_help()"
});
formatter.result({
  "duration": 5116906566,
  "status": "passed"
});
formatter.match({
  "location": "TestScript.system_tokopedia_display_form()"
});
formatter.result({
  "duration": 5606954,
  "status": "passed"
});
formatter.match({
  "location": "TestScript.i_input_data_in_form()"
});
formatter.result({
  "duration": 6274512412,
  "status": "passed"
});
formatter.match({
  "location": "TestScript.system_tokopedia_display_title_thank_you()"
});
formatter.result({
  "duration": 10081485,
  "status": "passed"
});
});