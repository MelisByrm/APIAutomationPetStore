package resources;

import java.util.ArrayList;
import com.github.javafaker.Faker;
import model.PetCategory;
import model.Pet;
import model.PetStatus;
import model.Tag;


public class PetResource {
	
	private static Faker faker = new Faker();
	
	public static Pet generatePetWithId(int id){
        final Tag tag = TagResource.generateTagWithId(faker.number().numberBetween(0,99));
        PetCategory category = CategoryResource.generateCategoryWithId(faker.number().numberBetween(0,99));
        Pet generatedPet = new Pet();
        generatedPet.setId(id);
        generatedPet.setCategory(category);
        generatedPet.setName(faker.name().username());
        generatedPet.setPhotoUrls(new ArrayList<String>());
        generatedPet.setTags(new ArrayList<Tag>() {{
            add(tag);
        }});
        generatedPet.setStatus(PetStatus.AVAILABLE);
        return generatedPet;
    }
}
