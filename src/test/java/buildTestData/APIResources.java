package buildTestData;


// Enum is special class which has collection of constants and methods
public enum APIResources {

    ADD_PLACE_API("/maps/api/place/add/json"),
    GET_PLACE_API("/maps/api/place/get/json"),
    DELETE_PLACE_API("/maps/api/place/delete/json");

    private String uri;

    APIResources(String uri) {
        this.uri = uri;
    }

    public String getUri() {
        return uri;
    }
}
