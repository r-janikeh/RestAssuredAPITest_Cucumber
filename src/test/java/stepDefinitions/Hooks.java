package stepDefinitions;

import io.cucumber.java.Before;

public class Hooks {

    @Before("@DeletePlace")
    public void beforeScenario(){
        MyStepdefs stepdefs = new MyStepdefs();


        if(MyStepdefs.getPlaceid() == null) {
            stepdefs.addPlacePayload("korea", "Korean", "Daejeon");
            stepdefs.userCallsWithHttpRequest("ADD_PLACE_API", "post");
            stepdefs.verifyPlace_idCreatedMapsToUsing("korea", "GET_PLACE_API");
        }
    }
}
