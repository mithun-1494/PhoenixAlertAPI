#This feature file contains few test scenarios to verify Rest API services
#Author: Mithun A
Feature: 
  Incident Management
	
	@SmokeTest
  Scenario: To Create HardLockDown
    When I Enter Incident Details
    Then Create Incident
   
  #@SmokeTest @E2E
  #Scenario: Login as Sysadmin
#		Given Headers
    #When I Login With SysAdmin using User Credentials
    #Then I Should get SysAdmin User Response
    #
  #@SmokeTest @E2E
  #Scenario: Login as PropertyAdmin
#		Given Headers
    #When I Login With PropertyAdmin using User Credentials
    #Then I Should get PropertyAdmin User Response
    #
  #@SmokeTest @E2E
  #Scenario: Login as TenantAdmin
#		Given Headers
    #When I Login With TenantAdmin using User Credentials
    #Then I Should get TenantAdmin User Response
    #
   #@SmokeTest @E2E
  #Scenario: Login as Teacher
#		Given Headers
    #When I Login With Teacher using User Credentials
    #Then I Should get Teacher User Response
    
    
    