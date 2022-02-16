package helpers;


import model.Pet;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import io.restassured.path.json.JsonPath;
import com.github.javafaker.Faker;
import com.google.gson.Gson;
import org.junit.jupiter.api.BeforeAll;
import resources.PetResource;


import static io.restassured.RestAssured.given;



public class BaseTest {
	protected static RequestSpecification defaultRequest;
    protected static ResponseSpecification defaultResponse;
    protected Gson gson = new Gson();
    //public Random faker = new Random();
    public Faker faker = new Faker();
    
    @BeforeAll
    public static void beforeClass() {
        RestAssuredHelper configurator = new RestAssuredHelper();
        defaultRequest = configurator.requestSpec();
        defaultResponse = configurator.responseSpec();
    }
    
    public Pet createPetWithId(int petId){
        Pet pet = PetResource.generatePetWithId(petId);
        given()
                .spec(defaultRequest).log().all()
                .body(gson.toJson(pet))
                .when()
                .post("/pet")
                .then()
                .log().all()
                .spec(defaultResponse);
        return pet;
    }

    public JsonPath getPetFromTheStoreById(int petId, int statusCode){
        return given()
                .spec(defaultRequest).log().all()
                .when()
                .get("/pet/"+petId)
                .then()
                .log().all()
                .statusCode(statusCode)
                .extract()
                .jsonPath();
    }

    public JsonPath removePetFromTheStoreById(int petId){
         return given()
                 .spec(defaultRequest)
                 .when()
                 .delete("/pet/"+petId)
                 .then()
                 .log().all()
                 .statusCode(200).extract().jsonPath();
    }
   
    
    
    
}
