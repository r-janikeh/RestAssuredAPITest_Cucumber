# TestSuite
Feature: Validating place API

  # Testcase
  @AddPlace
  Scenario: Verify if place is being Successfully added using AddPlaceAPI
    Given Add Place Payload
    When User calls "ADD_PLACE_API" with "post" http request
    Then the API call got success with statusCode 200
    And "status" in response body is "OK"

  Scenario Outline: Verify if place is being Successfully added using AddPlaceAPI and Examples.
    Given Add Place Payload "<name>", "<language>", "<address>"
    When User calls "ADD_PLACE_API" with "post" http request
    Then the API call got success with statusCode 200
    And "status" in response body is "OK"

    Examples:
    |name   |language |address           |
    |AAHouse|English  |World Cross Center|
    |BBHouse|Spanish  |Sea Cross Center  |

  Scenario Outline: Verify if place is being Successfully added using AddPlaceAPI and Examples.
    Given Add Place Payload "<name>", "<language>", "<address>"
    When User calls "ADD_PLACE_API" with "post" http request
    Then the API call got success with statusCode 200
    And "status" in response body is "OK"
    And verify place_id created maps to "<name>" using "GET_PLACE_API"

    Examples:
      |name   |language |address           |
      |AAHouse|English  |World Cross Center|
      |BBHouse|Spanish  |Sea Cross Center  |

  @DeletePlace
  Scenario: Verify if deletePlace functionality is working
    Given DeletePlace Payload
    When User calls "DELETE_PLACE_API" with "post" http request
    Then the API call got success with statusCode 200
    And "status" in response body is "OK"


