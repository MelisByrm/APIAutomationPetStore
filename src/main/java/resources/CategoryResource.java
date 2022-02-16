
package resources;

import com.github.javafaker.Faker;
import java.util.Random;
import model.PetCategory;

public class CategoryResource {
	
	private static Faker faker = new Faker();
	
	    public static PetCategory generateCategoryWithId(int id){
	    	PetCategory generated = new PetCategory();
	        generated.setId(id);
	        generated.setName(faker.name().username());
	        return generated;
	    }
}
