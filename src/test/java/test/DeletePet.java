package test;

import helpers.BaseTest;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DeletePet extends BaseTest {
	@Test
    @Tag("Pet")
    public void shouldRemovePetFromTheStore(){
        Random faker = new Random();
		int petId = faker.nextInt(20);
        createPetWithId(petId);
        removePetFromTheStoreById(petId);
        JsonPath response = getPetFromTheStoreById(petId,404);
        assertEquals(response.getInt("code"), 1);
        assertEquals(response.getString("type"), "error");
        assertEquals(response.getString("message"), "Pet not found");
    }
}
