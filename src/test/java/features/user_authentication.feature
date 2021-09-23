#This feature file contains few test scenarios to verify Rest API services
#Author: Mithun A
Feature: 
  Users Authentication
  
  Background:
 Given Headers

   
  @SmokeTest @E2E
  Scenario: Login as Sysadmin
    When I Login With SysAdmin using User Credentials
    Then I Should get SysAdmin User Response
    
  @E2E
  Scenario: Login as PropertyAdmin
		
    And I Login With "PropertyAdmin" using User Credentials
    When I Should get PropertyAdmin User Response
   
  @SmokeTest @E2E
  Scenario: Login as TenantAdmin
    When I Login With TenantAdmin using User Credentials
    Then I Should get TenantAdmin User Response
    
   @SmokeTest @E2E
  Scenario: Login as Teacher
    When I Login With Teacher using User Credentials
    Then I Should get Teacher User Response
    
    
    