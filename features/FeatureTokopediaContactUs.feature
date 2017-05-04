#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
## (Comments)

#Sample Feature Definition Template
@tag
Feature: Test Feature Contact Us in Tokopedia
	I want to give a scam report on tokopedia

@tag1
Scenario: Reports the scam succeeded in Tokopedia
Given I am on Tokopedia contact us
When I click akun
Then System tokopedia display list of problems encountered
When I click laporan scam
Then System tokopedia display laporan scam
When I click Yes, i need another help
Then System tokopedia display form
When I input data in form
Then System tokopedia display title thank you