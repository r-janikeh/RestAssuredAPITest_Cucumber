package buildTestData;

import googleAPI.AddPlace;
import googleAPI.Location;

import java.util.ArrayList;
import java.util.List;

public class TestData {

    public AddPlace addPlace(String name, String language, String address) {
        AddPlace addPlace = new AddPlace();

        addPlace.setAccuracy(50);
        addPlace.setAddress(address);
        addPlace.setLanguage(language);
        addPlace.setPhone_number("(+91) 983 893 3937");
        addPlace.setWebsite("http://google.com");
        addPlace.setName(name);

        List<String> list = new ArrayList<>();
        list.add("shoe par");
        list.add("shop");
        addPlace.setTypes(list);
        addPlace.setLocation(new Location());

        return addPlace;


    }

    public String deletePlacePayload(String placeid) {
        return "{ \"place_id\": \""+ placeid+ "\"}";
    }

    public AddPlace serializationAddPlace() {
        return addPlace(
                "Frontline hous",
                "French-IN",
                "29, side layout, cohen 09"

        );
    }

    public AddPlace serializationAddPlace(String name, String language, String address) {
        return addPlace(name,language, address);
    }
}
