package tw.fpg.com;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

public class JsonObjectTest {
    public JsonObjectTest() {
        super();
    }
    //        {
    //             "firstName": "John",
    //             "lastName": "Smith",
    //             "age": 25,
    //             "address" : {
    //                 "streetAddress": "21 2nd Street",
    //                 "city": "New York",
    //                 "state": "NY",
    //                 "postalCode": "10021"
    //             },
    //             "phoneNumber": [
    //                 { "type": "home", "number": "212 555-1234" },
    //                 { "type": "fax", "number": "646 555-4567" }
    //             ]
    //         }
    //             JsonObject Json = new JsonObject();
    public JsonObject toJson() {
        JsonObjectBuilder value = Json.createObjectBuilder()
                                      .add("firstName", "John")
                                      .add("lastName", "Smith")
                                      .add("age", 25)
                                      .add("address", Json.createObjectBuilder()
                                                          .add("streetAddress", "21 2nd Street")
                                                          .add("city", "New York")
                                                          .add("state", "NY")
                                                          .add("postalCode", "10021"))
                                      .add("phoneNumber", Json.createArrayBuilder()
                                                              .add(Json.createObjectBuilder()
                                                                       .add("type", "home")
                                                                       .add("number", "212 555-1234"))
                                                              .add(Json.createObjectBuilder()
                                                                       .add("type", "fax")
                                                                       .add("number", "646 555-4567")));
        return value.build();
    }
}
