Feature: vlidationg place API's

Scenario: varify if place is being sucessfully added using apiplace
   Given Add Place Payload
   When user calls "AddPlace" API with Post hhtp request
   Then the API call is sucess with status code 200
   And "status" is varified status is "ok"
   